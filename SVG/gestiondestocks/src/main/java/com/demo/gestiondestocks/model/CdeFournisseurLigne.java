package com.demo.gestiondestocks.model;

import lombok.*;


import javax.persistence.*;
import java.math.BigDecimal;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity
@EqualsAndHashCode(callSuper = true)
@Table(name="cdeFournisseurLigne")

public class CdeFournisseurLigne extends AbstractEntity {


    @ManyToOne
    @JoinColumn(name = "idarticle")
    private Article article;


    @ManyToOne
    @JoinColumn(name = "idcommandeFournisseur")
    private CommandeFournisseur commandeFournisseur;

    @Column(name = "quantiteCde")
    private BigDecimal quantiteCde;

    @Column (name = "prixUnitaireHtCde")
    private BigDecimal prixUnitaireHtCde;
    @Column (name = "tauxtva")
    private BigDecimal tauxTva;
    @Column (name = "prixUnitaireTtcCde")
    private BigDecimal prixUnitaireTtcCde;


}
