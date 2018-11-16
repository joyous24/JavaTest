package main.com.test.collection;

import java.util.Comparator;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

/**
 * 树进行存储的组，对象已升序存储
 */
public class TreeSetTest {

    private String name;

    private Integer sex;

    private Integer age;

    private String tel;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getSex() {
        return sex;
    }

    public void setSex(Integer sex) {
        this.sex = sex;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    @Override
    public String toString() {
        return "TreeSetTest{" + "name='" + name + '\'' + ", sex=" + sex + ", age="
                + age + ", tel='" + tel + '\'' + '}';
    }

    public static void main(String[] args) {

        Set treeSet = new TreeSet(new Comparator<TreeSetTest>() {
            public int compare(TreeSetTest o1, TreeSetTest o2) {
                if (o1.getAge() > o2.getAge()) {
                    return 1;
                } else if (o1.getAge() < o2.getAge()) {
                    return -1;
                }

                if (o1.getName().equals(o2.getName())) {

                    return 0;
                }
                return 1;
            }
        });

        TreeSetTest t = new TreeSetTest();
        t.setName("张三");
        t.setAge(32);
        treeSet.add(t);

        TreeSetTest t2 = new TreeSetTest();
        t2.setName("李四");
        t2.setAge(25);
        treeSet.add(t2);

        TreeSetTest t3 = new TreeSetTest();
        t3.setName("王五");
        t3.setAge(40);
        treeSet.add(t3);

        TreeSetTest t4 = new TreeSetTest();
        t4.setName("赵六");
        t4.setAge(40);
        treeSet.add(t4);

        Iterator iterator = treeSet.iterator();
        while (iterator.hasNext()) {
            TreeSetTest test = (TreeSetTest) iterator.next();
            System.out.println(test.toString());
        }

    }
}
