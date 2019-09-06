package com.cloudream.principle.ocp;

/**
 * @Author: George Wang
 * @Date: 2019/9/5 - 19:53
 * @VERSION: v1.0
 * @Description:
 */
public class Ocp {
    public static void main(String[] args) {
        GraphicEditor graphicEditor = new GraphicEditor();
        graphicEditor.drawShape(new Rectangle());
    }


}
class GraphicEditor {
    void drawShape(Shape shape) {
        shape.draw();
    }
}


abstract class Shape {
    /**
     * 绘制图形
     */
    abstract void draw();
}

class Rectangle extends Shape {

    @Override
    void draw() {
        System.out.println(" 绘制正方形 ");
    }
}