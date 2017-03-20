package com.example.mobsoft.mobsoft_lab3.ui;

/**
 * Created by mobsoft on 2017. 03. 20..
 */

public abstract class Presenter<S> {
    protected S screen;

    public void attachScreen(S screen) {
        this.screen = screen;
    }

    public void detachScreen() {
        this.screen = null;
    }
}
