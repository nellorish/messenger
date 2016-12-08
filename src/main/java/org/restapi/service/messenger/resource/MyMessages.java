package org.restapi.service.messenger.resource;

import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
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
	@Produces(MediaType.APPLICATION_XML)
	public List<Message> getXMLMessages(){
		return messageService.getAllMessages();
	}
	
	

}
