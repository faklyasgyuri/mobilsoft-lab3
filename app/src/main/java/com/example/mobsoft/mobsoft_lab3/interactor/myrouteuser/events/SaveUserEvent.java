package com.example.mobsoft.mobsoft_lab3.interactor.myrouteuser.events;

import com.example.mobsoft.mobsoft_lab3.model.MyRoutesUser;

/**
 * Created by gyork on 4/28/17.
 */

public class SaveUserEvent {
    private int code;
    private MyRoutesUser user;
    private Throwable throwable;

    public SaveUserEvent() {
    }

    public SaveUserEvent(int code, MyRoutesUser user, Throwable throwable) {
        this.code = code;
        this.user = user;
        this.throwable = throwable;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public MyRoutesUser getUser() {
        return user;
    }

    public void setUser(MyRoutesUser user) {
        this.user = user;
    }

    public Throwable getThrowable() {
        return throwable;
    }

    public void setThrowable(Throwable throwable) {
        this.throwable = throwable;
    }
}
