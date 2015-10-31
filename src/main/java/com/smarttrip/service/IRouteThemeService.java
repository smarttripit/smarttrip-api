package com.smarttrip.service;


import java.util.List;

import com.smarttrip.domain.RouteTheme;

/**
 * @author gaoweibupt@gmail.com
 * @version Date：2015年10月14日下午9:07:16
 */

public interface IRouteThemeService {

	int insert(RouteTheme record);
	
	int deleteByPrimaryKey(String id);
	
	int updateByPrimaryKey(RouteTheme record);
	
	RouteTheme selectByPrimaryKey(String id);
	
	List<RouteTheme> selectByRouteId(String routeId);
	
	List<RouteTheme> selectByThemeId(String themeId);
	
	List<String> selectRouteId(String[] themeId);
}
