package com.hillel.hw.hw9.figure.triangleProcessor;

import com.hillel.hw.hw9.figure.triangle.Point;
import com.hillel.hw.hw9.figure.triangle.Triangle;
import com.hillel.hw.hw9.figure.utils.CheckFunction;
import com.hillel.hw.hw9.figure.utils.ValueFunction;

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


    private Triangle triangleByProperty(ValueFunction valueFunction, CheckFunction function) {
        Triangle result = triangles[0];

        for (Triangle triangle : triangles) {
            if (valueFunction.get(result) > valueFunction.get(triangle)) {
                result = triangle;
            }
        }
        return result;
    }

    private Triangle triangleByPropertyMin(ValueFunction valueFunction, CheckFunction function) {
        Triangle resultmin = triangles[0];

        for (Triangle triangle : triangles) {
            if (valueFunction.get(resultmin) < valueFunction.get(triangle)) {
                resultmin = triangle;
            }
        }
        return resultmin;
    }

    private  int sortTriangle(CheckFunction function) {
        int count = 0;
        for (Triangle triangle : triangles) {
            if (function.function(triangle)) {
                count++;
            }
        }
        return count;
    }


    public Triangle IsoscelesByMaxPerimeter() {
        return triangleByProperty(
                new ValueFunction() {
                    @Override
                    public double get(Triangle triangle) {
                        return triangle.perimeter();
                    }
                },
                new CheckFunction() {

                    @Override
                    public boolean function(Triangle triangle) {
                        return triangle.isIsosceles();
                    }
                });
    }

    public Triangle IsoscelesByMaxArea() {
        return triangleByProperty(
                new ValueFunction() {
                    @Override
                    public double get(Triangle triangle) {
                        return triangle.Area();
                    }
                },
                new CheckFunction() {

                    @Override
                    public boolean function(Triangle triangle) {
                        return triangle.isIsosceles();
                    }
                });
    }
    public Triangle ArbitraryByMaxPerimeter() {
        return triangleByProperty(
                new ValueFunction() {
                    @Override
                    public double get(Triangle triangle) {
                        return triangle.perimeter();
                    }
                },
                new CheckFunction() {

                    @Override
                    public boolean function(Triangle triangle) {
                        return triangle.isArbitrary();
                    }
                });
    }
    public Triangle ArbitraryByMaxArea() {
        return triangleByProperty(
                new ValueFunction() {
                    @Override
                    public double get(Triangle triangle) {
                        return triangle.Area();
                    }
                },
                new CheckFunction() {

                    @Override
                    public boolean function(Triangle triangle) {
                        return triangle.isArbitrary();
                    }
                });
    }
    public Triangle RectangularByMaxPerimeter() {
        return triangleByProperty(
                new ValueFunction() {
                    @Override
                    public double get(Triangle triangle) {
                        return triangle.perimeter();
                    }
                },
                new CheckFunction() {

                    @Override
                    public boolean function(Triangle triangle) {
                        return triangle.isRectangular();
                    }
                });
    }
    public Triangle RectangularByMaxArea() {
        return triangleByProperty(
                new ValueFunction() {
                    @Override
                    public double get(Triangle triangle) {
                        return triangle.Area();
                    }
                },
                new CheckFunction() {

                    @Override
                    public boolean function(Triangle triangle) {
                        return triangle.isRectangular();
                    }
                });
    }
    public Triangle EquilateralByMaxPerimeter() {
        return triangleByProperty(
                new ValueFunction() {
                    @Override
                    public double get(Triangle triangle) {
                        return triangle.perimeter();
                    }
                },
                new CheckFunction() {

                    @Override
                    public boolean function(Triangle triangle) {
                        return triangle.isEquilateral();
                    }
                });
    }
    public Triangle EquilateralByMaxArea() {
        return triangleByProperty(
                new ValueFunction() {
                    @Override
                    public double get(Triangle triangle) {
                        return triangle.Area();
                    }
                },
                new CheckFunction() {

                    @Override
                    public boolean function(Triangle triangle) {
                        return triangle.isEquilateral();
                    }
                });
    }

    public int countEquilateral() { return sortTriangle(Triangle::isEquilateral); }
    public int countIsosceles() { return sortTriangle(Triangle::isIsosceles); }
    public int countRectangular() {
        return sortTriangle(Triangle::isRectangular);
    }
    public int countArbitrary() {
        return sortTriangle(Triangle::isArbitrary);
    }
    public Triangle[] getTriangles() {
        return triangles;
    }
    public void setTriangles(Triangle[] triangles) {
        this.triangles = triangles;
    }


}
