package vn.com.phamtan.chatservice.dto.base;

import lombok.Getter;
import lombok.Setter;
import org.springframework.http.HttpStatus;

import java.time.LocalDate;

@Getter
@Setter
public class BaseError<T> {
    private String errorCode;
    private LocalDate time;
    private HttpStatus status;
    private T data;

    public BaseError(T data) {
        this.status = HttpStatus.BAD_REQUEST;
        this.time = LocalDate.now();
        this.data = data;
    }
}
