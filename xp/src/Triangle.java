public class Triangle {
    int a;
    int b;
    int c;
    int h;

    public double getArea() {
        return (double) 1/2 * (b * h);
    }

    public int getPerimeter() {
        return a + b + c;
    }
    public static void main(String[] args) {
        Triangle triangle = new Triangle();
        triangle.a = 3;
        triangle.b = 4;
        triangle.c = 5;
        triangle.h = 4;
        System.out.println("Perimeter = " + triangle.getPerimeter());
        System.out.println("Area = " + triangle.getArea());
    }
}
