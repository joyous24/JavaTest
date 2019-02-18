package main.com.test;


import com.amazonaws.mws.MwsUtl;

import java.util.Date;
import java.util.GregorianCalendar;

public class Test {

    public static void main(String[] args) {
        GregorianCalendar cal = new GregorianCalendar();
        Date date = new Date();
        cal.setTime(date);
        cal.set(GregorianCalendar.HOUR, cal.get(GregorianCalendar.HOUR)-1);
        System.out.println(MwsUtl.getDTF().newXMLGregorianCalendar(cal));

        System.out.println(0-1);
    }

}
