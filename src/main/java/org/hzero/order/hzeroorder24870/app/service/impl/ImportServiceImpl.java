package org.hzero.order.hzeroorder24870.app.service.impl;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.hzero.boot.imported.app.service.IDoImportService;
import org.hzero.boot.imported.infra.validator.annotation.ImportService;
import org.hzero.order.hzeroorder24870.api.dto.ExcelImportOrderDTO;
import org.hzero.order.hzeroorder24870.domain.entity.HodrSoHeader;
import org.hzero.order.hzeroorder24870.domain.entity.HodrSoLine;
import org.hzero.order.hzeroorder24870.domain.repository.*;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;

import java.io.IOException;
import java.util.Map;


@ImportService(templateCode = "ORDER")
public class ImportServiceImpl implements IDoImportService {

    @Autowired
    private ObjectMapper objectMapper;

    @Autowired
    private HodrCompanyRepository hodrCompanyRepository;

    @Autowired
    private HodrCustomerRepository hodrCustomerRepository;

    @Autowired
    private HodrSoHeaderRepository hodrSoHeaderRepository;

    @Autowired
    private HodrSoLineRepository hodrSoLineRepository;

    @Autowired
    private HodrItemRepository hodrItemRepository;

    @Override
    public Boolean doImport(String data) {
        // 获取自定义参数
        Map<String, Object> args = getArgs();
        try {
            ExcelImportOrderDTO excelImportOrderDTO = objectMapper.readValue(data, ExcelImportOrderDTO.class);

            System.out.println(excelImportOrderDTO);

            HodrSoHeader hodrSoHeader1 = hodrSoHeaderRepository.selectOneByOrderNUmber(excelImportOrderDTO.getOrderNumber());

            if(hodrSoHeader1==null){
                HodrSoHeader hodrSoHeader = new HodrSoHeader();
                hodrSoHeader.setOrderNumber(excelImportOrderDTO.getOrderNumber());
                hodrSoHeader.setCompanyId(hodrCompanyRepository.selectOneByCompanyNumber(excelImportOrderDTO.getCompanyNumber()).getCompanyId());
                hodrSoHeader.setCustomerId(hodrCustomerRepository.selectOneByCustomerNumber(excelImportOrderDTO.getCustomerNumber()).getCustomerId());
                hodrSoHeader.setOrderDate(excelImportOrderDTO.getOrderDate());
                if(excelImportOrderDTO.getOrderStatus().equals("新建")){
                    hodrSoHeader.setOrderStatus("NEW");
                }
                hodrSoHeaderRepository.insert(hodrSoHeader);

            }


            HodrSoLine hodrSoLine = new HodrSoLine();
            BeanUtils.copyProperties(excelImportOrderDTO,hodrSoLine,HodrSoLine.class);
            hodrSoLine.setItemId(hodrItemRepository.selectOneByItemCode(excelImportOrderDTO.getItemCode()).getItemId());
            hodrSoLineRepository.insert(hodrSoLine);


        } catch (IOException e) {
            e.printStackTrace();
            return false;
        }

        return true;
    }
}
