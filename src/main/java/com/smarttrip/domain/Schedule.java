package com.smarttrip.domain;

public class Schedule {
    private String scheduleId;

    private String routeId;

    private Integer displayOrder;

    private String scheduleType;

    private String name;

    private String summary;

    private String thumbnail;

    private String link;

    private String direction;

    private String description;

    public String getScheduleId() {
        return scheduleId;
    }

    public void setScheduleId(String scheduleId) {
        this.scheduleId = scheduleId;
    }

    public String getRouteId() {
        return routeId;
    }

    public void setRouteId(String routeId) {
        this.routeId = routeId;
    }

    public Integer getOrder() {
        return displayOrder;
    }

    public void setOrder(Integer order) {
        this.displayOrder = order;
    }

    public String getType() {
        return scheduleType;
    }

    public void setType(String type) {
        this.scheduleType = type;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSummary() {
        return summary;
    }

    public void setSummary(String summary) {
        this.summary = summary;
    }

    public String getThumbnail() {
        return thumbnail;
    }

    public void setThumbnail(String thumbnail) {
        this.thumbnail = thumbnail;
    }

    public String getLink() {
        return link;
    }

    public void setLink(String link) {
        this.link = link;
    }

    public String getDirection() {
        return direction;
    }

    public void setDirection(String direction) {
        this.direction = direction;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}