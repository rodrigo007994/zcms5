/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.zencherry.zcms;

/**
 *
 * @author rodrigo
 */
public interface User {
    public String getUserId();
    public String getName();
    public String getLastName();
    public String getEmail();
    
    public String setUserId();
    public String setName();
    public String setLastName();
    public String setEmail();
    
}
