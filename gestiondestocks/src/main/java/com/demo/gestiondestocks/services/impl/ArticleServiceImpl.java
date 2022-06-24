package com.demo.gestiondestocks.services.impl;

import com.demo.gestiondestocks.dto.ArticleDto;
import com.demo.gestiondestocks.exception.EntityNotFoundException;
import com.demo.gestiondestocks.exception.Errorcodes;
import com.demo.gestiondestocks.exception.InvalidEntityException;
import com.demo.gestiondestocks.model.Article;
import com.demo.gestiondestocks.repository.ArticleRepositoy;
import com.demo.gestiondestocks.services.ArticleService;
import com.demo.gestiondestocks.validator.ArticleValidator;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
@Slf4j
public class ArticleServiceImpl implements ArticleService {


    private ArticleRepositoy articleRepositoy;
    public ArticleServiceImpl(ArticleRepositoy articleRepositoy) {
        this.articleRepositoy = articleRepositoy;
    }

    @Override
    public ArticleDto save(ArticleDto articleDto) {
        List<String> errors = ArticleValidator.validate(articleDto);
        if (!errors.isEmpty())
        {
            log.error("Article is not valide",articleDto);
            throw new InvalidEntityException("L'article n'est pas valide", Errorcodes.ARTICLES_NOT_VALID,errors);

        }
        return ArticleDto.fromEntity(articleRepositoy.save(ArticleDto.toEntity(articleDto)));
    }

    @Override
    public ArticleDto findById(Integer id) {

        if (id == null)
        {
            log.error("Id article is null");
        //  throw new InvalidEntityException("Aucun article sélectionné.", Errorcodes.ARTICLES_NOT_VALID);
            return null;
        }

            Optional<Article> article =  articleRepositoy.findById(id);

            ArticleDto dto = ArticleDto.fromEntity(article.get());
            return Optional.of(dto).orElseThrow(()->
                    new EntityNotFoundException("Aucun article avec l'id : " +
                            id.toString(), Errorcodes.ARTICLES_NOT_FOUND));

    }

    @Override
    public ArticleDto findByCode(Integer id) {
        return null;
    }

    @Override
    public List<ArticleDto> findAll() {
        return articleRepositoy.findAll().stream()
                .map(ArticleDto::fromEntity)
                .collect(Collectors.toList());
        // return null;
    }

    @Override
    public void delete(Integer id) {
        if (id == null)
        {
            log.error("Id article is null");
            //  throw new InvalidEntityException("Aucun article sélectionné.", Errorcodes.ARTICLES_NOT_VALID);
            return;
        }
        articleRepositoy.deleteById(id);
    }

    @Override
    public ArticleDto findArticleByCode(String code)
    {
        if (!StringUtils.hasLength(code) )
        {
            log.error("Id article is null");
            //  throw new InvalidEntityException("Aucun article sélectionné.", Errorcodes.ARTICLES_NOT_VALID);
            return null;
        }

        Optional<Article> article =  articleRepositoy.findeArticleByCode(code);

        ArticleDto dto = ArticleDto.fromEntity(article.get());
        return Optional.of(dto).orElseThrow(()->
                new EntityNotFoundException("Aucun article avec code : " +
                        code, Errorcodes.ARTICLES_NOT_FOUND));

    }


}