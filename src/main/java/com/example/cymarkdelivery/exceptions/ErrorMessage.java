package com.example.cymarkdelivery.exceptions;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ErrorMessage {
    private String errorMessage;
    private int errorCode;
    private String documentation;
}
