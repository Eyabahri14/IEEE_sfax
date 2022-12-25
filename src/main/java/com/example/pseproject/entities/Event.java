package com.example.pseproject.entities;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.Serializable;

@Entity
@Getter
@Setter
@NoArgsConstructor
public class Event implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="IdEvenement")
    private Long idEvenement;

    private String titreEv;
    private String descriptionEv;
    private String imageEv;
    private String dateEv;
    private String lieu;
}
