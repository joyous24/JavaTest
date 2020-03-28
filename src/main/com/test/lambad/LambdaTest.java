package com.test.lambad;

import java.util.Map;
import java.util.TreeMap;

/**
 * lambda表达式测试用例
 *
 * @author zxq
 */
public class LambdaTest {
    public static void main(String[] args) {
        Map<String, String> map = new TreeMap();
        map.put("alpha", "X");
        map.put("bravo", "Y");
           map.put("charlie", "Z");

        String str = "alpha-bravo-charlie";
        map.replaceAll(str::replace);

        map.forEach((k, v) -> System.out.println("K=" + k + ",V=" + v));

//输出结果：
//        K=alpha,V=X-bravo-carlle
//        K=bravo,V=alpha-Y-carlle
//        K=charlie,V=alpha-bravo-Z
    }


}
