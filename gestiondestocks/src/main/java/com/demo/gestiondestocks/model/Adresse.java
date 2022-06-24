package com.demo.gestiondestocks.model;

import lombok.*;

import javax.persistence.Column;

import javax.persistence.Embeddable;


@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode()
@Embeddable

public class Adresse {

    @Column(name = "adresse1")
    private String adresse1;
    @Column (name = "adresse2")
    private String adresse2;
    @Column (name = "adresseVille")
    private String adresseVille;
    @Column (name = "adresseBoitePostale")
    private String adresseBoitePostale;
    @Column (name = "pays")
    private String pays;
}
