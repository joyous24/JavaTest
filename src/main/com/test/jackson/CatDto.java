package com.test.jackson;

import com.fasterxml.jackson.annotation.JsonRootName;

@JsonRootName("CatDto")
public class CatDto {

    private CatUserInfo UserInfo;

    public CatUserInfo getUserInfo() {
        return UserInfo;
    }

    public void setUserInfo(CatUserInfo userInfo) {
        UserInfo = userInfo;
    }
}
