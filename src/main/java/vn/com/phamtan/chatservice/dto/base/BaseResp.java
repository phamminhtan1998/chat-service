package vn.com.phamtan.chatservice.dto.base;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Getter;
import lombok.Setter;
import org.springframework.http.HttpStatus;

import java.time.LocalDate;

@Getter
@Setter
public class BaseResp<T> {
    @JsonFormat(pattern = "dd/MM/yyyy")
    private LocalDate time;
    private HttpStatus status;
    private T data;

    public BaseResp(T data) {
        this.time = LocalDate.now();
        this.status = HttpStatus.OK;
        this.data = data;
    }
}
