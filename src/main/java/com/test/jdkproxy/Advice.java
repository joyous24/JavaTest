package com.test.jdkproxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * JDK代理实例
 */
public class Advice implements InvocationHandler {
    private Book book;

    public Advice(Book book) {
        this.book = book;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        before();

        //被代理方法
        Object v = method.invoke(book, args);

        after();

        return v;
    }

    /**
     * 前置通知
     */
    public void before() {
        System.out.println("===========前置通知===========");
    }

    /**
     * 后置通知
     */
    public void after() {
        System.out.println("===========后置通知===========");
    }
}
