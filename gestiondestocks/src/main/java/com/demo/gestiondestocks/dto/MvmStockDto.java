package com.demo.gestiondestocks.dto;
import lombok.*;


import javax.persistence.*;
import java.math.BigDecimal;
import java.time.Instant;

@Data
@Builder
//@NoArgsConstructor
//@AllArgsConstructor
//@Entity
//@EqualsAndHashCode(callSuper = true)
//@Table(name="MvmStockDto")

public class MvmStockDto {
    private Integer id;

    //@Column(name = "datemouvement")
    private Instant dateMouvement;

    //@Column(name = "quantiteMv")
    private BigDecimal quantiteMv;

    //@Column (name = "prixUnitaireHtMv")
    private BigDecimal prixUnitaireHtMv;
    //@Column (name = "tauxtva")
    private BigDecimal tauxTva;
    //@Column (name = "prixUnitaireTtcMv")
    private BigDecimal prixUnitaireTtcMv;


//
//    //@ManyToOne
//    //@JoinColumn(name = "idarticle")
//    private ArticleDto ArticleDto;


}
