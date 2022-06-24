package com.demo.gestiondestocks.dto;

import lombok.*;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Data
@Builder
//@NoArgsConstructor
//@AllArgsConstructor
//@Entity
//@EqualsAndHashCode(callSuper = true)
//@Table(name="RolesDto")

public class RolesDto {
    private Integer id;
    //@Column(name = "nom")
    private String nom;

    //@Column(name = "description")
    private String description;
}
