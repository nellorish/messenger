package org.restapi.service.messenger.model;

import java.util.Date;

/**
 * Created by MadanNellore on 12/8/16.
 */
public class Comment {

    private String message;
    private String author;
    private Date created;


    public Comment(long id, String author, String message){

        this.id=id;
        this.author=author;
        this.message=message;
        this.created =new Date();
    }

    public Long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public Date getCreated() {
        return created;
    }

    public void setCreated(Date created) {
        this.created = created;
    }

    private Long id;

}
