package com.talkhours.chatservice.Entities;

import java.util.Date;

import org.springframework.data.annotation.Id;
import org.springframework.data.annotation.Transient;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter @Setter @NoArgsConstructor @AllArgsConstructor @ToString
@Document
public class Message {
    @Id
    private String id;
    private String description;
    private String file;
    private Date date=new Date();

    @Transient private Utilisateur utilisateur;

    @DBRef
    private Chat chat;
}
