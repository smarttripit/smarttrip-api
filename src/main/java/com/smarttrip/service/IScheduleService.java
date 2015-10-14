package com.smarttrip.service;

import java.util.List;

import com.smarttrip.domain.Schedule;

/**
 * @author gaoweibupt@gmail.com
 * @version Date：2015年10月14日下午9:06:58
 */

public interface IScheduleService {

	int insert(Schedule record);
	
	int deleteByPrimaryKey(String scheduleId);
	
	int updateByPrimaryKey(Schedule record);
	
	Schedule selectByPrimaryKey(String scheduleId);
}
