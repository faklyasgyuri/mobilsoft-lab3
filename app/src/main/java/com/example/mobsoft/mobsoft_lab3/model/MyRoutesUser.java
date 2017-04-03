package com.example.mobsoft.mobsoft_lab3.model;

import com.orm.dsl.Table;

/**
 * Created by mobsoft on 2017. 04. 03..
 */
@Table
public class MyRoutesUser {
    private String username;
    private String email;
    private Integer id;

    public MyRoutesUser() {
    }

    public MyRoutesUser(String username, String email, Integer id) {
        this.username = username;
        this.email = email;
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }
}
