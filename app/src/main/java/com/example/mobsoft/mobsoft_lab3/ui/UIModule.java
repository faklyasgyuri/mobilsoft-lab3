package com.example.mobsoft.mobsoft_lab3.ui;

/**
 * Created by mobsoft on 2017. 03. 20..
 */

import android.content.Context;


import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;
import de.greenrobot.event.EventBus;


import com.example.mobsoft.mobsoft_lab3.ui.addRoute.AddRoutePresenter;
import com.example.mobsoft.mobsoft_lab3.ui.listRoutes.ListRoutesPresenter;
import com.example.mobsoft.mobsoft_lab3.ui.main.MainPresenter;
import com.example.mobsoft.mobsoft_lab3.ui.about.AboutPresenter;
import com.example.mobsoft.mobsoft_lab3.ui.addRoute.AddRoutePresenter;
import com.example.mobsoft.mobsoft_lab3.ui.listRoutes.ListRoutesPresenter;
import com.example.mobsoft.mobsoft_lab3.ui.login.LoginPresenter;



@Module
public class UIModule {
    private Context context;

    public UIModule(Context context) {
        this.context = context;
    }

    @Provides
    public Context provideContext() {
        return context;
    }

    @Provides
    @Singleton
    public MainPresenter provideMainPresenter() {
        return new MainPresenter();
    }

    @Provides
    @Singleton
    public AboutPresenter provideAboutPresenter() {
        return new AboutPresenter();
    }

    @Provides
    @Singleton
    public AddRoutePresenter provideAddRoutePresenter() {
        return new AddRoutePresenter();
    }

    @Provides
    @Singleton
    public ListRoutesPresenter provideListRoutesPresenter() {
        return new ListRoutesPresenter();
    }

    @Provides
    @Singleton
    public LoginPresenter provideLoginPresenter() {
        return new LoginPresenter();
    }

    @Provides
    @Singleton
    public EventBus provideEventBus() {
        return EventBus.getDefault();
    }
}