/**
 * Date:2015年10月14日下午20:55
 * Copyright (c) 2015, 1361200381@qq.com All Rights Reserved.
 */
package com.smarttrip.service;

import java.util.List;

import org.apache.ibatis.session.RowBounds;

import com.smarttrip.domain.UserProfile;
import com.smarttrip.domain.Vistor;

/**
 * 
 * @author zhangjiaxing
 */
public interface IVistorService {
	
	int deleteByPrimaryKey(String id);

    int insert(Vistor record);

    Vistor selectByPrimaryKey(String id);

    List<Vistor> selectAll();

    int updateByPrimaryKey(Vistor record);
    
}