package com.demo.gestiondestocks.validator;

import com.demo.gestiondestocks.dto.ArticleDto;
import org.springframework.util.StringUtils;

import java.util.ArrayList;
import java.util.List;

public class ArticleValidator {



    public static List<String> validate(ArticleDto articleDto)
    {
        List<String> errors = new ArrayList<>();
        if(articleDto == null )
        {
            errors.add("Veuillez renseignez les champs obligatoires.");
        }

        if(!StringUtils.hasLength(articleDto.getCodeArticle()))
        {
            errors.add("Veuillez renseignez le code article.");
        }

        if(!StringUtils.hasLength(articleDto.getDesigantion()))
        {
            errors.add("Veuillez renseignez lla designation de l'article.");
        }

        if(!StringUtils.hasLength(articleDto.getPrixUnitaireHt().toString()))
        {
            errors.add("Veuillez renseignez le prix unitaire HT.");
        }
        return errors;
    }
}
