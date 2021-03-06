/**
 * Date:2015年10月14日下午20:55
 * Copyright (c) 2015, 1361200381@qq.com All Rights Reserved.
 */
package com.smarttrip.service;

import java.util.List;

import com.github.pagehelper.PageInfo;
import com.smarttrip.domain.Comment;

/**
 * 
 * @author zhangjiaxing
 */
public interface ICommentService {
	
	int insert(Comment record);
	
	int deleteByPrimaryKey(String id); 

	int updateByPrimaryKey(Comment record);
	
    Comment selectByPrimaryKey(String id);    
    
    List<Comment> selectByRouteId(String routeId);
    
    int deleteCommentByVisitorId(String visitorId, String[] commentIds);

	PageInfo<Comment> selectCommentByPage(int page, int rows, String visitorId,
			String content, String productType, String commentBeginTime,
			String commentEndTime); 
}
