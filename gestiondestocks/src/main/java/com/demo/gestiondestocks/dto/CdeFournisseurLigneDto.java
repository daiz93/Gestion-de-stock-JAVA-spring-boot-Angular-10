package com.demo.gestiondestocks.dto;

import lombok.*;


import javax.persistence.*;
import java.math.BigDecimal;

@Data
@Builder

public class CdeFournisseurLigneDto  {

    private Integer id;

//
//    //@ManyToOne
//    //@JoinColumn(name = "idarticle")
//    private ArticleDto ArticleDto;
//
//
//    //@ManyToOne
//    //@JoinColumn(name = "idcommandeFournisseur")
//    private CommandeFournisseurDto CommandeFournisseurDto;


    private BigDecimal quantiteCde;

    private BigDecimal prixUnitaireHtCde;

    private BigDecimal tauxTva;

    private BigDecimal prixUnitaireTtcCde;


}
