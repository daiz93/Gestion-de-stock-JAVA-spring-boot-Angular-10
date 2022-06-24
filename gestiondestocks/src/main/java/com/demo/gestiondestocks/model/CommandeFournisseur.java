package com.demo.gestiondestocks.model;

import lombok.*;


import javax.persistence.*;
import java.time.Instant;
import java.util.List;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity
@EqualsAndHashCode(callSuper = true)
@Table(name="commandeFournisseur")

public class CommandeFournisseur extends AbstractEntity {

    @Column(name = "code")
    private String code;

    @Column(name = "datecommande")
    private Instant dateCommande;


    @ManyToOne
    @JoinColumn(name = "idFournisseur")
    private Fournisseur fournisseur;
//
//    @OneToMany (mappedBy ="cdeFournisseurLigne")
//    List<CdeFournisseurLigne> cdeFournisseurLigne;
}
