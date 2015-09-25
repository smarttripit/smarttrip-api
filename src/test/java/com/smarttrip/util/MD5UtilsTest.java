/**
 * Date:2015年7月29日下午10:39:39
 * Copyright (c) 2015, songjiesdnu@163.com All Rights Reserved.
 */
package com.smarttrip.util;

import static org.junit.Assert.*;

import java.security.NoSuchAlgorithmException;

import org.junit.Test;

import com.smarttrip.util.MD5Utils;

/**
 * MD5Utils的单测. <br/>
 * date: 2015年7月29日 下午10:39:39 <br/>
 *
 * @author songjiesdnu@163.com
 * @version 
 * @since JDK 1.6
 */
public class MD5UtilsTest {

	@Test
	public void testEncrypt() throws NoSuchAlgorithmException {
		String input = "123456";
		String md5 = MD5Utils.encrypt(input);
		assertEquals("e10adc3949ba59abbe56e057f20f883e", md5);
	}
}