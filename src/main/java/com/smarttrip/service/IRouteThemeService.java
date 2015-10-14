package com.smarttrip.service;

import com.smarttrip.domain.RouteTheme;
import com.smarttrip.domain.Schedule;

/**
 * @author gaoweibupt@gmail.com
 * @version Date：2015年10月14日下午9:07:16
 */

public interface IRouteThemeService {

	int insert(RouteTheme record);
	
	int deleteByPrimaryKey(String Id);
	
	int updateByPrimaryKey(RouteTheme record);
	
	Schedule selectByPrimaryKey(String Id);
}
