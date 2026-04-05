package com.example.nearbychat;

public class Message {
    private String text;
    private Integer imageResId;
    private boolean sentByMe;

    public Message(String text, Integer imageResId, boolean sentByMe) {
        this.text = text;
        this.imageResId = imageResId;
        this.sentByMe = sentByMe;
    }

    public String getText() {
        return text;
    }

    public Integer getImageResId() {
        return imageResId;
    }

    public boolean isSentByMe() {
        return sentByMe;
    }
}