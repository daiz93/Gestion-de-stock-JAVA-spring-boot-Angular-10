package com.demo.gestiondestocks.dto;

import lombok.*;


import javax.persistence.*;
import java.time.Instant;
import java.util.List;

@Data
@Builder
//@NoArgsConstructor
//@AllArgsConstructor
//@Entity
//@EqualsAndHashCode(callSuper = true)
//@Table(name="CommandeFournisseurDto")

public class CommandeFournisseurDto  {
    private Integer id;

    //@Column(name = "code")
    private String code;

    //@Column(name = "datecommande")
    private Instant dateCommande;


    //@ManyToOne
    //@JoinColumn(name = "idFournisseur")
    private FournisseurDto FournisseurDto;
//
//    //@OneToMany (mappedBy ="CdeFournisseurLigneDto")
//    List<CdeFournisseurLigneDto> CdeFournisseurLigneDto;
}
