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
	 * key有四个：result、sendId、tipCode和tipMsg，其中：
	 * result:可能值有success和failed；
	 * sendId:每次发送都会产生一个不同的id；
	 * tipCode和tipMsg:当result=failed的时候，表示失败情况。
	 * tipCode=threshold,tipMsg=单位时间内发送次数达到上限;
	 * tipCode=unKnownError,tipMsg=发送短信验证码出现未知错误。
	 */
	public Map<String, String> send(String mobileNo);
	
	/**
	 * 验证
	 * @param mobileNo
	 * @param userCode
	 * @return
	 * key有两个：result和msg，其中：
	 * result：可能的取值有right、wrong、expired，对应的msg分别是“验证码正确”、“验证码不正确”、“验证码已过期”。当然也可以更具result的值，自己决定提示信息。
	 */
	public Map<String, String> verify(String mobileNo, String userCode);
}
