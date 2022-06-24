package com.demo.gestiondestocks.dto;

import lombok.*;


import javax.persistence.*;
import java.math.BigDecimal;

@Data
@Builder
//@NoArgsConstructor
//@AllArgsConstructor
//@Entity
//@EqualsAndHashCode(callSuper = true)
//@Table(name="VenteLigneDto")

public class VenteLigneDto {
    private Integer id;



    //@Column(name = "quantite")
    private BigDecimal quantite;

    //@Column (name = "prixUnitaireHtVente")
    private BigDecimal prixUnitaireHtVente;
    //@Column (name = "tauxtva")
    private BigDecimal tauxTva;
    //@Column (name = "prixUnitaireTtcVente")
    private BigDecimal prixUnitaireTtcVente;


//
//    //@ManyToOne
//    //@JoinColumn(name= "idvente")
//    private VenteDto VenteDto;
//
//
//    //@ManyToOne
//    //@JoinColumn(name = "idarticle")
//    private ArticleDto ArticleDto;
}
