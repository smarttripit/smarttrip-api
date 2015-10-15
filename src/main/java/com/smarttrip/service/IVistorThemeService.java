/**
 * Date:2015年10月14日下午20:55
 * Copyright (c) 2015, 1361200381@qq.com All Rights Reserved.
 */
package com.smarttrip.service;

import java.util.List;
import com.smarttrip.domain.VistorTheme;

/**
 * 
 * @author zhangjiaxing
 */
public interface IVistorThemeService {
	
	int insert(VistorTheme record);
	
	int deleteByPrimaryKey(String id); 
<<<<<<< HEAD
	
=======

>>>>>>> refs/remotes/origin/master
	int updateByPrimaryKey(VistorTheme record);
	
	VistorTheme selectByPrimaryKey(String id);
    
}
