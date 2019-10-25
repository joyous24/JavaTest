package com.test;

import com.zhen.commons.util.DateUtil;
import com.zhen.commons.util.Md5Util;
import com.zhen.commons.util.StringHelper;

import java.text.MessageFormat;
import java.text.NumberFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.regex.Pattern;

public class Test {

    private Test() {
        System.out.println("ddd");

    }


    public static void main2(String[] args) {
        String runStartTime = DateUtil.format(System.currentTimeMillis(),
                DateUtil.DATE_TIME);
        System.out.println(runStartTime);
    }

    public static void main3(String[] args) {
        Set<String> set = new HashSet<>();
        set.add("ddd");
        set.add("ddd");
        set.add("ccc");
        set.add("ddd");
        for (String s : set) {
            System.out.println(s);

        }

    }

    public static void main4(String[] args) {
        Double i = Double.parseDouble("673.63");
        Long l = Long.valueOf(i.intValue());
        System.out.println(l);
    }

    public static void main5(String[] args) {
        int i = 7;
        System.out.println(i -= 1);
    }

    public static void main6(String[] args) {
        Test t = new Test();
        System.out.println(t.sendSMSTimelimit());
    }

    public static void main7(String[] args) {
        int pageSize = 100;
        int startIndex = 1;
        int endIndex = pageSize;

        do {
            // 计算列表指针【起始点】与【终止点】
            startIndex += pageSize;
            endIndex += pageSize;
        }
        while (true);
    }

    public static void main8(String[] args) {
        String d = null;
        boolean s = StringHelper.equals(d, "1");
        System.out.println(s);
    }

    public static void main9(String[] args) {
        Date date = new Date();// 取时间
        Calendar calendar = new GregorianCalendar();
        calendar.setTime(date);
        calendar.add(Calendar.MINUTE, -60);
        date = calendar.getTime();
        SimpleDateFormat formatter = new SimpleDateFormat(DateUtil.DATE_TIME);
        String dateString = formatter.format(date);
        System.out.println(dateString);
    }

    public static void main11(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        System.out.println(list.get(1));

        // for (int i = 0; i < 3; i++) {
        // List newList = list.subList(0, 2);
        // System.out.println(newList.size());
        // }

    }

    public static void main10(String[] args) {
        String str = "26,665,";
        System.out.println(str.contains("2,"));
    }

    /**
     * 正则表达式用法
     *
     * @param args
     */
    public static void main12(String[] args) {
        String regex = "";
        String input = "";
        Pattern pattern = Pattern.compile(regex);
        pattern.matcher(input);

    }

    public boolean sendSMSTimelimit() {
        GregorianCalendar cal = new GregorianCalendar();
        int hour = cal.get(GregorianCalendar.HOUR_OF_DAY);
        // 午夜12:00处理
        if (hour == 0) {
            return true;
        }

        // 8:00-23:00处理
        if (hour >= 8 && hour <= 23) {
            return true;
        }
        return false;
    }

    public static void main19(String[] args) {
        Test t = new Test();
        System.out.println(t.convertInvoiceType("01"));
    }

    private String convertInvoiceType(String invoiceType) {
        // 不开发票
        String defaultType = "3";
        if (StringHelper.isEmpty(invoiceType)) {
            return defaultType;
        }

        switch (invoiceType) {
            case "01":
                return "4";
            case "04":
                return "1";
            case "02":
                return "1";
        }

        return defaultType;
    }

    public static void main20(String[] args) {
        String time = "10,20,30,40,50,";

        GregorianCalendar cal = new GregorianCalendar();
        String minute = cal.get(GregorianCalendar.MINUTE) + ",";
        if (time.contains(minute)) {
            System.out.println(minute);
        }
    }

    public static void main21(String[] args) {
        String str = MessageFormat.format("ddd{0,date},{1,number,integer}", new Date(), 2);
        System.out.println(str);

        double[] myNumber = {23.3487878, 24, 25};
        NumberFormat nf = NumberFormat.getInstance();
        for (int i = 0; i < myNumber.length; ++i) {
            System.out.println(nf.format(myNumber[i]) + "; ");
        }
    }

    public static void main24(String[] args) {
        System.out.printf(Md5Util.getMd5Hex("zhenpin20190808").toUpperCase());
    }

    public static void main23(String[] args) {
        String md5 = Md5Util.getMd5Hex("{\"operateTime\":\"2019-08-14 09:38:17\",\"operator\":\"张三\",\"orderId\":\"00000001\",\"traceMark\":\"【长沙市】 您的订单已到达京东【长沙分拨中心】\",\"traceNode\":\"分拣中心接货\",\"vendorCode\":\"021K10000\",\"vendorName\":\"XXXX有限公司\",\"waybillCode\":\"JDVB30000000003\"}2019-08-14 09:38:17BC65CF52A7B799DD017B8723670491ED");
        System.out.println(md5);
    }



}
