package org.restapi.service.messenger.resource;

import java.util.List;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;

import org.restapi.service.messenger.model.Message;
import org.restapi.service.messenger.service.MessageService;

@Path("/messages")
public class MyMessages {
	
	
	public MessageService messageService = new MessageService();
	
//	@GET
//	@Produces(MediaType.TEXT_PLAIN)
//	public String getMessages(){
//		
//		return "Hi, Welcome to RestAPI";
//	}
	
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public List<Message> getXMLMessages(){
		return messageService.getAllMessages();
	}

	@GET
	@Path("/{messageID}")
	@Produces(MediaType.APPLICATION_JSON)
	public Message test(@PathParam("messageID") long messageID){
		return messageService.getMessage(messageID);
	}

	@POST
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	public Message addMessage(Message message){

		return messageService.addMessage(message);
	}


	@PUT
	@Path("/{messageID}")
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	public Message addMessage(@PathParam("messageID") long messageID, Message message){
         message.setId(messageID);
		return messageService.addMessage(message);
	}

	@DELETE
	@Path("/{messageID}")
	@Produces(MediaType.APPLICATION_JSON)
	public void deleteMessage(@PathParam("messageID") long messageID){
           messageService.remaveMessage(messageID);
	}

}
