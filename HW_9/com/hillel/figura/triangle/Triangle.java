package com.hillel.figura.triangle;

import com.hillel.figura.triangleProcessor.TriangleProcessor;

public class Triangle {

    private double perimeter;
    private double area;
    private double ab;
    private double bc;
    private double ac;
    private Point a;
    private Point b;
    private Point c;

    public Triangle(Point a, Point b, Point c) {
        this.ab = ab;
        this.bc = bc;
        this.ac = ac;
        ab = TriangleProcessor.sizeSide(a, b);
        bc = TriangleProcessor.sizeSide(b, c);
        ac = TriangleProcessor.sizeSide(a, c);
    }

    public double perimeter() {
        perimeter = ab + bc + ac;
        return perimeter;
    }

    public double formulaHeron() {
        double p;
        p = getPerimeter() / 2;
        area = Math.sqrt(p * (p - ab) * (p - bc) * (p - ac));
        return area;
    }

    public boolean isEquilateral() {
        return ((ab == bc) && (bc == ac) && (ac == ab));
    }

    public boolean isIsosceles() {
        return (ab == bc || bc == ac || ac == ab);
    }

    public boolean isRectangular() {
        return (Math.round(Math.pow(ac, 2)) == (Math.pow(ab, 2) + Math.pow(bc, 2)));
    }

    public boolean isArbitrary() {
        return !isEquilateral() && !isIsosceles() && !isRectangular();
    }

    public double getPerimeter() {
        return perimeter;
    }

    public void setPerimeter(double perimeter) {
        this.perimeter = perimeter;
    }

    public double getArea() {
        return area;
    }

    public void setArea(double area) {
        this.area = area;
    }

}
