public class Triangle {

    public double perimeter;
    public double area;
    public String typeTriangle;
    private double ab;
    private double bc;
    private double ac;

    Triangle(Point a, Point b, Point c) {

        this.ab = ab;
        this.bc = bc;
        this.ac = ac;
        ab = TriangleProcessor.sizeSide(a, b);
        bc = TriangleProcessor.sizeSide(b, c);
        ac = TriangleProcessor.sizeSide(a, c);
    }

    public double Perimeter() {
        perimeter = ab + bc + ac;
        return perimeter;
    }

    public void formulaHeron() {
        double p;
        p = getPerimeter() / 2;
        area = Math.sqrt(p * (p - ab) * (p - bc) * (p - ac));
    }

    public void triangleType() {

        if (ab > 0 && bc > 0 && ac > 0) {
            if (ab <= bc + ac && bc <= ab + ac && ac <= bc + ab) {
                if (ab == bc && bc == ac && ac == ab) {
                    typeTriangle = "Equilateral";

                    return;
                } else if (ab == bc || bc == ac || ac == ab) {
                    typeTriangle = "Isosceles";
                    return;
                } else if (Math.round(Math.pow(ac, 2)) == (Math.pow(ab, 2) + Math.pow(bc, 2))) {
                    typeTriangle = "Right";
                    return;
                } else {
                    typeTriangle = "random";
                    return;
                }
            } else {
                typeTriangle = "Triangle does not exist";
                return;
            }
        } else {
            typeTriangle = "Incorrect data";
            return;
        }
    }

    public String toString() {
        return "Perimeter: " + perimeter + " Area: " + area + " Type: " + typeTriangle + "\n";
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

    public String getTypeTriangle() {
        return typeTriangle;
    }

    public void setTypeTriangle(String typeTriangle) {
        this.typeTriangle = typeTriangle;
    }

}
