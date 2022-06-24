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
@Table(name="venteLigne")

public class VenteLigne extends AbstractEntity{



    @Column(name = "quantite")
    private BigDecimal quantite;

    @Column (name = "prixUnitaireHtVente")
    private BigDecimal prixUnitaireHtVente;
    @Column (name = "tauxtva")
    private BigDecimal tauxTva;
    @Column (name = "prixUnitaireTtcVente")
    private BigDecimal prixUnitaireTtcVente;


//
//    @ManyToOne
//    @JoinColumn(name= "idvente")
//    private Vente vente;
//
//
//    @ManyToOne
//    @JoinColumn(name = "idarticle")
//    private Article article;
}
