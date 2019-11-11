package exercises;
import java.util.Scanner;

public class MilesPerGallon {
    public static void main(String[] args) {
        double start;
        double end;
        double milesDriven;
        double gallonsUsed;
        double milesPerGallon;

        Scanner input = new Scanner(System.in);

        System.out.println("Mileage at start of trip: ");
        start = input.nextDouble();

        System.out.println("Mileages at end of trip: ");
        end = input.nextDouble();
        System.out.println("Enter gallons of gas used: ");
        gallonsUsed = input.nextDouble();
        milesDriven = end - start;

        milesPerGallon= milesDriven/gallonsUsed;
        System.out.println("You MPG is :" + milesPerGallon);

    }
}
