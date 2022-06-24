package com.demo.gestiondestocks.handlers;

import com.demo.gestiondestocks.exception.EntityNotFoundException;
import lombok.experimental.StandardException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

@RestControllerAdvice
public class RestExceptionHandler extends ResponseEntityExceptionHandler {

    @ExceptionHandler(EntityNotFoundException.class)
public ResponseEntity<ErrorDto> handleException(EntityNotFoundException exception, WebRequest webRequest) {
    final HttpStatus notFound = HttpStatus.NOT_FOUND;

    final ErrorDto errorDto = null;
    errorDto.builder()
            .message(exception.getMessage())
            .code(exception.getErrorcodes()
            );

    return new ResponseEntity<>(errorDto,notFound);
}



}
