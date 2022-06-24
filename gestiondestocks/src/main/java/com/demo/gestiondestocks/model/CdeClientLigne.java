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
@Table(name="cdeClientLigne")

public class CdeClientLigne  extends AbstractEntity{


    @Column(name = "quantiteCde")
    private BigDecimal quantiteCde;

    @Column (name = "prixUnitaireHtCde")
    private BigDecimal prixUnitaireHtCde;
    @Column (name = "tauxtva")
    private BigDecimal tauxTva;
    @Column (name = "prixUnitaireTtcCde")
    private BigDecimal prixUnitaireTtcCde;
    @ManyToOne(optional = false)
    private CommandeClient commandeClients;


    @ManyToOne
    @JoinColumn(name = "idArticle")
    private Article article;

// @ManyToOne
// @JoinColumn(name = "idcommandeclient")
//    private CommandeClient commandeClient;

}
