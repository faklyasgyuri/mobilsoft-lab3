package com.example.mobsoft.mobsoft_lab3.repository;

import android.content.Context;

import com.example.mobsoft.mobsoft_lab3.model.Credential;
import com.example.mobsoft.mobsoft_lab3.model.MyRoutesUser;
import com.example.mobsoft.mobsoft_lab3.model.Route;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * Created by mobsoft on 2017. 04. 03..
 */

//default repository
public class MemoryRepository implements Repository{

    public static List<MyRoutesUser> myRouteUsers;
    public static List<Route> routes;

    @Override
    public void open(Context context) {
        Route r1 = new Route("1", "BUD", "SYD", new Date(), 1);
        Route r2 = new Route("2", "BUD", "DEB", new Date(), 2);
        Route r3 = new Route("3", "LON", "BUD", new Date(), 3);

        routes = new ArrayList<>();
        routes.add(r1);
        routes.add(r2);
        routes.add(r3);
    }

    @Override
    public void close() {
        //TODO
    }

    @Override
    public List<Credential> getCredential() {
        //TODO
        return null;
    }

    @Override
    public List<MyRoutesUser> getUsers() {
        return myRouteUsers;
    }

    @Override
    public List<Route> getRoutes() {
        return routes;
    }

    @Override
    public void saveRoute(Route route) {
        routes.add(route);
    }

    @Override
    public void updateRoute(Route route) {
        //TODO
    }

    @Override
    public void removeRoute(Route route) {
        routes.remove(route);
    }

    @Override
    public void saveUser(MyRoutesUser user) {
        //TODO
    }

    @Override
    public void updateRoutes(List<Route> routes) {
        //TODO
    }

    @Override
    public boolean isInDB(Credential cred) {
        //TODO
        return false;
    }

    @Override
    public boolean isInDB(MyRoutesUser user) {
        return myRouteUsers.contains(user);
    }

    @Override
    public boolean isInDB(Route route) {
        return routes.contains(route);
    }
}
