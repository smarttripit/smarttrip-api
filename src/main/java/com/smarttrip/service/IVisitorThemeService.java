/**
 * Date:2015年10月14日下午20:55
 * Copyright (c) 2015, 1361200381@qq.com All Rights Reserved.
 */
package com.smarttrip.service;

import java.util.List;
import com.smarttrip.domain.VisitorTheme;

/**
 * 
 * @author zhangjiaxing
 */
public interface IVisitorThemeService {
	
	int insert(VisitorTheme record);
	
	int deleteByPrimaryKey(String id); 

	int updateByPrimaryKey(VisitorTheme record);
	
	VisitorTheme selectByPrimaryKey(String id);

	List<VisitorTheme> selectByVisitorId(String visitorId);
    
}
