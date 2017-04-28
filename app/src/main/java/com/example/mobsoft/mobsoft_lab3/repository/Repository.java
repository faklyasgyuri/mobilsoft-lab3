package com.example.mobsoft.mobsoft_lab3.repository;

/**
 * Created by mobsoft on 2017. 04. 03..
 */

import android.content.Context;

import java.util.List;

import com.example.mobsoft.mobsoft_lab3.model.Credential;
import com.example.mobsoft.mobsoft_lab3.model.MyRoutesUser;
import com.example.mobsoft.mobsoft_lab3.model.Route;


public interface Repository {

    void open(Context context);

    void close();

    List<Credential> getCredential();
    List<MyRoutesUser> getUsers();
    List<Route> getRoutes();

    void saveRoute(Route route);
    void updateRoute(Route route);
    void removeRoute(Route route);

    void updateRoutes(List<Route> routes);

    void saveUser(MyRoutesUser user);

    boolean isInDB(Credential cred);
    boolean isInDB(MyRoutesUser user);
    boolean isInDB(Route route);
}