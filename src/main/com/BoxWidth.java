package main.com;

import java.util.BitSet;

/**
 * 子类
 */
public class BoxWidth extends Box {

    private final Integer x;

    public BoxWidth(Integer width, Integer length,Integer x) {
        super(width, length);
        this.x = x;
    }


    public void edit(Integer width) {
        super.setWidth(width);
        System.out.println(this.x);
    }

    public static void main(String[] args) {
        BoxWidth boxWidth = new BoxWidth(3, 18, 88);

        boxWidth.edit(7);

        System.out.println("长度：" + boxWidth.getLength());
        System.out.println("宽度：" + boxWidth.getWidth());

        BitSet bitSet = new BitSet(16);
        bitSet.set(1,10);
        System.out.println(bitSet);

    }


}
