package com.furkancelik.Case2.gen.exeption;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.Date;

@Data
@AllArgsConstructor
public class GenExceptionResponse {
    private Date errorDate;
    private String message;
    private String detail;
}
