package com.demo.gestiondestocks.dto;

import lombok.*;


import javax.persistence.*;
import java.util.List;

@Data
@Builder
//@NoArgsConstructor
//@AllArgsConstructor
//@Entity
//@EqualsAndHashCode(callSuper = true)
//@Table(name="EntrepriseDto")

public class EntrepriseDto  {
    private Integer id;

    //@Column(name = "raisonsociale")
    private String raisonSociale;

    //@Column(name = "IFU")
    private Integer ifu;

    //@Embedded
    public AdresseDto AdresseDto;
//
//    //@OneToMany(mappedBy ="ArticleDto")
//    List<ArticleDto> articles;
//
//    //@OneToMany (mappedBy ="UtilisateurDto")
//    List<UtilisateurDto> utilisateurs;
}
