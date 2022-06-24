package com.demo.gestiondestocks.model;

import lombok.*;


import javax.persistence.*;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity
@EqualsAndHashCode(callSuper = true)
@Table(name="utilisateur")

public class Utilisateur extends AbstractEntity {

    @Column(name = "nom")
    private String nom;
    @Column (name = "prenom")
    private String preNom;
    @Embedded
    public Adresse adresse;
    @Column(name = "photo")
    private String photo;
    @Column (name = "email")
    private String email;
    @Column(name = "tel")
    private String tel;

    @ManyToOne
    @JoinColumn(name = "idEntreprise")
    private Entreprise Entreprise;
}
