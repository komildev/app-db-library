package com.example.appdblibrary.payload;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class ErrorData {
    private String msg;
    private Integer errorCode;

}
