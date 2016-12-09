package org.restapi.service.messenger.bean;

import javax.ws.rs.PathParam;
import javax.ws.rs.QueryParam;

/**
 * Created by MadanNellore on 12/8/16.
 */
public class BeanParamFilter {

    public @QueryParam("year") int year;

    public  @QueryParam("start")int start;

    public @QueryParam("size")int size ;

//    public long getMessageID() {
//        return messageID;
//    }
//
//    public void setMessageID(long messageID) {
//        this.messageID = messageID;
//    }
//
//    public @PathParam("messageID") long messageID;

    public long getCommentID() {
        return commentID;
    }

    public void setCommentID(long commentID) {
        this.commentID = commentID;
    }

    public @PathParam("commentID") long commentID;

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getStart() {
        return start;
    }

    public void setStart(int start) {
        this.start = start;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }
}
