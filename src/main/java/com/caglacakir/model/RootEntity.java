package com.caglacakir.model;

import jakarta.persistence.criteria.Root;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class RootEntity<T> {

    private boolean result; //servis başarılı çalıştı mı çalışmadı mu?

    private String errorMessage; // başarısız olduysa hata mesajı

    private T data;

    public static <T> RootEntity<T> ok (T data){ // data yı başarılı aldık metodu
        RootEntity<T> rootEntity = new RootEntity<>();
        rootEntity.setData(data); // true ise data vardır
        rootEntity.setResult(true); // result true dondu
        rootEntity.setErrorMessage(null); // result true ıse hata mesajı yoktur bunu da null gectık
        return rootEntity;
    }
    public static <T> RootEntity<T> error(String errorMessage){
        RootEntity<T> rootEntity = new RootEntity<>();
        rootEntity.setData(null); // false ise data yoktur
        rootEntity.setResult(false); // false geldi
        rootEntity.setErrorMessage(errorMessage);

        return rootEntity;
    }
// metotlara sınıf uzerınden erişmek için static yaptık
}
