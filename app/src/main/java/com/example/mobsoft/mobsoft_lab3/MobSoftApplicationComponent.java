package com.example.mobsoft.mobsoft_lab3;

/**
 * Created by mobsoft on 2017. 03. 20..
 */


import com.example.mobsoft.mobsoft_lab3.ui.UIModule;
import com.example.mobsoft.mobsoft_lab3.ui.main.MainActivity;

import javax.inject.Singleton;

import dagger.Component;
import com.example.mobsoft.mobsoft_lab3.interactor.InteractorModule;
import com.example.mobsoft.mobsoft_lab3.interactor.route.RouteInteractor;
import com.example.mobsoft.mobsoft_lab3.repository.RepositoryModule;
import com.example.mobsoft.mobsoft_lab3.ui.main.MainPresenter;

import dagger.Component;

@Singleton
@Component(modules = {UIModule.class, RepositoryModule.class, InteractorModule.class})
public interface MobSoftApplicationComponent {
    void inject(MainActivity mainActivity);

    void inject(RouteInteractor routeInteractor);

    void inject(MobSoftApplication mobSoftApplication);

    void inject(MainPresenter mainPresenter);
}