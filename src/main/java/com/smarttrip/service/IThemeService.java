/**
 * Date:2015年10月14日下午20:55
 * Copyright (c) 2015, 1361200381@qq.com All Rights Reserved.
 */
package com.smarttrip.service;

import java.util.List;
import com.smarttrip.domain.Theme;

/**
 * 
 * @author zhangjiaxing
 */
public interface IThemeService {
	
    int insert(Theme record);
	
	int deleteByPrimaryKey(String id); 

	int updateByPrimaryKey(Theme record);
	
	Theme selectByPrimaryKey(String id);
	
	Theme selectByName(String name);
    
	List<Theme> selectAll();
}