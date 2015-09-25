/**
 * Date:2015年7月30日下午11:20:52
 * Copyright (c) 2015, songjiesdnu@163.com All Rights Reserved.
 */
package com.smarttrip.service;

import java.util.List;

import org.apache.ibatis.session.RowBounds;

import com.smarttrip.domain.User;

/**
 * 
 * @author songjie
 */
public interface IUserService {
	
	int deleteByPrimaryKey(String id);

    int insert(User record);

    User selectByPrimaryKey(String id);

    int updateByPrimaryKey(User record);
    
    List<User> selectByPage(RowBounds rb);
}