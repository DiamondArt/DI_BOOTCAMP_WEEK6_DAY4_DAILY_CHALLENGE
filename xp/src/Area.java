import java.util.Scanner;

public class Area {
    int length;
    int breadth;

    public Area(int length, int breadth) {
        this.length = length;
        this.breadth = breadth;
    }

    public double returnArea() {
        return length * breadth;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter length: ");
        int length = sc.nextInt();
        System.out.println("Enter breadth: ");
        int breadth = sc.nextInt();
        sc.close();

        Area area = new Area(length, breadth);
        System.out.println("Area is: " + area.returnArea());
    }
}
