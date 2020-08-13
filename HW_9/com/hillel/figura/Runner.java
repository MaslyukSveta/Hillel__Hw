package com.hillel.figura;
import com.hillel.figura.triangle.Triangle;
import com.hillel.figura.triangleProcessor.TriangleProcessor;
import com.hillel.figura.triangle.Point;

public class Runner {
    Triangle triangle1 = new Triangle(new Point(5, 6), new Point(4, 11), new Point(7, 7));
    Triangle triangle2 = new Triangle(new Point(1, 1), new Point(4, -8), new Point(12, 2));
    Triangle triangle3 = new Triangle(new Point(1, 0), new Point(0, 0), new Point(0, 1));
    Triangle triangle4 = new Triangle(new Point(0, 0), new Point(-6, 0), new Point(0, -5));
    Triangle triangle5 = new Triangle(new Point(-7, 2), new Point(-6, 12), new Point(4, 11));
    Triangle triangle6 = new Triangle(new Point(2, 2), new Point(5, 2), new Point(5, 6));
    Triangle triangle7 = new Triangle(new Point(-10, 5), new Point(-10, -3), new Point(1, 3));
    Triangle triangle8 = new Triangle(new Point(5, 6), new Point(4, 11), new Point(7, 7));
    Triangle triangle9 = new Triangle(new Point(7, 7), new Point(15, 7), new Point(11, 8));
    Triangle triangle10 = new Triangle(new Point(6, 1), new Point(6, -5), new Point(7, -2));
    Triangle triangle11 = new Triangle(new Point(1, 0), new Point(0, 0), new Point(0, 1));
    Triangle triangle12 = new Triangle(new Point(1, 0), new Point(0, 0), new Point(0, 1));

    Triangle[] triangles = new Triangle[]{triangle1, triangle2, triangle3, triangle4, triangle5, triangle6,
            triangle7, triangle8, triangle9, triangle10, triangle11, triangle12};

    TriangleProcessor processor = new TriangleProcessor(triangles);

        System.out.println("The number of triangles of various types:");
        System.out.println("Equilateral: " + processor.countEquilateral());
        System.out.println("Arbitrary: " + processor.countArbitrary());
        System.out.println("Rectangular: " + processor.countRectangular());
        System.out.println("Isosceles: " + processor.countIsosceles());
        System.out.println("Triangle with maximum perimeter is " + processor.maxPerimeter());
        System.out.println("Triangle with minimum perimeter is " + processor.minPerimeter());
        System.out.println("Triangle with maximum area is " + processor.maxArea());
        System.out.println("Triangle with minimum area is " + processor.minArea());

}

}
