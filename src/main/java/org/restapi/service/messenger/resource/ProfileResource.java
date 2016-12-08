package org.restapi.service.messenger.resource;

import org.restapi.service.messenger.model.Profile;
import org.restapi.service.messenger.service.ProfileService;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import java.util.List;

/**
 * Created by MadanNellore on 12/8/16.
 */

@Path("/profiles")
@Consumes(MediaType.APPLICATION_JSON)
@Produces(MediaType.APPLICATION_JSON)
public class ProfileResource {


    private ProfileService profileService = new ProfileService();

    @GET
    public List<Profile>getAllProfiles(){

        return profileService.getAllProfiles();
    }

    @GET
    @Path("/{profileName}")
    public Profile getProfile( @PathParam("profileName") String profileName){

        return profileService.getProfile(profileName);
    }

    @PUT
    @Path("/{profileName}")
    public Profile updateProfile( @PathParam("profileName") String profileName,Profile profile){

        profile.setProfileName(profileName);
        return profileService.updateProfile(profile);
    }

    @POST
    public Profile addProfile(Profile profile){

        return profileService.addProfile(profile);
    }

    @DELETE
    @Path("/{profileName}")
    public void removeProfile(@PathParam("profileName") String profileName){
        profileService.removeProfile(profileName);

    }
}
