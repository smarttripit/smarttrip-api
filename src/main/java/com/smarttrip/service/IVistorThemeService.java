/**
 * Date:2015年10月14日下午20:55
 * Copyright (c) 2015, 1361200381@qq.com All Rights Reserved.
 */
package com.smarttrip.service;

import java.util.List;

import org.apache.ibatis.session.RowBounds;

import com.smarttrip.domain.UserProfile;
import com.smarttrip.domain.VistorTheme;

/**
 * 
 * @author zhangjiaxing
 */
public interface IVistorThemeService {
	
	int deleteByPrimaryKey(String id);

    int insert(VistorTheme record);

    VistorTheme selectByPrimaryKey(String id);

    List<VistorTheme> selectAll();

    int updateByPrimaryKey(VistorTheme record);
    
}