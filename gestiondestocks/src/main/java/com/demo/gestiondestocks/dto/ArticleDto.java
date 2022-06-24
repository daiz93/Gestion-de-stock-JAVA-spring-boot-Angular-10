package com.demo.gestiondestocks.dto;

import com.demo.gestiondestocks.model.Article;
import com.demo.gestiondestocks.model.Categorie;
import lombok.*;
import java.math.BigDecimal;
import java.util.List;

@Data
@Builder

public class ArticleDto {
    private Integer id;


    private String codeArticle;

    private String desigantion;

    private BigDecimal prixUnitaireHt;

    private BigDecimal tauxTva;

    private BigDecimal prixUnitaireTtc;

    private String photo;


    private CategorieDto CategorieDto;


    List<CdeClientLigneDto> cdeClientLignes;





   // //@ManyToOne
   // //@JoinColumn(name = "idEntreprise")
 //   private EntrepriseDto EntrepriseDto;
//
//    //@OneToMany (mappedBy ="VenteLigneDto")
//    List<VenteLigneDto> venteLignes;

//
//    //@OneToMany (mappedBy ="cdeforunisseurligne")
//    List<CdeFournisseurLigneDto> CdeFournisseurLignes;

//
//    //@OneToMany (mappedBy ="MvmStockDto")
//    List<MvmStockDto> MvmStocks;

    public static ArticleDto fromEntity(Article article)
    {
        if (article == null)
        {
            //TODO
            return null;
        }
        return ArticleDto.builder()
                .id(article.getId())
                .codeArticle(article.getCodeArticle())
                .prixUnitaireTtc(article.getPrixUnitaireTtc())
                .build();

    }

    public static Article toEntity (ArticleDto articleDto)
    {
        if (articleDto == null)
        {
            //TODO
            return  null;
        }
        Article article = new Article();

        article.setId(articleDto.getId());
        article.setCodeArticle(articleDto.getCodeArticle());
        article.setDesigantion(articleDto.getDesigantion());
        article.setPrixUnitaireHt(articleDto.getPrixUnitaireHt());
        return article;


    }

}
