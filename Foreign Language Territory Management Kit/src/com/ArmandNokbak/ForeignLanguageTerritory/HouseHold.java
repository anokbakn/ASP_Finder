/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.ArmandNokbak.ForeignLanguageTerritory;

import java.io.Serializable;

/**
 *
 * @author Armand Nokbak
 */
public class HouseHold implements Serializable, Comparable<HouseHold>{
    private  String comment;
    private  String tel;
    private String zip;
    private  String city;
    private  String street;
    private  String name;
    private  boolean speakLang;
    private boolean interested;
    // addressType is 0 for master, 1 for telephone, 2 for letter, 3 for do not call
    private  int adressType;
    private  String state;
    
    public HouseHold()
    {
        name = street = city = zip = state = tel = comment = "";
        speakLang = interested =  false;
        adressType = 0;
    }
    /**
     * Setter for name
     * @param n 
     */
    public void setName(String n)
    {
        this.name = n;
    }
    /**
     * Getter for name
     * @return name
     */
    public String getName()
    {
        return this.name;
    }
    /**
     * Setter for street
     * @param s 
     */
    public void setStreet(String s)
    {
        this.street = s;
    }
    /**
     * Getter for Street
     * @return street
     */
    public String getStreet()
    {
        return this.street;
    }
    /**
     * Setter for city
     * @param c 
     */
    public void setCity(String c)
    {
        this.city = c;
    }
    /**
     * Getter for city
     * @return city
     */
    public String getCity()
    {
        return this.city;
    }
    /**
     * The setter for zip code
     * @param z 
     */
    public void setZip(String z)
    {
        this.zip = z;
    }
    /**
     * The getter for zip code
     * @return zip
     */
    public String getZip()
    {
        return this.zip;
    }
    /**
     * Setter for telephone
     * @param t 
     */
    public void setTel(String t)
    {
        this.tel = t;
    }
    /***
     * getter for telephone
     * @return tel
     */
    public String getTel()
    {
        return this.tel;
    }
    /**
     * setter for state
     * @param st 
     */
    public void setState(String st)
    {
        this.state = st;
    }
    /**
     * getter for state
     * @return 
     */
    public String getState()
    {
        return this.state;
    }
    /**
     * setter for comment
     * @param com 
     */
    public void setComment(String com)
    {
        this.comment = com;
    }
    /**
     * getter for comment
     * @return comment
     */
    public String getComment()
    {
        return this.comment;
    }
    /**
     * setter for speakLang (speaks the language)
     * @param lang 
     */
    public void setSpeakLang(Boolean lang)
    {
        this.speakLang = lang;
    }
    /**
     * getter for speakLang (speaks the language)
     * @return speakLang
     */
    public Boolean getSpeakLang()
    {
        return this.speakLang;
    }
    /**
     * setter for interested?
     * @param interest 
     */
    public void setInterested(boolean interest)
    {
        this.interested = interest;
    }
    /**
     * Getter for interested?
     * @return 
     */
    public Boolean getInterested()
    {
        return this.interested;
    }
    /**
     * setter for addressType
     * addressType is 0 for master, 1 for telephone, 2 for letter, 3 for do not call
     * @param type 
     */
    public void setAddressType(int type)
    {
        this.adressType = type;
    }
    /**
     * getter for addressType
     * addressType is 0 for master, 1 for telephone, 2 for letter, 3 for do not call
     * @return addressType
     */
    public int getAddressType()
    {
        return this.adressType;
    }
    public String toString()
    {
        return this.name +"\t"+ this.street +"\t"+"."+"\t"+this.comment+"." +"\t"+this.zip+"\t" +this.city+
                "\t"+this.tel+"\t"+"."+"\t"+this.state+"\t"+this.speakLang+"\t"+
                this.interested+"\t"+this.adressType;
    }

    @Override
    public int compareTo(HouseHold o) {
        String comparedZip4 = o.getZip();
        
        if(this.getZip().compareToIgnoreCase(comparedZip4)<0)
        {
            return -1;
        }
        else if(this.getZip().compareToIgnoreCase(comparedZip4)>0)
        {
            return 1;
        }
        else return 0;
    }
}
