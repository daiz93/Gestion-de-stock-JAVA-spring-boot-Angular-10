package com.demo.gestiondestocks.controller.api;

import com.demo.gestiondestocks.dto.ArticleDto;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import static com.demo.gestiondestocks.utils.Constants.APP_ROUTE;

import java.awt.*;
import java.util.List;

public interface ArticleApi {

    @PostMapping(value= APP_ROUTE + "/articles/create", consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
    ArticleDto save (@RequestBody ArticleDto articleDto);

    @GetMapping(value = APP_ROUTE + "/articles/{idArticle}", produces = MediaType.APPLICATION_JSON_VALUE)
    ArticleDto findById (@PathVariable("idArticle") Integer id);

    @GetMapping(value = APP_ROUTE + "/articles/{codeArticle}", produces = MediaType.APPLICATION_JSON_VALUE)
    ArticleDto findArticleByCode (String codeArticle);
    @GetMapping(value = APP_ROUTE + "/articles/all", produces = MediaType.APPLICATION_JSON_VALUE)
    List<ArticleDto> findAll();
    @DeleteMapping(value = APP_ROUTE + "/articles/delete/{idArticle}", produces = MediaType.APPLICATION_JSON_VALUE)
    void delete ( @PathVariable("idArticle")Integer id);

}
