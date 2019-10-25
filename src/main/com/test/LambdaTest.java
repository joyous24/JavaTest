package com.test;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.HashMap;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * lambda表达式测试类
 */
public class LambdaTest {

    interface MyNumber {
        int getValue();

    }

    public static void main2(String[] args) {
        Map<String, String> table = new LambdaTest().addressResolution("吉林省通化市二道江区");
        System.out.println();
    }


    public Map<String, String> addressResolution(String address) {
        String regex = "(?<province>[^省]+自治区|.*?省|.*?行政区|.*?市)(?<city>[^市]+自治州|.*?地区|.*?行政单位|.+盟|市辖区|.*?市|.*?县)(?<county>[^县]+县|.+区|.+市|.+旗|.+海域|.+岛)";
        Matcher m = Pattern.compile(regex).matcher(address);
        Map<String, String> table = new HashMap<>();
        while (m.find()) {
            // 省
            String province = m.group("province");
            table.put("province", province == null ? "" : province.trim());
            // 市
            String city = m.group("city");
            table.put("city", city == null ? "" : city.trim());
            // 区
            String county = m.group("county");
            table.put("county", county == null ? "" : county.trim());
        }
        return table;
    }

    public static void main(String[] args) {
        String s = "1810.10000";

        BigDecimal big = new BigDecimal(s).setScale(2,
                RoundingMode.DOWN);

        System.out.println(big.longValue());
    }


}
