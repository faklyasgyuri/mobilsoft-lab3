package com.example.mobsoft.mobsoft_lab3.repository;

/**
 * Created by mobsoft on 2017. 04. 03..
 */

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

@Module
public class RepositoryModule {

    @Singleton
    @Provides
    public Repository provideRepository() {
        return new SugarOrmRepository();
    }
}