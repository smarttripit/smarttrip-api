/**
 * Date:2015年10月14日下午20:55
 * Copyright (c) 2015, 1361200381@qq.com All Rights Reserved.
 */
package com.smarttrip.service;

import java.util.List;

import org.apache.ibatis.session.RowBounds;

import com.smarttrip.domain.UserProfile;
import com.smarttrip.domain.Comment;

/**
 * 
 * @author zhangjiaxing
 */
public interface ICommentService {
	
	int deleteByPrimaryKey(String id);

    int insert(Comment record);

    Comment selectByPrimaryKey(String id);

    List<Comment> selectAll();

    int updateByPrimaryKey(Comment record);
    
}