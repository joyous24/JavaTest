package com.test.jackson;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.dataformat.xml.XmlMapper;
import com.test.SerializableTest.PersonTest;

/**
 * 转换对象为XML
 */
public class JacksonTest {

    public static void main(String[] args) throws JsonProcessingException {
        PersonTest person = new PersonTest();
        person.setAge(1);


        ObjectMapper mapper = new XmlMapper();
        System.out.println(mapper.writeValueAsString(person));
    }
}
