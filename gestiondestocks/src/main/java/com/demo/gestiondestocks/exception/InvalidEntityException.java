package com.demo.gestiondestocks.exception;

import lombok.Getter;

import java.util.List;

public class InvalidEntityException extends  RuntimeException{

    @Getter
    private Errorcodes errorcodes;
    @Getter
    private List<String> errors;

    public InvalidEntityException(String message)
    {
        super(message);
    }


    public InvalidEntityException(String message, Throwable cause)
    {
        super(message, cause);
    }

    public InvalidEntityException(String message, Throwable cause,Errorcodes errorcodes)
    {
        super(message, cause);
        this.errorcodes = errorcodes;
    }



    public InvalidEntityException(String message, Errorcodes errorcodes)
    {
        super(message);
        this.errorcodes = errorcodes;

    }

    public InvalidEntityException(String message, Errorcodes errorcodes, List<String> errors)
    {
        super(message);
        this.errorcodes = errorcodes;
        this.errors = errors;
    }
}
