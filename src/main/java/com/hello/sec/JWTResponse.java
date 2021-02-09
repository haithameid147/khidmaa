/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.hello.sec;

public class JWTResponse {

    private long id;
    private String token;
    private String userName;
    private String roles;
    private String status;

    public JWTResponse(long id, String token, String userName, String roles, String status) {
        this.id = id;
        this.token = token;
        this.userName = userName;
        this.roles = roles;
        this.status = status;
    }

    
    
    public JWTResponse(String token, String userName, String roles, String status) {
        this.status = status;
        this.token = token;
        this.userName = userName;
        this.roles = roles;
    }

    public JWTResponse() {

    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }
      
    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getRoles() {
        return roles;
    }

    public void setRoles(String roles) {
        this.roles = roles;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

}
