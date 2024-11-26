package com.stark.exception;

import com.stark.Payload.ErorDetail;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;

import java.util.Date;

// catch block
@ControllerAdvice
public class ExceptionHandle {

    // handle exception for employee not found
    @ExceptionHandler(ResourceNotFound.class)
    public ResponseEntity<ErorDetail> handleEmployeeNotFoundException(
            ResourceNotFound e,
            WebRequest request
    ) {
        ErorDetail erorDetail=new ErorDetail(
                new Date(),
                e.getMessage(),
                request.getDescription(false));
        return new ResponseEntity<>(erorDetail, HttpStatus.INTERNAL_SERVER_ERROR);
    }
    @ExceptionHandler(Exception.class)
    public ResponseEntity<ErorDetail> GlobalException(
            Exception e,
            WebRequest request
    ) {
        ErorDetail erorDetail=new ErorDetail(
                new Date(),
                e.getMessage(),
                request.getDescription(false));
        return new ResponseEntity<>(erorDetail, HttpStatus.INTERNAL_SERVER_ERROR);
    }
}
