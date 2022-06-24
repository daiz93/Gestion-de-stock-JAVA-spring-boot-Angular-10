package com.demo.gestiondestocks.dto;

import lombok.*;

import java.math.BigDecimal;

@Data
@Builder

public class CdeClientLigneDto  {
    private Integer id;


    private BigDecimal quantiteCde;

    private BigDecimal prixUnitaireHtCde;

    private BigDecimal tauxTva;

    private BigDecimal prixUnitaireTtcCde;

    private CommandeClientDto commandeClients;

    private ArticleDto ArticleDto;

// //@ManyToOne
// //@JoinColumn(name = "idcommandeclient")
//    private CommandeClientDto CommandeClientDto;

}
