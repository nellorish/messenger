package org.restapi.service.messenger.service;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import java.util.Map;

import org.restapi.service.messenger.database.DataBaseClass;
import org.restapi.service.messenger.model.Message;

public class MessageService {


	private Map<Long,Message> messages= DataBaseClass.getMessages();


	public MessageService(){

		Message message1 = new Message(1L,"HelloNellore","Nellore");
		Message message2 = new Message(2L,"HelloMadan","Madan");
		 messages.put(1l,message1);
		 messages.put(2L,message2);

	}



	public List<Message> getAllMessages() {

     return new ArrayList<>(messages.values());
	}


	public Message getMessage(Long id){

		return messages.get(id);
	}

	public Message addMessage(Message message){
		message.setId(messages.size()+1);
		messages.put(message.getId(),message);

		return message;
	}

	public Message updateMessage(Message message){
		if(message.getId()<=0){
			return null;
		}
		messages.put(message.getId(),message);

		return message;
	}

	public void remaveMessage(long id){

		 messages.remove(id);
	}

	public List<Message> getMessagesForYear(int year){
		List<Message> messageinYear= new ArrayList<>();
		Calendar cal = Calendar.getInstance();
		 for(Message message : messages.values()){
			 cal.setTime(message.getCreated());

			 if(cal.get(Calendar.YEAR)==year){
				 messageinYear.add(message);
			 }
		 }
		return messageinYear;
	}

	public List<Message> getAllMessagesPaginated(int start, int size){
		List<Message> messaageList = new ArrayList<>(messages.size());
		if(start+size> messaageList.size()) return new ArrayList<Message>();

		return messaageList.subList(start,start+size);
	}



//	public List<Message> getAllMessages(){
//		List<Message> messagelist = new ArrayList<>();
//		Message message1 = new Message(1L,"HelloNellore","Nellore");
//		Message message2 = new Message(2L,"HelloMadan","Madan");
//		messagelist.add(message1);
//		messagelist.add(message2);
//		return messagelist;
//

		
		
		

	
	
	
	
}
