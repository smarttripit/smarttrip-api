/**
 * Date:2015年7月30日下午11:07:33
 * Copyright (c) 2015, songjiesdnu@163.com All Rights Reserved.
 */
package com.smarttrip.service;


import com.smarttrip.domain.UserProfile;

/**
 * Function: TODO ADD FUNCTION. <br/>
 * date: 2015年7月30日 下午11:07:33 <br/>
 *
 * @author songjiesdnu@163.com
 * @version 
 */
public interface IUserProfileService {
	int deleteByPrimaryKey(String id);

    int insert(UserProfile record);

    UserProfile selectByPrimaryKey(String id);

    int updateByPrimaryKey(UserProfile record);
}

