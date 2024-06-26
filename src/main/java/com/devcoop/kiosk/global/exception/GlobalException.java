package com.devcoop.kiosk.global.exception;

import com.devcoop.kiosk.global.exception.enums.ErrorCode;
import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public class GlobalException extends Throwable {
    private final ErrorCode errorCode;
}
