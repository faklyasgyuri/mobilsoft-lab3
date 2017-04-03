package com.example.mobsoft.mobsoft_lab3.model;

import java.util.Date;

/**
 * Created by mobsoft on 2017. 04. 03..
 */

public class Route {

    private String routeId;
    private String startPlace;
    private String endPlace;
    private Date routeDate;
    private Integer id;

    public Route() {
    }

    public Route(String routeId, String startPlace, String endPlace, Date routeDate, Integer id) {
        this.routeId = routeId;
        this.startPlace = startPlace;
        this.endPlace = endPlace;
        this.routeDate = routeDate;
        this.id = id;
    }


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getRouteId() {
        return routeId;
    }

    public void setRouteId(String routeId) {
        this.routeId = routeId;
    }

    public String getStartPlace() {
        return startPlace;
    }

    public void setStartPlace(String startPlace) {
        this.startPlace = startPlace;
    }

    public String getEndPlace() {
        return endPlace;
    }

    public void setEndPlace(String endPlace) {
        this.endPlace = endPlace;
    }

    public Date getRouteDate() {
        return routeDate;
    }

    public void setRouteDate(Date routeDate) {
        this.routeDate = routeDate;
    }
}
