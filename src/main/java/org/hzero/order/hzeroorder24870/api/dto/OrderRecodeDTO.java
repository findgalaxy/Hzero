package org.hzero.order.hzeroorder24870.api.dto;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.hzero.core.base.BaseConstants;
import org.hzero.export.annotation.ExcelColumn;
import org.hzero.export.annotation.ExcelSheet;
import org.hzero.export.render.ValueRenderer;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;


@ApiModel("订单")
@ExcelSheet(zh = "销售订单", en = "Sales Order")
public class OrderRecodeDTO implements Serializable {

	public static final String FIELD_ORDER_NUMBER = "orderNumber";

	@ApiModelProperty(value = "订单编号")
	@ExcelColumn(zh = "订单编号", en = "order_number", showInChildren = true)
	private String orderNumber;

	@ApiModelProperty(value = "公司名称")
	@ExcelColumn(zh = "公司名称", en = "company_name")
	private String companyName;

	@ApiModelProperty(value = "客户名称")
	@ExcelColumn(zh = "客户名称", en = "customer_name")
	private String customerName;

	@ApiModelProperty(hidden = true)
	@ExcelColumn(zh = "订单日期", en = "order_date", pattern = BaseConstants.Pattern.DATE)
	private Date orderDate;

	@ApiModelProperty(value = "订单状态")
	@ExcelColumn(zh = "订单状态", en = "order_status")
	private String orderStatus;

	@ApiModelProperty(hidden = true)
	@ExcelColumn(zh = "行号", en = "line_number")
	private String lineNumber;

	@ApiModelProperty(value = "物料")
	@ExcelColumn(zh = "物料", en = "item_code", order = 4)
	private String itemCode;

	@ApiModelProperty(hidden = true)
	@ExcelColumn(zh = "数量", en = "order_quantity")
	private Long orderQuantity;

	@ApiModelProperty(hidden = true)
	@ExcelColumn(zh = "数量单位", en = "order_quantity_uom")
	private String orderQuantityUom;

	@ApiModelProperty(hidden = true)
	@ExcelColumn(zh = "销售单价", en = "unit_selling_price")
	private BigDecimal unitSellingPrice;

	@ApiModelProperty(hidden = true)
	@ExcelColumn(zh = "金额", en = "netAmount", pattern = BaseConstants.Pattern.TB_ONE_DECIMAL)
	private BigDecimal netAmount;

	@ApiModelProperty(hidden = true)
	@ExcelColumn(zh = "物料描述", en = "description", renderers = RemarkValueRenderer.class)
	private String itemDescription;

	/**
	 * 隐藏id
	 */
	@ApiModelProperty(hidden = true)
	private Long soHeaderId;
	@ApiModelProperty(hidden = true)
	private Long companyId;
	@ApiModelProperty(hidden = true)
	private Long customerId;
	@ApiModelProperty(hidden = true)
	private Long itemId;

	/**
	 * 订单总金额
	 */
	@ApiModelProperty(hidden = true)
	private BigDecimal totalAmount;

	public OrderRecodeDTO() {
	}

	public OrderRecodeDTO(String orderNumber) {
		this.orderNumber = orderNumber;
	}

	public class RemarkValueRenderer implements ValueRenderer {
		@Override
		public Object render(Object value, Object data) {
			OrderRecodeDTO dto = (OrderRecodeDTO) data;
			return "显示备注：" + dto.itemDescription;
		}
	}

	// getter/setter

	public Long getSoHeaderId() {
		return soHeaderId;
	}

	public void setSoHeaderId(Long soHeaderId) {
		this.soHeaderId = soHeaderId;
	}

	public Long getCompanyId() {
		return companyId;
	}

	public void setCompanyId(Long companyId) {
		this.companyId = companyId;
	}

	public Long getCustomerId() {
		return customerId;
	}

	public void setCustomerId(Long customerId) {
		this.customerId = customerId;
	}

	public BigDecimal getTotalAmount() {
		return totalAmount;
	}

	public void setTotalAmount(BigDecimal totalAmount) {
		this.totalAmount = totalAmount;
	}

	public String getOrderNumber() {
		return orderNumber;
	}

	public void setOrderNumber(String orderNumber) {
		this.orderNumber = orderNumber;
	}

	public String getCompanyName() {
		return companyName;
	}

	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public Date getOrderDate() {
		return orderDate;
	}

	public void setOrderDate(Date orderDate) {
		this.orderDate = orderDate;
	}

	public String getOrderStatus() {
		return orderStatus;
	}

	public void setOrderStatus(String orderStatus) {
		this.orderStatus = orderStatus;
	}

	public String getLineNumber() {
		return lineNumber;
	}

	public void setLineNumber(String lineNumber) {
		this.lineNumber = lineNumber;
	}

	public String getItemCode() {
		return itemCode;
	}

	public void setItemCode(String itemCode) {
		this.itemCode = itemCode;
	}

	public Long getOrderQuantity() {
		return orderQuantity;
	}

	public void setOrderQuantity(Long orderQuantity) {
		this.orderQuantity = orderQuantity;
	}

	public String getOrderQuantityUom() {
		return orderQuantityUom;
	}

	public void setOrderQuantityUom(String orderQuantityUom) {
		this.orderQuantityUom = orderQuantityUom;
	}

	public BigDecimal getUnitSellingPrice() {
		return unitSellingPrice;
	}

	public void setUnitSellingPrice(BigDecimal unitSellingPrice) {
		this.unitSellingPrice = unitSellingPrice;
	}

	public BigDecimal getNetAmount() {
		return new BigDecimal(orderQuantity).multiply(unitSellingPrice);
	}

	public void setNetAmount(BigDecimal netAmount) {
		this.netAmount = new BigDecimal(orderQuantity).multiply(unitSellingPrice);
	}

	public String getItemDescription() {
		return itemDescription;
	}

	public Long getItemId() {
		return itemId;
	}

	public void setItemId(Long itemId) {
		this.itemId = itemId;
	}

	public void setItemDescription(String itemDescription) {
		this.itemDescription = itemDescription;
	}

	@Override
	public String toString() {
		return "OrderRecodeDTO{" +
				"orderNumber='" + orderNumber + '\'' +
				", companyName='" + companyName + '\'' +
				", customerName='" + customerName + '\'' +
				", orderDate=" + orderDate +
				", orderStatus='" + orderStatus + '\'' +
				", lineNumber='" + lineNumber + '\'' +
				", itemCode='" + itemCode + '\'' +
				", orderQuantity=" + orderQuantity +
				", orderQuantityUom='" + orderQuantityUom + '\'' +
				", unitSellingPrice=" + unitSellingPrice +
				", netAmount=" + netAmount +
				", itemDescription='" + itemDescription + '\'' +
				", soHeaderId=" + soHeaderId +
				", companyId=" + companyId +
				", customerId=" + customerId +
				", itemId=" + itemId +
				", totalAmount=" + totalAmount +
				'}';
	}
}
