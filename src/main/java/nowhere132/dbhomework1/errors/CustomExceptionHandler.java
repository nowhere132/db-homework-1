package nowhere132.dbhomework1.errors;

import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

@ControllerAdvice
public class CustomExceptionHandler extends ResponseEntityExceptionHandler {
    @ExceptionHandler(value = { CustomException.class })
    protected ResponseEntity<Object> handleKnownError(CustomException e, WebRequest req) {
        return handleExceptionInternal(e, e.getErrorMessage(), new HttpHeaders(), e.getHttpStatus(), req);
    }

    @ExceptionHandler(value = { RuntimeException.class })
    protected ResponseEntity<Object> handleUnknownError(RuntimeException e, WebRequest req) {
        return handleExceptionInternal(e, "UNKNOWN_ERROR", new HttpHeaders(), HttpStatus.INTERNAL_SERVER_ERROR, req);
    }
}