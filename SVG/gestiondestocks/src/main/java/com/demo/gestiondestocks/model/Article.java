package com.demo.gestiondestocks.model;

import lombok.*;


import javax.persistence.*;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.List;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity
@EqualsAndHashCode(callSuper = true)
@Table(name="article")
public class Article extends AbstractEntity{

    @Column (name = "codearticle")
    private String codeArticle;
    @Column (name = "desigantion")
    private String desigantion;
    @Column (name = "prixUnitaireHt")
    private BigDecimal prixUnitaireHt;
    @Column (name = "tauxtva")
    private BigDecimal tauxTva;
    @Column (name = "prixUnitaireTtc")
    private BigDecimal prixUnitaireTtc;
    @Column (name = "photo")
    private String photo;

    @ManyToOne
    @JoinColumn(name = "idCategorie")
    private Categorie categorie;

    @ManyToOne
    @JoinColumn(name = "idEntreprise")
    private Entreprise Entreprise;



    @OneToMany (mappedBy ="venteLigne")
    List<VenteLigne> venteLignes;

    @OneToMany (mappedBy ="cdeclientligne")
    List<CdeClientLigne> CdeClientLignes;

    @OneToMany (mappedBy ="cdeforunisseurligne")
    List<CdeFournisseurLigne> CdeFournisseurLignes;


    @OneToMany (mappedBy ="mvmstock")
    List<MvmStock> MvmStocks;

}
