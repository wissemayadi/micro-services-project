package tn.wissem.msarticle.exceptionHandler;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import java.util.HashMap;
import java.util.Map;

@RestControllerAdvice
public class RestExceptionHandler {
    @ResponseStatus(HttpStatus.EXPECTATION_FAILED)
    @ExceptionHandler(Exception.class)
    public Map<String, String> handleException(Exception e) {
        Map<String,String>map = new HashMap<>();
        map.put("error",e.getMessage());
        return map;
    }
}
