package com.epam.cleandesign.srp.service;

import com.epam.cleandesign.srp.bean.Email;

import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

import java.util.Properties;

public class EmailNotificationService {
    private final String HOST = "localhost";
    public void sendEmail(Email email) {
        Properties properties = System.getProperties();
        properties.setProperty("mail.smtp.host", HOST);
        Session session = Session.getDefaultInstance(properties);

        MimeMessage message = new MimeMessage(session);
        try {
            message.setFrom(new InternetAddress(email.getFrom()));
            message.addRecipient(Message.RecipientType.TO, new InternetAddress(email.getTo()));
            message.setSubject(email.getEmailSubject());
            message.setContent(email.getEmailBody(), "text/html; charset=utf-8");

            Transport.send(message);
        } catch (MessagingException e) {
            throw new IllegalStateException(e);
        }
    }

}
