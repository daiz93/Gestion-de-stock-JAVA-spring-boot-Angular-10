package com.demo.gestiondestocks.dto;

import lombok.*;


@Data
@Builder
public class AdresseDto {
    private Integer id;


    private String adresse1;

    private String adresse2;

    private String adresseVille;

    private String adresseBoitePostale;

    private String pays;
}
