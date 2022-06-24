package com.demo.gestiondestocks.model;

import lombok.*;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity
@EqualsAndHashCode(callSuper = true)
@Table(name="roles")

public class Roles extends AbstractEntity{
    @Column(name = "nom")
    private String nom;

    @Column(name = "description")
    private String description;
}
