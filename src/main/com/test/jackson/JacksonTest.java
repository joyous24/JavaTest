package com.test.jackson;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.dataformat.xml.XmlMapper;

import java.io.IOException;

/**
 * 转换对象为XML
 */
public class JacksonTest {
    public static void main(String[] args) throws IOException {
        CatDto catDtoBCP = new CatDto();
        CatUserInfo catBCPUserInfo = new CatUserInfo();
        catDtoBCP.setUserInfo(catBCPUserInfo);

        ObjectMapper mapper = new XmlMapper();
        System.out.println(mapper.writeValueAsString(catDtoBCP));

        String xml = "<?xml version=\"1.0\" encoding=\"UTF-8\"?><CAT><Return><Success>Y</Success><ErrMessage></ErrMessage></Return></CAT>";
        com.test.jackson.CatReturnCatDto dto = mapper.readValue(xml, com.test.jackson.CatReturnCatDto.class);
    }


}
