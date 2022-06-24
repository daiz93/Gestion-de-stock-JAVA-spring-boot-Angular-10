package com.demo.gestiondestocks.services;

import com.demo.gestiondestocks.dto.ArticleDto;
import com.demo.gestiondestocks.model.Article;

import java.util.List;

public interface ArticleService {

    ArticleDto save (ArticleDto articleDto);

    ArticleDto findById (Integer id);

    ArticleDto findByCode (Integer id);

    List<ArticleDto> findAll();

    void delete (Integer id);


    ArticleDto findArticleByCode(String codeArticle);

}
