
package com.hillel.figura.triangleProcessor;
import com.hillel.figura.triangle.Triangle;
import com.hillel.figura.triangle.Point;

import java.util.function.Function;
import java.util.function.Predicate;



public class TriangleProcessor {
    private Triangle[] triangles;

    public TriangleProcessor(Triangle[] triangles) {
        this.triangles = triangles;
    }

    public static double sizeSide(Point p1, Point p2) {
        double size;
        size = Math.sqrt(Math.pow(p1.getX() - p2.getX(), 2) + Math.pow(p1.getY() - p2.getY(), 2));
        return size;
    }

    public Triangle triangleByProperty(Function<Triangle,Double> triangleDoubleFunction) {
        Triangle result = triangles[0];

        for (Triangle triangle : triangles) {
            if (triangleDoubleFunction.apply(result) > triangleDoubleFunction.apply(triangle)) {
                result = triangle;
            }
        }
        return result;
    }

    private  int sortTriangle(Predicate<Triangle> property) {
        int count = 0;
        for (Triangle triangle : triangles) {
            if (property.test(triangle)) {
                count++;
            }
        }
        return count;
    }
    public int countEquilateral() { return sortTriangle(Triangle::isEquilateral); }
    public int countIsosceles() {
        return sortTriangle(Triangle::isIsosceles);
    }
    public int countRectangular() {
        return sortTriangle(Triangle::isRectangular);
    }
    public int countArbitrary() {
        return sortTriangle(Triangle::isArbitrary);
    }
    public Triangle maxPerimeter() { return triangleByProperty(Triangle::perimeter); }
    public Triangle maxArea() { return triangleByProperty(Triangle::formulaHeron); }
    public Triangle minPerimeter() { return triangleByProperty(Triangle::perimeter); }
    public Triangle minArea() {
        return triangleByProperty(Triangle::formulaHeron);
    }
    public Triangle[] getTriangles() {
        return triangles;
    }
    public void setTriangles(Triangle[] triangles) {
        this.triangles = triangles;
    }


}
