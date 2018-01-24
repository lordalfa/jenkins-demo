package it.tai.development.demo;

import java.io.Serializable;

public class MessageDto implements Serializable {

    private String message;


    public MessageDto() {
    }

    public MessageDto(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
