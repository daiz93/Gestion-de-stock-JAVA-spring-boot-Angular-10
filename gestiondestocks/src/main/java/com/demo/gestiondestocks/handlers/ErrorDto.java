package com.demo.gestiondestocks.handlers;


import com.demo.gestiondestocks.exception.Errorcodes;
import lombok.*;

import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class ErrorDto {


    private Integer httpCode;
    private Errorcodes code;

    private String message;

    private List<String> Error = new ArrayList<>();

}
