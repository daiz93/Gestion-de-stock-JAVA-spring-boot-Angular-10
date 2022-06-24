package com.demo.gestiondestocks.exception;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class EntityNotFoundException extends RuntimeException {


    private Errorcodes errorcodes;


    public EntityNotFoundException(String message)
    {
        super(message);
    }


    public EntityNotFoundException(String message, Throwable cause)
    {
        super(message, cause);
    }

    public EntityNotFoundException(String message, Errorcodes errorcodes)
    {
        super(message);
        this.errorcodes = errorcodes;
    }
}
