package com.demo.gestiondestocks.model;

import lombok.*;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.List;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity
@EqualsAndHashCode
@Table(name="categorie")

public class Categorie extends AbstractEntity{

    @Column (name = "codecategorie")
    private String codeCategorie;
    @Column (name = "designation")
    private String designation;
    @OneToMany(mappedBy = "categorie")
    List<Article> articles;


}
