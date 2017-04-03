package com.example.mobsoft.mobsoft_lab3.interactor.route.events;

import com.example.mobsoft.mobsoft_lab3.model.Route;

/**
 * Created by mobsoft on 2017. 04. 03..
 */

public class RemoveRouteEvent {
    private int code;
    private Route route;
    private Throwable throwable;

    public RemoveRouteEvent() {
    }

    public RemoveRouteEvent(int code, Route route, Throwable throwable) {
        this.code = code;
        this.route = route;
        this.throwable = throwable;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public Route getRoute() {
        return route;
    }

    public void setRoute(Route route) {
        this.route = route;
    }

    public Throwable getThrowable() {
        return throwable;
    }

    public void setThrowable(Throwable throwable) {
        this.throwable = throwable;
    }
}
