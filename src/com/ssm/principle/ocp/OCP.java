package com.ssm.principle.ocp;

/**
 * @author shaoshao
 * @version 1.0
 * @date 2022/5/10 20:51
 */
public class OCP {
    public static void main(String[] args) {
        // 查看使用的问题
        GraphicEditor graphicEditor = new GraphicEditor();
        graphicEditor.drawShape(new Rectangle());
        graphicEditor.drawShape(new Circle());
    }

}

// 这是一个绘制简单的图形的类
class GraphicEditor {
    public void drawShape(Shape shapeType) {
        //根据type 绘制不同的图形
        if (shapeType.m_type == 1) {
            drawRectangle(shapeType);
        } else if (shapeType.m_type == 2) {
            drawCircle(shapeType);
        }
    }

    public void drawRectangle(Shape rectangle) {
        //绘制矩形
        System.out.println("绘制矩形");
    }

    public void drawCircle(Shape circle) {
        //绘制圆形
        System.out.println("绘制圆形");
    }
}

// 基类
class Shape {
    int m_type;
}

class Rectangle extends Shape {
    //矩形
    Rectangle() {
        m_type = 1;
    }
}

class Circle extends Shape {
    //圆形
    Circle() {
        m_type = 2;
    }
}


