package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.asset.card.disburse response.
 * 
 * @author auto create
 * @since 1.0, 2019-04-08 10:44:21
 */
public class AlipayAssetCardDisburseResponse extends AlipayResponse {

	private static final long serialVersionUID = 1433447638981787163L;

	/** 
	 * 订单号
	 */
	@ApiField("order_no")
	private String orderNo;

	public void setOrderNo(String orderNo) {
		this.orderNo = orderNo;
	}
	public String getOrderNo( ) {
		return this.orderNo;
	}

}
