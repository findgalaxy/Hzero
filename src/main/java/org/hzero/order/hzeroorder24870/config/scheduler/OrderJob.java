package org.hzero.order.hzeroorder24870.config.scheduler;

import org.hzero.boot.scheduler.infra.annotation.JobHandler;
import org.hzero.boot.scheduler.infra.enums.ReturnT;
import org.hzero.boot.scheduler.infra.handler.IJobHandler;
import org.hzero.boot.scheduler.infra.tool.SchedulerTool;
import org.hzero.order.hzeroorder24870.domain.entity.HodrSoHeader;
import org.hzero.order.hzeroorder24870.domain.repository.HodrSoHeaderRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;
import java.util.Map;

@JobHandler("orderjob")
public class OrderJob implements IJobHandler {

    @Autowired
    private HodrSoHeaderRepository hodrSoHeaderRepository;

    @Override
    public ReturnT execute(Map<String, String> map, SchedulerTool tool) {
        // 刷新任务进度及描述]
        tool.updateProgress(50, "任务执行中...");

        List<HodrSoHeader> hodrSoHeaderList = hodrSoHeaderRepository.select("orderStatus", "APPROVED");

        for (HodrSoHeader hodrSoHeader:hodrSoHeaderList
             ) {
            hodrSoHeader.setOrderStatus("CLOSED");
            hodrSoHeaderRepository.updateByPrimaryKey(hodrSoHeader);
        }

        // 任务日志记录
        tool.info("订单状态设置任务执行成功！");
        return ReturnT.SUCCESS;
    }
}