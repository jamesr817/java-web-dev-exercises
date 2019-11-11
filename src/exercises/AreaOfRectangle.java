package exercises;
import java.util.Scanner;

public class AreaOfRectangle {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter length of rectangle: ");
        int l = input.nextInt();

        System.out.println("Enter width of rectangle: ");
        int w = input.nextInt();

        input.close();

        int area = l * w;
        System.out.println("The area of this rectangle is " + area);

    }

}
