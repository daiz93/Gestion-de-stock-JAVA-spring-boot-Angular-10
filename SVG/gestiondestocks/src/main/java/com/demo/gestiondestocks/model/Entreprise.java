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
@Table(name="entreprise")

public class Entreprise extends AbstractEntity {

    @Column(name = "raisonsociale")
    private String raisonSociale;

    @Column(name = "IFU")
    private Integer ifu;

    @Embedded
    public Adresse adresse;

    @OneToMany(mappedBy ="article")
    List<Article> articles;

    @OneToMany (mappedBy ="utilisateur")
    List<Utilisateur> utilisateurs;
}
