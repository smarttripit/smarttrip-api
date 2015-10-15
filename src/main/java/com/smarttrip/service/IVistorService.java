/**
 * Date:2015年10月14日下午20:55
 * Copyright (c) 2015, 1361200381@qq.com All Rights Reserved.
 */
package com.smarttrip.service;

import java.util.List;
import com.smarttrip.domain.Vistor;

/**
 * 
 * @author zhangjiaxing
 */
public interface IVistorService {
	
    int insert(Vistor record);
	
	int deleteByPrimaryKey(String id); 

<<<<<<< HEAD
    Vistor selectByPrimaryKey(String id);

    int updateByPrimaryKey(Vistor record);
=======
	int updateByPrimaryKey(Vistor record);
	
	Vistor selectByPrimaryKey(String id);
>>>>>>> refs/remotes/origin/master
    
}
