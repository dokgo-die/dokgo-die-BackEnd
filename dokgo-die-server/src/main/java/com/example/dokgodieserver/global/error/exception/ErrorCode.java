package com.example.dokgodieserver.global.error.exception;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum ErrorCode {

    SAVE_IMAGE_FAILED(400, "Save Image Failed"),

    EXPIRED_TOKEN(401, "Expired Token"),
    INVALID_TOKEN(401, "Invalid Token"),

    PASSWORD_MIS_MATCH(401, "Password Mis Match"),

    //user
    USER_NOT_FOUND(404, "User Not Found"),
    IMAGE_NOT_FOUND(404, "Image Not Found"),

    INTERNAL_SERVER_ERROR(500, "Internal Server Error");

    private final int status;
    private final String message;

}
