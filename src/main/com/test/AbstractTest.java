package main.com.test;

public abstract class AbstractTest implements InterfaceTest{
    private String name;

    protected String tel;


    public abstract void addName();


    public void addTel(){

    }

    public AbstractTest(String name) {
        this.name = name;
    }

    public static void main(String[] args) {

    }


}
