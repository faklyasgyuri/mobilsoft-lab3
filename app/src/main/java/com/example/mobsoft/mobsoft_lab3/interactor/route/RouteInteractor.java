package com.example.mobsoft.mobsoft_lab3.interactor.route;

/**
 * Created by mobsoft on 2017. 04. 03..
 */
import com.example.mobsoft.mobsoft_lab3.MobSoftApplication;
import com.example.mobsoft.mobsoft_lab3.interactor.route.events.GetRouteEvent;
import com.example.mobsoft.mobsoft_lab3.interactor.route.events.RemoveRouteEvent;
import com.example.mobsoft.mobsoft_lab3.interactor.route.events.SaveRouteEvent;
import com.example.mobsoft.mobsoft_lab3.model.Route;
import com.example.mobsoft.mobsoft_lab3.repository.Repository;


import java.util.List;

import javax.inject.Inject;

import de.greenrobot.event.EventBus;

public class RouteInteractor {
    @Inject
    Repository repository;
    @Inject
    EventBus bus;

    public RouteInteractor() {
        MobSoftApplication.injector.inject(this);
    }

    public void getFavourites() {
        GetRouteEvent event = new GetRouteEvent();
        try {
            List<Route> routes = repository.getRoutes();
            event.setTodos(routes);
            bus.post(event);
        } catch (Exception e) {
            event.setThrowable(e);
            bus.post(event);
        }
    }

    public void saveFavourites(Route routes) {

        SaveRouteEvent event = new SaveRouteEvent();
        event.setRoute(routes);
        try {
            repository.saveRoute(routes);
            bus.post(event);
        } catch (Exception e) {
            event.setThrowable(e);
            bus.post(event);
        }
    }

    public void updateFavourites(List<Route> routes) {
        try {
            repository.updateRoutes(routes);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void removeFavourites(Route routes) {
        RemoveRouteEvent event = new RemoveRouteEvent();
        event.setRoute(routes);
        try {
            repository.removeRoute(routes);
            bus.post(event);
        } catch (Exception e) {
            event.setThrowable(e);
            bus.post(event);
        }
    }
}
