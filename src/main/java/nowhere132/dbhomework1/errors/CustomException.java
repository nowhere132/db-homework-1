package nowhere132.dbhomework1.errors;

import lombok.Getter;
import lombok.Setter;
import org.springframework.http.HttpStatus;

@Getter
@Setter
public class CustomException extends RuntimeException {
    public CustomException(HttpStatus status, String msg) {
        super(msg);
        errorMessage = msg;
        httpStatus = status;
    }

    private HttpStatus httpStatus;
    private String errorMessage;
}