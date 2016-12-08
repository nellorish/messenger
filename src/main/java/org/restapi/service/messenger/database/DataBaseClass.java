package org.restapi.service.messenger.database;

import org.restapi.service.messenger.model.Message;
import org.restapi.service.messenger.model.Profile;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by MadanNellore on 12/8/16.
 */
public class DataBaseClass {

    private static Map<Long, Message> messages= new HashMap<>();
    private static Map<String, Profile> profiles= new HashMap<>();


    public static Map<Long,Message> getMessages(){
        return messages;
    }

    public static Map<String,Profile> getProfile(){

        return profiles;
    }

}
