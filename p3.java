
//Write a Java program to find area and perimeter of a circle using class
import java.util.*;

class p3 {
    static Scanner sc = new Scanner(System.in);

    double area(double a) {
        double area = (Math.PI * a * a);
        return area;
    }

    public static void main(String[] args) {
        p3 a1 = new p3();
        System.out.print("Enter radius:");
        double r = sc.nextDouble();
        System.out.println("Area is:" + a1.area(r));
    }
}