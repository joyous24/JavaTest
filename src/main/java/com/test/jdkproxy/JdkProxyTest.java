package com.test.jdkproxy;

import java.lang.reflect.Proxy;


/**
 * jdk动态代理演示
 */
public class JdkProxyTest {

    public static void main(String[] args) {
        Book book = (Book) Proxy.newProxyInstance(JdkProxyTest.class.getClassLoader(), new Class<?>[]{Book.class}, new Advice(new AnimalWorldBook()));

        book.readBook("张三");
    }
}
