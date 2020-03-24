package com.test.jackson;

import com.fasterxml.jackson.annotation.JsonRootName;

@JsonRootName("CatDto")
public class CatDto {

    private com.test.jackson.CatUserInfo UserInfo;

    public com.test.jackson.CatUserInfo getUserInfo() {
        return UserInfo;
    }

    public void setUserInfo(com.test.jackson.CatUserInfo userInfo) {
        UserInfo = userInfo;
    }
}
