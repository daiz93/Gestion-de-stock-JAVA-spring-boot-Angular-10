package com.demo.gestiondestocks.dto;
import lombok.*;


import javax.persistence.*;
import java.math.BigDecimal;
import java.time.Instant;
import java.util.List;

@Data
@Builder
//@NoArgsConstructor
//@AllArgsConstructor
//@Entity
//@EqualsAndHashCode(callSuper = true)
//@Table(name="VenteDto")

public class VenteDto  {
    private Integer id;

    //@Column(name = "code")
    private String code;

    //@Column(name = "datevente")
    private Instant dateVente;



//    //@ManyToOne
//    //@JoinColumn(name = "idClient")
//    private ClientDto ClientDto;
//
//    //@OneToMany (mappedBy ="VenteDto")
//    List<VenteLigneDto> venteLignes;
}
