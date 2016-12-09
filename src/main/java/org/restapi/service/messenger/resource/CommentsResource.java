package org.restapi.service.messenger.resource;

import org.restapi.service.messenger.bean.BeanParamFilter;
import org.restapi.service.messenger.model.Comment;
import org.restapi.service.messenger.service.CommentService;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import java.util.List;

/**
 * Created by MadanNellore on 12/8/16.
 */

@Path("/")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class CommentsResource {

     private CommentService commentService = new CommentService();

    @GET
    @Path("/{commentID}")
    public List<Comment> getComments(@BeanParam BeanParamFilter comments, @PathParam("messageID") long messageID){

        return commentService.getAllComments(messageID) ;
    }

    @GET
    @Path("/{commentID}")
    public Comment getComments(@PathParam("messageID") long messageId,@BeanParam BeanParamFilter commentId){

        return commentService.getComment(messageId,commentId.getCommentID());
    }

    @POST
    public Comment addComment(@PathParam("messageID") long messageId,Comment comment){
    return commentService.addComment(messageId,comment);
    }

    @PUT
    @Path("/{commentId}")
    public Comment updateComment(@PathParam("messageID") long messageId,@PathParam("commentId") long commentId,Comment comment){
        comment.setId(commentId);
        return commentService.updateComment(messageId,comment);
    }

    @DELETE
    @Path("/{commentId}")
    public void deleteComment(@PathParam("messageID") long messageId,@PathParam("commentId")long commentId,Comment comment ){

        commentService.removeComment(messageId,commentId);
    }



 }
