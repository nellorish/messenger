package org.restapi.service.messenger.service;

import java.util.ArrayList;
import java.util.List;

import org.restapi.service.messenger.model.Message;

public class MessageService {

	public List<Message> getAllMessages(){
		List<Message> messagelist = new ArrayList<>();
		Message message1 = new Message(1L,"HelloNellore","Nellore");
		Message message2 = new Message(2L,"HelloMadan","Madan");
		messagelist.add(message1);
		messagelist.add(message2);
		return messagelist;
		

		
		
		
	}	
	
	
	
	
}
