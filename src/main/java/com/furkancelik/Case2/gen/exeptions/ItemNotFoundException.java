package com.furkancelik.Case2.gen.exeptions;

import com.furkancelik.Case2.gen.enums.BaseErrorMessage;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.NOT_FOUND)
public class ItemNotFoundException extends GenBusinessException{
    public ItemNotFoundException(BaseErrorMessage message) {
        super(message);
    }
}
