package org.restapi.service.messenger.service;

import org.restapi.service.messenger.database.DataBaseClass;
import org.restapi.service.messenger.model.Profile;

import java.awt.color.ProfileDataException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by MadanNellore on 12/8/16.
 */
public class ProfileService {

    private Map<String, Profile> profiles = DataBaseClass.getProfile();

      public ProfileService(){
          Profile profile1 = new Profile(1L, "Madan-Profile","Madan","Nellore");
          Profile profile2 =new Profile(2L, "Manju-Profile","Manju","Dasari");
          profiles.put("Hub",profile1);
          profiles.put("Wife",profile2);

      }

    public List<Profile> getAllProfiles(){

        return new ArrayList<Profile>(profiles.values());
    }

    public Profile getProfile(String profilename){

        return profiles.get(profilename);
    }

    public Profile addProfile(Profile profile){

        profile.setId(profiles.size()+1);
        return profiles.put(profile.getProfileName(),profile);
    }

    public Profile updateProfile(Profile profile){
        if(profile.getProfileName().isEmpty())
            return null;

        return profiles.put(profile.getProfileName(),profile);
    }

    public Profile removeProfile(String profilename){

        return profiles.remove(profilename);
    }
    public static void main(String[] args) {

        ProfileService service = new ProfileService();

        List<Profile> profile = service.getAllProfiles();

        for(Profile item : profile){

            System.out.println(" Print the name "+item.getFirdtName());
        }

    }

}
