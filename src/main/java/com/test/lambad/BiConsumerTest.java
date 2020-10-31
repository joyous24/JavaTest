package com.test.lambad;

import java.util.List;
import java.util.function.BiConsumer;

/**
 * 表示接受两个输入参数并且不返回结果的操作。
 *
 * @author zhaoxiqing
 */
public class BiConsumerTest {
    public static void main(String[] args) {

        //bi = Binary adj. [数] 二进制的；二元的，二态的
        BiConsumer<List<String>, Integer> listIntegerBiConsumer = (t, u) -> {

        };

        BiConsumer<String, Integer> biConsumer = (t, u) -> {
            System.out.println("t=" + t);
            System.out.println("t=" + u);
        };

        //biConsumer.accept("哈喽", 1);

        BiConsumer<String, Integer> newBiConsumer = (t, u) -> {
            System.out.println("nt=" + t);
            System.out.println("nt=" + u);
        };

        //接着执行
        BiConsumer andThen = biConsumer.andThen(newBiConsumer);
        andThen.accept("哈喽", 1);

//执行结果
//        t=哈喽
//        t=1
//        nt=哈喽
//        nt=1
    }
}
