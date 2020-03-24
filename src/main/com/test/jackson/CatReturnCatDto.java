package com.test.jackson;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonRootName;

@JsonRootName("Cat")
public class CatReturnCatDto {

    @JsonProperty("Return")
    private com.test.jackson.CatReturn catReturn;

    public com.test.jackson.CatReturn getCatReturn() {
        return catReturn;
    }

    public void setCatReturn(com.test.jackson.CatReturn catReturn) {
        this.catReturn = catReturn;
    }
}
