package com.smarttrip.service;

import java.util.List;

import com.smarttrip.domain.Route;

/**
 * @author gaoweibupt@gmail.com
 * @version Date：2015年10月14日下午8:51:57
 */

public interface IRouteService {
	
	Route selectByPrimaryKey(String routeId);	
	
	int insert(Route record);
	
	int deleteByPrimaryKey(String routeId);
	
	int updateByPrimaryKey(Route record);
	
	List<Route> selectByName(String name);
	
	List<Route> selectTop3ByDisplayOrder();
	
	List<Integer> selectPeriods();
	
	List<Route> selectByRegionId(String regionId);
	
	//List<Route> selectByConditions(String firstRegion, String secondRegion, String theme, int period);

	List<Route> selectByConditions(List<String> regionId, List<String> routeId, int[] period, int pageNum, int pageSize, String sortField);
}
