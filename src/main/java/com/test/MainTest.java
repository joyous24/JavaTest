package com.test;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class MainTest {
    public static void main1(String[] args) throws IOException {

        char[] cbuf = new char[10000];
        InputStreamReader input = new InputStreamReader(new FileInputStream(new File("D:/xiaomiAddress.json")), "UTF-8");
        int len = input.read(cbuf);
        String text = new String(cbuf, 0, len);

        JSONArray addres = JSONObject.parseArray(text);

        System.out.println(addres);

    }

    public static void main(String[] args) {
        Map<String, String> map = new HashMap<>(16);

        map.put("t1", "测试1");
        map.put("t2", "测试2");
        map.put("t3", "测试3");

        System.out.println(map.size());
    }

}
