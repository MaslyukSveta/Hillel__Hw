public class Runner {
    public static void main(String[] args) {

        Triangle triangle1 = new Triangle(new Point(1, 0), new Point(0, 0), new Point(0, 1));
        Triangle triangle2 = new Triangle(new Point(1, 0), new Point(0, 0), new Point(0, 1));
        Triangle triangle3 = new Triangle(new Point(1, 0), new Point(0, 0), new Point(0, 1));
        Triangle triangle4 = new Triangle(new Point(1, 0), new Point(0, 0), new Point(0, 1));
        Triangle triangle5 = new Triangle(new Point(1, 0), new Point(0, 0), new Point(0, 1));
        Triangle triangle6 = new Triangle(new Point(1, 0), new Point(0, 0), new Point(0, 1));
        Triangle triangle7 = new Triangle(new Point(1, 0), new Point(0, 0), new Point(0, 1));
        Triangle triangle8 = new Triangle(new Point(1, 0), new Point(0, 0), new Point(0, 1));
        Triangle triangle9 = new Triangle(new Point(1, 0), new Point(0, 0), new Point(0, 1));
        Triangle triangle10 = new Triangle(new Point(1, 0), new Point(0, 0), new Point(0, 1));
        Triangle triangle11 = new Triangle(new Point(1, 0), new Point(0, 0), new Point(0, 1));
        Triangle triangle12 = new Triangle(new Point(1, 0), new Point(0, 0), new Point(0, 1));

        Triangle[] triangles = new Triangle[]{triangle1, triangle2, triangle3, triangle4, triangle5, triangle6,
                triangle7, triangle8, triangle9, triangle10, triangle11, triangle12};

        for (Triangle triangle : triangles) {
            triangle.Perimeter();
            triangle.formulaHeron();

        }


    }

}
