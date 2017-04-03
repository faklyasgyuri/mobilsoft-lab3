package com.example.mobsoft.mobsoft_lab3.repository;

import android.content.Context;

import com.example.mobsoft.mobsoft_lab3.model.Credential;
import com.example.mobsoft.mobsoft_lab3.model.MyRoutesUser;
import com.example.mobsoft.mobsoft_lab3.model.Route;

import com.orm.SugarContext;
import com.orm.SugarRecord;

import java.util.List;

/**
 * Created by mobsoft on 2017. 04. 03..
 */

public class SugarOrmRepository implements Repository {
    @Override
    public void open(Context context) {
        SugarContext.init(context);
    }

    @Override
    public void close() {
        SugarContext.terminate();
    }

    @Override
    public List<Credential> getCredential() {
        return SugarRecord.listAll(Credential.class);
    }

    @Override
    public List<MyRoutesUser> getUsers() {
        return SugarRecord.listAll(MyRoutesUser.class);
    }

    @Override
    public List<Route> getRoutes() {
        return SugarRecord.listAll(Route.class);
    }

    @Override
    public void saveRoute(Route route) {
        SugarRecord.saveInTx(route);
    }

    @Override
    public void updateRoute(Route route) {
        //TODO
    }

    @Override
    public void removeRoute(Route route) {
        SugarRecord.deleteInTx(route);
    }

    @Override
    public void saveUser(MyRoutesUser user) {
        SugarRecord.saveInTx(user);
    }

    @Override
    public void updateRoutes(List<Route> routes) {
        //TODO
    }

    @Override
    public boolean isInDB(Credential cred) {
        return SugarRecord.findById(Credential.class, cred.getId()) != null;
    }

    @Override
    public boolean isInDB(MyRoutesUser user) {
        return SugarRecord.findById(MyRoutesUser.class, user.getId()) != null;
    }

    @Override
    public boolean isInDB(Route route) {
        return SugarRecord.findById(Route.class, route.getId()) != null;
    }
}
