import java.util.Scanner;

public class MyOrder {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Food Menu");
        System.out.println("1. Pizza");
        System.out.println("2. Burger");
        System.out.println("3. Salad");
        System.out.print("Enter your menu option: ");

        // Requirement 1: Validate input type
        if (!input.hasNextInt()) {
            System.out.println("Invalid input. Please enter a number between 1 and 3.");
            return;
        }

        int option = input.nextInt();

        // Requirement 2: Validate input range
        if (option < 1 || option > 3) {
            System.out.println("Invalid menu option. Please enter a number between 1 and 3.");
            return;
        }

        // Valid menu options
        if (option == 1) {
            System.out.println("You selected Pizza.");
        } else if (option == 2) {
            System.out.println("You selected Burger.");
        } else {
            System.out.println("You selected Salad.");
        }

        input.close();
    }
}