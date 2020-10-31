package com.test.lambad;

import java.util.function.DoubleFunction;

/**
 * 表示接受双值参数并产生结果的函数。
 *
 * @author zhaoxiqing
 */
public class DoubleFunctionTest {
    public static void main(String[] args) {
        DoubleFunction<String> doubleFunction = (v) -> {
            return v + "";
        };

        String str = doubleFunction.apply(2);
        System.out.println(str);

        //执行结果
        //2.0
    }
}
