package com.test.serializable;


import java.io.*;

public class PersonTest implements Serializable {

    private static final long serialVersionUID = 1614918028946841050L;

    private String name;

    private Integer age;

    private Integer sex;

    //sex1内容不序列化到本地
    private transient Integer sex1;

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public static void main(String[] args) {
        //测试开关
        Boolean serialBoll = true;

        PersonTest personTest = new PersonTest();
        personTest.setName("测试序列化");
        personTest.sex1 = 2;

        File outFile = new File("D://personTest.text");
        try {
            if (!outFile.exists()) {
                outFile.createNewFile();
            }

            if (serialBoll) {
                //序列化到本地
                ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream(outFile));
                objectOutputStream.writeObject(personTest);
                objectOutputStream.close();
            } else {
                //从本地序列化读取
                ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream(outFile));
                PersonTest getPerson = (PersonTest) objectInputStream.readObject();
                System.out.print(getPerson.sex1);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }


    }
}
