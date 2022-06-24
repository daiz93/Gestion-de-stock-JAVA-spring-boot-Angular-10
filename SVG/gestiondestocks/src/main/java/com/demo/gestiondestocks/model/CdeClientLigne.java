package com.demo.gestiondestocks.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;


import javax.persistence.*;
import java.math.BigDecimal;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@EqualsAndHashCode(callSuper = true)
@Table(name="cdeClientLigne")

public class CdeClientLigne  extends AbstractEntity{

    @ManyToOne
    @JoinColumn(name = "idarticle")
    private Article article;


    @ManyToOne
    @JoinColumn(name = "idcommandeclient")
    private CommandeClient commandeClient;

    @Column(name = "quantiteCde")
    private BigDecimal quantiteCde;

    @Column (name = "prixUnitaireHtCde")
    private BigDecimal prixUnitaireHtCde;
    @Column (name = "tauxtva")
    private BigDecimal tauxTva;
    @Column (name = "prixUnitaireTtcCde")
    private BigDecimal prixUnitaireTtcCde;
}
