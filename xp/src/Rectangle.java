public class Rectangle {
    double l;
    double L;

    public double getArea() {
        return l * L;
    }

    public Rectangle(double l, double L) {
        this.l = l;
        this.L = L;
    }

    public static void main(String[] args) {
        Rectangle r1 = new Rectangle(4, 5);
        Rectangle r2 = new Rectangle(5, 8);
        System.out.println("Rectangle 1's Area: " + r1.getArea());
        System.out.println("Rectangle 2's Area: " + r2.getArea());
    }
}