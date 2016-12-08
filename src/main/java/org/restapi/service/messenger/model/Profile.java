package org.restapi.service.messenger.model;

import java.util.Date;

public class Profile {


    private long id;
    private String profileName;
    private String firdtName;
    private String lastName;
    private Date created;

    public String getProfileName() {
        return profileName;
    }

    public void setProfileName(String profileName) {
        this.profileName = profileName;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getFirdtName() {
        return firdtName;
    }

    public void setFirdtName(String firdtName) {
        this.firdtName = firdtName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Date getCreated() {
        return created;
    }

    public void setCreated(Date created) {
        this.created = created;
    }

    public Profile(){

    }

    public Profile(long id, String profileName,String firstName,String lastName){
        this.id=id;
        this.profileName=profileName;
        this.firdtName=firstName;
        this.lastName=lastName;
        this.created= new Date();

    }




}
