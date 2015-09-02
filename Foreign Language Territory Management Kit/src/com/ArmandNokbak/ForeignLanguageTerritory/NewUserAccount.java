/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.ArmandNokbak.ForeignLanguageTerritory;

import java.io.Serializable;

/**
 *
 * @author anokbakn
 */
public class NewUserAccount implements Serializable{
    private final String userName;
    private  String password;
    private final String congregation;
    private final String email;
    private final String language;
    
    public NewUserAccount(String user, String pwd, String cong, String em, String lang)
    {
        this.userName = user;
        this.password = pwd;
        this.congregation = cong;  
        this.email = em;
        this.language = lang;
    }
    public String getUserName()
    {
        return this.userName;
    }
    public String getLanguage()
    {
        return this.language;
    }
    public String getPwd()
    {
        return this.password;
    }
    public void setPwd(String p)
    {
        this.password = p;
    }
    public String getCongregation()
    {
        return this.congregation;
    }
    public String getEmail()
    {
       return this.email ;
    }
    public String toString()
    {
        return this.userName+ " from the " + this.congregation+ " congregation. Language : "+this.language;
    }
    
}
