public class TriangleProcessor {

    Triangle[] triangles;

    public TriangleProcessor(Triangle[] triangles) {
        this.triangles = triangles;
    }


    public static double sizeSide(Point p1, Point p2) {
        double size;
        size = Math.sqrt(Math.pow(p1.getX() - p2.getX(), 2) + Math.pow(p1.getY() - p2.getY(), 2));
        return size;
    }

    private static void print(Triangle triangle, int number) {
        System.out.println("perimeter = " + triangle.getPerimeter() +
                ", square = " + triangle.getArea());
    }


    private static void findMinMaxValues(Triangle[] triangles) {
        double maxPerimeter = 0;
        double minPerimeter = 0;
        double maxArea = 0;
        double minArea = 0;

        for (int i = 0; i < triangles.length; i++) {
            if (triangles[i].getPerimeter() >= maxPerimeter) {
                maxPerimeter = triangles[i].getPerimeter();
            }

            if (triangles[i].getPerimeter() <= minPerimeter) {
                minPerimeter = triangles[i].getPerimeter();
            }

            if (triangles[i].getArea() >= maxArea) {
                maxArea = triangles[i].getArea();
            }

            if (triangles[i].getArea() >= minArea) {
                minArea = triangles[i].getArea();
            }

        }
        System.out.println(maxPerimeter);
        System.out.println(minPerimeter);
        System.out.println(maxArea);
        System.out.println(minArea);
    }
}
