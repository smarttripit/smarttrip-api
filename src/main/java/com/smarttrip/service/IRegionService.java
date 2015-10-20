package com.smarttrip.service;

import java.util.List;

import com.smarttrip.domain.Region;

/**
 * @author gaoweibupt@gmail.com
 * @version Date：2015年10月14日下午9:06:40
 */

public interface IRegionService {
	
	int insert(Region record);
	
	int deleteByPrimaryKey(String regionId);
	
	int updateByPrimaryKey(Region record);
	
	Region selectByPrimaryKey(String regionId);
	
	List<Region> selectByFirstRegion(String firstRegion);
}
