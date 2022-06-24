package com.demo.gestiondestocks.model;

import lombok.*;


import javax.persistence.*;
import java.util.List;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity
@EqualsAndHashCode(callSuper = true)
@Table(name="fournisseur")

public class Fournisseur extends AbstractEntity{

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

    @OneToMany(mappedBy = "fournisseur")
    List<CommandeFournisseur> commandeFournisseurs;


}
