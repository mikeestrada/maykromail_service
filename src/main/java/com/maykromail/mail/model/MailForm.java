package com.maykromail.mail.model;

/**
 * Created by Mike on 9/27/2017.
 */
public class MailForm {

    String from;
    String subject;
    String body;

    public String getFrom() {
        return from;
    }

    public void setFrom(String from) {
        this.from = from;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }
}
