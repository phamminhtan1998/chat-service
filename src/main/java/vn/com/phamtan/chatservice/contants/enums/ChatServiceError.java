package vn.com.phamtan.chatservice.contants.enums;

import org.springframework.http.HttpStatus;

/**
 * Base class for chat service
 *
 * @since 13/07/2022
 * @author minhtan
 */

public enum ChatServiceError {
    CHAT_BASE_ERROR(1000,HttpStatus.INTERNAL_SERVER_ERROR,"Lỗi Server","Lỗi do hệ thống xử lý");

    private  int errorCode;
    private HttpStatus status;
    private String errorMessage;
    private String errorDescription;

    ChatServiceError (int errorCode, HttpStatus status, String errorMessage, String errorDescription) {
        this.errorCode = errorCode;
        this.status = status;
        this.errorMessage = errorMessage;
        this.errorDescription = errorDescription;
    }
}
