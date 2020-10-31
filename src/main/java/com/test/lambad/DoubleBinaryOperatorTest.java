package com.test.lambad;

import java.util.function.DoubleBinaryOperator;

/**
 * 代表对两个double操作数的操作，并产生一个double结果。
 *
 * @author zhaoxiqing
 */
public class DoubleBinaryOperatorTest {
    public static void main(String[] args) {
        //Binary adj. [数] 二进制的；二元的，二态的
        //Operator n. 经营者；操作员；话务员；行家
        DoubleBinaryOperator doubleBinaryOperator = (l, r) -> {
            return l + r;
        };

        double ret = doubleBinaryOperator.applyAsDouble(1, 2);
        System.out.println(ret);

        //执行结果
        //3.0

    }


}
