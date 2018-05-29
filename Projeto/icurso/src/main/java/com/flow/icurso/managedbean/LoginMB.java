/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.flow.icurso.managedbean;

import javax.inject.Named;
import javax.enterprise.context.Dependent;

/**
 *
 * @author antoniony.lima
 */
@Named(value = "login")
@Dependent
public class LoginMB {

    private String username;
    private String password;

    /**
     * Creates a new instance of LoginMB
     */
    public LoginMB() {
    }

    public void login(String txt) {

    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    
}
