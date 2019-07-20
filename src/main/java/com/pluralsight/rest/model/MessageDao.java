package com.pluralsight.rest.model;

public class MessageDao {

    private String content;

    public MessageDao() {
    }

    public MessageDao(String content) {
        this.content = content;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }
}
