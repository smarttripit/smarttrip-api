package com.smarttrip.service;

import java.util.Map;

/**
 * 短信验证码服务
 * @author songjiesdnu@163.com
 *
 */
public interface IPhoneAuthCodeService {
	/**
	 * 发送
	 * @param mobileNo
	 * @return
	 */
	public Map<String, String> send(String mobileNo);
	
	/**
	 * 验证
	 * @param mobileNo
	 * @param userCode
	 * @return
	 */
	public Map<String, String> verify(String mobileNo, String userCode);
}
