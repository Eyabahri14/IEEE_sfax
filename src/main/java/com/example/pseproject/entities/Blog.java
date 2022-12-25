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
public class Blog implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="IdBlog")
    private Long idBlog;

    private String titreB;
    private String descriptionB;
    private String imageB;
    private String dateB;


}
