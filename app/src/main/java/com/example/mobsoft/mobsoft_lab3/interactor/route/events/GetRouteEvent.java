package com.example.mobsoft.mobsoft_lab3.interactor.route.events;

import com.example.mobsoft.mobsoft_lab3.model.Route;

import java.util.List;

/**
 * Created by mobsoft on 2017. 04. 03..
 */

public class GetRouteEvent {
    private int code;
    private List<Route> routes;
    private Throwable throwable;

    public GetRouteEvent() {
    }

    public GetRouteEvent(int code, List<Route> routes, Throwable throwable) {
        this.code = code;
        this.routes = routes;
        this.throwable = throwable;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public List<Route> getTodos() {
        return routes;
    }

    public void setTodos(List<Route> routes) {
        this.routes = routes;
    }

    public Throwable getThrowable() {
        return throwable;
    }

    public void setThrowable(Throwable throwable) {
        this.throwable = throwable;
    }
}
