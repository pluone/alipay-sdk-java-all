package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.eco.mycar.maintain.data.update response.
 * 
 * @author auto create
 * @since 1.0, 2019-03-28 10:40:52
 */
public class AlipayEcoMycarMaintainDataUpdateResponse extends AlipayResponse {

	private static final long serialVersionUID = 2468665537561184643L;

	/** 
	 * 具体返回的处理结果
	 */
	@ApiField("info")
	private String info;

	public void setInfo(String info) {
		this.info = info;
	}
	public String getInfo( ) {
		return this.info;
	}

}
