package com.demo.gestiondestocks.validator;

import com.demo.gestiondestocks.dto.CategorieDto;
import org.springframework.util.StringUtils;

import java.util.ArrayList;
import java.util.List;

public class CatagorieValidator {

    public static List<String> validate(CategorieDto categorieDto)
    {
        List<String> errors = new ArrayList<>();
        if(categorieDto == null || !StringUtils.hasLength(categorieDto.getCodeCategorie()))
        {
            errors.add("Veuillez renseignez le code de la catégorie");
        }
        return errors;
    }
}
