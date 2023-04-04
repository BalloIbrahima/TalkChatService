package com.talkhours.chatservice.Entities;

import org.springframework.data.annotation.Id;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter @Setter @NoArgsConstructor @AllArgsConstructor
public class Utilisateur {
    
    @Id
    private Long id;
    private String nom;
    private String prenom;
    private String email;
    private String username;
    private String numero;
    private String profile;
}
