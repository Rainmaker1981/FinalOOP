import java.util.Scanner;

public class OopDriver {
    public static void main(String[] args) {

        Trapezoid t1 = new Trapezoid(6, 8, 0);
        System.out.println(t1);
        System.out.println(t1.getArea());

        Scanner keyboard = new Scanner(System.in);
        System.out.print("How many circles do you want? ");
        int n = keyboard.nextInt();
        keyboard.nextLine();

        // make the array
        Circle[] circles = new Circle[n];

        // fill the array
        for (int i = 0; i < circles.length; i++) {
            circles[i] = new Circle(i);
        }

        // print array of circles
        for (int i = 0; i < circles.length; i++) {
            System.out.println((i + 1) + ": " + circles[i]);
        }

        keyboard.close();
    }
}
