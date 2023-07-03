import java.util.Scanner;

public class Lab_07_Problem_08 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double temperature;

        do {
            System.out.print("Enter the temperature in Fahrenheit: ");
            while (!scanner.hasNextDouble()) {
                System.out.println("Invalid input. Please enter a valid number.");
                System.out.print("Enter the temperature in Fahrenheit: ");
                scanner.next();
            }
            temperature = scanner.nextDouble();

            double celsius = (temperature - 32) * 5 / 9;
            System.out.println("Temperature in Celsius: " + celsius);
        } while (temperature < -459.67); // check if temp is below absolute zero


            scanner.close();

    }
}
