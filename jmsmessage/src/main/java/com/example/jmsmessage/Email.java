package com.example.jmsmessage;


import lombok.Data;

@Data
public class Email {
    private String to;
    private String body;

    public Email(String to, String body) {
        this.to = to;
        this.body = body;
    }

    public Email() {
    }
}
