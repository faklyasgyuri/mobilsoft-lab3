package com.example.mobsoft.mobsoft_lab3.interactor;

/**
 * Created by mobsoft on 2017. 04. 03..
 */
import com.example.mobsoft.mobsoft_lab3.interactor.myrouteuser.UserInteractor;
import com.example.mobsoft.mobsoft_lab3.interactor.route.RouteInteractor;

import dagger.Module;
import dagger.Provides;
@Module
public class InteractorModule {

    @Provides
    public UserInteractor provideUser(){
        return new UserInteractor();
    }
    @Provides
    public RouteInteractor provideRoutes(){
        return new RouteInteractor();
    }
}
