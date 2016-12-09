package org.restapi.service.messenger.resource;

import java.util.List;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;

import org.restapi.service.messenger.bean.BeanParamFilter;
import org.restapi.service.messenger.model.Message;
import org.restapi.service.messenger.service.MessageService;

@Path("/messages")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class MyMessages {
	
	
	public MessageService messageService = new MessageService();
	
//	@GET
//	@Produces(MediaType.TEXT_PLAIN)
//	public String getMessages(){
//		
//		return "Hi, Welcome to RestAPI";
//	}
	
//	@GET
//
//	public List<Message> getXMLMessages(){
//		return messageService.getAllMessages();
//	}

	@GET
	@Produces(MediaType.APPLICATION_JSON)
	@Path("/{messageID}")
	public Message test(@PathParam("messageID") long messageID){
		return messageService.getMessage(messageID);
	}

	@GET
	public List<Message> getAllpaginationMessages(@BeanParam BeanParamFilter params){

		if(params.getYear()>0){
			return messageService.getMessagesForYear(params.getYear());
		}
//		if(start>=0&&size>=0){
//		  return messageService.getAllMessagesPaginated(start,size);
//		}
		return messageService.getAllMessages();
	}

	@POST
	public Message addMessage(Message message){

		return messageService.addMessage(message);
	}


	@PUT
	@Path("/{messageID}")
	public Message addMessage(@PathParam("messageID") long messageID, Message message){
         message.setId(messageID);
		return messageService.addMessage(message);
	}

	@DELETE
	@Path("/{messageID}")
	public void deleteMessage(@PathParam("messageID") long messageID){
           messageService.remaveMessage(messageID);
	}


	@Path("/{messageID}/comments")
	public CommentsResource getCommentResource(){

		return new CommentsResource();
	}

}
