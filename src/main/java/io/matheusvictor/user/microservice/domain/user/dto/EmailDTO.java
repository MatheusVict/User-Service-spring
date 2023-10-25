package io.matheusvictor.user.microservice.domain.user.dto;

import java.util.UUID;

public class EmailDTO {
    private UUID userID;
    private String emailTo;
    private String subject;
    private String body;
    public EmailDTO(UUID userId, String emailTo, String subject, String body) {
        this.userID = userId;
        this.emailTo = emailTo;
        this.subject = subject;
        this.body = body;
    }

    public EmailDTO() {
    }

    public UUID getUserID() {
        return userID;
    }

    public void setUserID(UUID userID) {
        this.userID = userID;
    }

    public String getEmailTo() {
        return emailTo;
    }

    public void setEmailTo(String emailTo) {
        this.emailTo = emailTo;
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
