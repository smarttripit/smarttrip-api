/**
 * Date:2015年10月14日下午20:55
 * Copyright (c) 2015, 1361200381@qq.com All Rights Reserved.
 */
package com.smarttrip.service;

import java.util.List;

import org.apache.ibatis.session.RowBounds;

import com.smarttrip.domain.UserProfile;
import com.smarttrip.domain.Theme;

/**
 * 
 * @author zhangjiaxing
 */
public interface IThemeService {
	
	int deleteByPrimaryKey(String id);

    int insert(Theme record);

    Theme selectByPrimaryKey(String id);

    List<Theme> selectAll();

    int updateByPrimaryKey(Theme record);
    
}