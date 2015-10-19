package com.smarttrip.domain;

import java.util.List;

/**
 * @author gaoweibupt@gmail.com
 * @version Date：2015年10月19日下午9:30:18
 */

public class ClassicalRoute {
    private Route route;
    
    private List<String> routeTheme;

	public Route getRoute() {
		return route;
	}

	public void setRoute(Route route) {
		this.route = route;
	}

	public List<String> getRouteTheme() {
		return routeTheme;
	}

	public void setRouteTheme(List<String> routeTheme) {
		this.routeTheme = routeTheme;
	}
    
}
