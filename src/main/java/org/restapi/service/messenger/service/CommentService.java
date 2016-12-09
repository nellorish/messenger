package org.restapi.service.messenger.service;

import org.restapi.service.messenger.database.DataBaseClass;
import org.restapi.service.messenger.model.Comment;
import org.restapi.service.messenger.model.Message;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by MadanNellore on 12/8/16.
 */
public class CommentService {

    private Map<Long,Message> messages = DataBaseClass.getMessages();


    public List<Comment> getAllComments(long messageid){
        Map<Long,Comment> comments = messages.get(messageid).getComments();
        return new ArrayList<>(comments.values());
    }

    public Comment getComment(long messageid,long commentid){
        Map<Long,Comment> comments= messages.get(messageid).getComments();

        return comments.get(commentid);
    }

    public Comment addComment(long messageid,Comment comment){
        Map<Long,Comment> comments = messages.get(messageid).getComments();
        comment.setId(comments.size() + 1);
        return comments.put(comment.getId(),comment);

    }

    public Comment updateComment(long messageid,Comment comment){
        Map<Long,Comment> comments = messages.get(messageid).getComments();
        if(comment.getId()<0){
            return null;
        }
        return comments.put(comment.getId(),comment);
    }

    public void removeComment(long messageid,long commentId){
        Map<Long,Comment> comments = messages.get(messageid).getComments();
        comments.remove(commentId);

    }
}
