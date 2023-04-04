package com.talkhours.chatservice.Entities;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.springframework.data.annotation.Id;
import org.springframework.data.annotation.Transient;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

import com.talkhours.chatservice.Enums.ChatType;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter @Setter @NoArgsConstructor @AllArgsConstructor @ToString
@Document
public class Chat {
    @Id
    private String id;
    private ChatType type;
    private Date date=new Date();

    @DBRef
    List<Message> messages=new ArrayList<>();

    @Transient Set<Utilisateur> utilisateurs=new HashSet<>();

    Set<Long> idUtilisateurs=new HashSet<>();
}
