package com.demo.gestiondestocks.model;
import lombok.*;


import javax.persistence.*;
import java.math.BigDecimal;
import java.time.Instant;
import java.util.List;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity
@EqualsAndHashCode(callSuper = true)
@Table(name="vente")

public class Vente extends AbstractEntity {

    @Column(name = "code")
    private String code;

    @Column(name = "datevente")
    private Instant dateVente;



    @ManyToOne
    @JoinColumn(name = "idClient")
    private Client client;

    @OneToMany (mappedBy ="vente")
    List<VenteLigne> venteLignes;
}
