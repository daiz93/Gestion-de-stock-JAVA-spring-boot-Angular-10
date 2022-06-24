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
//@Table(name="CommandeClientDto")

public class CommandeClientDto  {
    private Integer id;

    //@Column(name = "code")
    private String code;

    //@Column(name = "datecommande")
    private Instant dateCommande;


    //@ManyToOne
    //@JoinColumn(name = "idClient")
    private ClientDto ClientDto;
//
//   //@OneToMany (mappedBy = "CommandeClientDto")
//    List<CdeClientLigneDto> CdeClientLignes;




}
