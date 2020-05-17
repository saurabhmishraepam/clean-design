package com.epam.cleandesign.srp.bean;

public class Email {

    private  String to;
    private String from;
    private String emailSubject;
    private String emailBody;

    public Email(String to, String from, String emailSubject, String emailBody) {
        this.to = to;
        this.from = from;
        this.emailSubject = emailSubject;
        this.emailBody = emailBody;
    }

    public String getTo() {
        return to;
    }

    public void setTo(String to) {
        this.to = to;
    }

    public String getFrom() {
        return from;
    }

    public void setFrom(String from) {
        this.from = from;
    }

    public String getEmailSubject() {
        return emailSubject;
    }

    public void setEmailSubject(String emailSubject) {
        this.emailSubject = emailSubject;
    }

    public String getEmailBody() {
        return emailBody;
    }

    public void setEmailBody(String emailBody) {
        this.emailBody = emailBody;
    }
}
