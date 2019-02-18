package main.com;

/**
 * 父类
 */
public class Box {


    /**
     * 宽度
     */
    private Integer width;

    /**
     * 长裤
     */
    private Integer length;


    /**
     * 构造
     */
    public Box() {

    }

    /**
     * 构造
     *
     * @param width  宽度值
     * @param length 长度值
     */
    public Box(Integer width, Integer length) {
        this.width = width;
        this.length = length;
    }

    public Integer getWidth() {
        return width;
    }

    public Integer getLength() {
        return length;
    }

    public void setWidth(Integer width) {
        this.width = width;
    }
}
