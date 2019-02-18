package main.com.test;

import com.zhen.commons.util.DateUtil;

public class CalendarTest {

    public static void main(String[] args) {
        int adddateStr = DateUtil.getTimestamp("2019-1-9 09:32:20", DateUtil.DATE_TIME);
        System.out.println(adddateStr);

        String dateStr = DateUtil.format(adddateStr * 1000L,
                DateUtil.DATE_TIME);
        System.out.println(dateStr);
    }
}
