package com.example.mobsoft.mobsoft_lab3.interactor.myrouteuser;

import com.example.mobsoft.mobsoft_lab3.MobSoftApplication;
import com.example.mobsoft.mobsoft_lab3.interactor.myrouteuser.events.SaveUserEvent;
import com.example.mobsoft.mobsoft_lab3.interactor.route.events.RemoveRouteEvent;
import com.example.mobsoft.mobsoft_lab3.interactor.route.events.SaveRouteEvent;
import com.example.mobsoft.mobsoft_lab3.model.MyRoutesUser;
import com.example.mobsoft.mobsoft_lab3.repository.Repository;

import javax.inject.Inject;

import de.greenrobot.event.EventBus;

/**
 * Created by mobsoft on 2017. 04. 03..
 */

public class UserInteractor {
    @Inject
    Repository repository;
    @Inject
    EventBus bus;

    public UserInteractor() {
        MobSoftApplication.injector.inject(this);
    }


    public void saveUser(MyRoutesUser user) {

        SaveUserEvent event = new SaveUserEvent();
        event.setUser(user);
        try {
            repository.saveUser(user);
            bus.post(event);
        } catch (Exception e) {
            event.setThrowable(e);
            bus.post(event);
        }
    }
}
