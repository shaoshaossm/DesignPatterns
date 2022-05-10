package com.ssm.principle.ocp.improve;

/**
 * @author shaoshao
 * @version 1.0
 * @date 2022/5/10 20:51
 */
public class OCP {
    public static void main(String[] args) {

        GraphicEditor graphicEditor = new GraphicEditor();
        graphicEditor.drawShape(new Rectangle());
        graphicEditor.drawShape(new Circle());
    }

}

// 这是一个绘制简单的图形的类
class GraphicEditor {
    public void drawShape(Shape shapeType) {
        shapeType.draw();
    }


}

// 基类
abstract class Shape {

    public abstract void draw();
}

class Rectangle extends Shape {

    @Override
    public void draw() {
        System.out.println("绘制矩形");
    }
}

class Circle extends Shape {

    @Override
    public void draw() {
        System.out.println("绘制圆形");
    }
}


