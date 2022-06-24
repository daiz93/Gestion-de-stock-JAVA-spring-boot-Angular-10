package com.demo.gestiondestocks.dto;

import com.demo.gestiondestocks.model.Categorie;
import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.*;

import java.util.List;

@Data
@Builder

public class CategorieDto {
    private Integer id;


    private String codeCategorie;

    private String designation;

    @JsonIgnore
    List<ArticleDto> articles;
// MPAGE DE CATEGORIE VERS CATEGORIE DTO
    public CategorieDto fromEntity (Categorie categorie)
    {
        if (categorie == null)
        {
            //TODO
            return null;
        }
        return CategorieDto.builder()
                .id(categorie.getId())
                .codeCategorie(categorie.getCodeCategorie())
                .designation(categorie.getDesignation())
                .build();

    }

    public Categorie toEntity (CategorieDto categoriedto)
    {
        if (categoriedto == null)
        {
            //TODO
            return  null;
        }
        Categorie categorie = new Categorie();
        categorie.setId(categoriedto.getId());
        categorie.setCodeCategorie(categoriedto.getCodeCategorie());
        categorie.setDesignation(categoriedto.getDesignation());
        return categorie;


    }
}
