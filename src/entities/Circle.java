package entities;

import java.util.Objects;

public class Circle {
    // Lista attributi
    public double radius;
    public double x;
    public double y;
    public static int cerchiCreati;

    //Costruttore
    public Circle(double radius, double x, double y) {
        this.radius = radius;
        this.x = x;
        this.y = y;
        cerchiCreati++;
    }

    // Lista metodi
    public double getDiameter() {
        return radius * 2;
    }

    public double getPerimeter() {
        return 2 * Math.PI * radius;
    }

    public double getArea() {
        return Math.PI * radius * radius;
    }

    public void printInfo() {
        System.out.println("(X,Y) " + x + " " + y);
        System.out.println("raggio " + radius);
        System.out.println("diametro " + getDiameter());
        System.out.println("area " + getArea());
        System.out.println("perimetro " + getPerimeter());
    }

    public static void printNumeroCreati() {
        System.out.println("Ho creato " + cerchiCreati + " cerchi");
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Circle circle = (Circle) o;
        return Double.compare(radius, circle.radius) == 0 && Double.compare(x, circle.x) == 0 && Double.compare(y, circle.y) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(radius, x, y);
    }

    @Override
    public String toString() {
        return "{" +
                "radius=" + radius +
                ", x=" + x +
                ", y=" + y +
                '}';
    }
}
