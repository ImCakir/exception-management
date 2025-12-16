package com.caglacakir.exception;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
public enum MessageType {

    NO_RECORD_EXIST("1001", "kayıt bulunamadı"),
    GENERAL_EXCEPTION("9999", "genel bir hata oluştur");

    private String code;

    private String message;


    MessageType(String code, String message) {
        this.code = code;
        this.message = message;
    }


}
