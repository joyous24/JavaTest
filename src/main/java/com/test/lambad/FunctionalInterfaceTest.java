package com.test.lambad;

/**
 * 自定义lambda
 *
 * @author zhaoxiqing
 */
public class FunctionalInterfaceTest {
    public static void main(String[] args) {
        UserNameFunction userNameFunction = (n) -> {
            System.out.println(n);
        };

        userNameFunction.apply("小赵");

        //运行结果
        //小赵
  
    }


    @FunctionalInterface
    interface UserNameFunction {


        /**
         * 应用
         *
         * @param name
         * @return
         */
        void apply(String name);
    }
}



