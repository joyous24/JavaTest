package com.test.jackson;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonRootName;
import com.test.jackson.CatReturn;

@JsonRootName("Cat")
public class CatReturnCatDto {

    @JsonProperty("Return")
    private CatReturn catReturn;

    public CatReturn getCatReturn() {
        return catReturn;
    }

    public void setCatReturn(CatReturn catReturn) {
        this.catReturn = catReturn;
    }
}
