/**
 * Date:2015年10月14日下午20:55
 * Copyright (c) 2015, 1361200381@qq.com All Rights Reserved.
 */
package com.smarttrip.service;

import com.smarttrip.domain.Visitor;

/**
 * 
 * @author zhangjiaxing
 */
public interface IVisitorService {
	
    int insert(Visitor record);
	
	int deleteByPrimaryKey(String id); 

    Visitor selectByPrimaryKey(String id);

    int updateByPrimaryKey(Visitor record);
    
    Visitor selectByMobileNo(String mobileNo); 
    
    Visitor selectByEmail(String email); 
    
    Visitor selectByName(String name); 
 
}
