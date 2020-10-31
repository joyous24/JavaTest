package com.test.jdkproxy;

/**
 * 业务类
 */
public class AnimalWorldBook implements Book {
    @Override
    public String readBook(String name) {
        System.out.println("===========" + name + "正在看动物世界这本书===========");
        return "我正在看动物世界这本书";
    }
}
