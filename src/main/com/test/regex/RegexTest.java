package com.test.regex;

import java.util.HashMap;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * 正则表达式测试用例
 */
public class RegexTest {
    public static void main(String[] args) {
        Map<String, String> table = new RegexTest().addressResolution("吉林省通化市二道江区");
        table.forEach((k, v) -> System.out.println(v));
    }


    public Map<String, String> addressResolution(String address) {
        String regex = "(?<province>[^省]+自治区|.*?省|.*?行政区|.*?市)(?<city>[^市]+自治州|.*?地区|.*?行政单位|.+盟|市辖区|.*?市|.*?县)(?<county>[^县]+县|.+区|.+市|.+旗|.+海域|.+岛)";
        Matcher m = Pattern.compile(regex).matcher(address);
        Map<String, String> table = new HashMap<>(16);
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
}
