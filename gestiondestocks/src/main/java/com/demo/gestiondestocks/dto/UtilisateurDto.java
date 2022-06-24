package com.demo.gestiondestocks.dto;

import lombok.*;


import javax.persistence.*;

@Data
@Builder
//@NoArgsConstructor
//@AllArgsConstructor
//@Entity
//@EqualsAndHashCode(callSuper = true)
//@Table(name="UtilisateurDto")

public class UtilisateurDto  {
    private Integer id;

    //@Column(name = "nom")
    private String nom;
    //@Column (name = "prenom")
    private String preNom;
    //@Embedded
    public AdresseDto AdresseDto;
    //@Column(name = "photo")
    private String photo;
    //@Column (name = "email")
    private String email;
    //@Column(name = "tel")
    private String tel;
//
//    //@ManyToOne
//    //@JoinColumn(name = "idEntreprise")
//    private EntrepriseDto EntrepriseDto;
}
