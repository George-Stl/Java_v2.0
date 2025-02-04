package Figures;
import Figures.GeometricObject;

public class Rectangle extends GeometricObject{
    private double width;
    private double height;

    public Rectangle() {
    }

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    /** Возвращает ширину */
    public double getWidth() {
        return width;
    }

    /** Присваивает новую ширину */
    public void setWidth(double width) {
        this.width = width;
    }

    /** Возвращает высоту */
    public double getHeight() {
        return height;
    }

    /** Присваивает новую высоту */
    public void setHeight(double height) {
        this.height = height;
    }

     /** Возвращает площадь */
    public double getArea() {
        return width * height;
    }

    @Override /** Возвращает периметр */
    public double getPerimeter() {
        return 2 * (width + height);
    }

    @Override
    public String toString() {
        return "[прямоугольник] ширина: " + width + " высота: " + height
                + " Площадь: " + this.getArea();
    }
}