import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input user
        int inputUser = scanner.nextInt();

        // How many 100 dollar bills
        int the_division_100 = inputUser / 100; // print
        int Subtraction_division_100 = inputUser - (100 * the_division_100);

        // How many 50 dollar bills
        int the_division_50 = Subtraction_division_100 / 50; // print
        int Subtraction_division_50 = Subtraction_division_100 - (50 * the_division_50);

        // How many 20 dollar bills
        int the_division_20 = Subtraction_division_50 / 20; // print
        int Subtraction_division_20 = Subtraction_division_50 - (20 * the_division_20);

        // How many 10 dollar bills
        int the_division_10 = Subtraction_division_20 / 10; // print
        int Subtraction_division_10 = Subtraction_division_20 - (10 * the_division_10);

        // How many 5 dollar bills
        int the_division_5 = Subtraction_division_10 / 5; // print
        int Subtraction_division_5 = Subtraction_division_10 - (5 * the_division_5);

        // How many 2 dollar bills
        int the_division_2 = Subtraction_division_5 / 2; // print
        int Subtraction_division_2 = Subtraction_division_5 - (2 * the_division_2);

        // How many 1 dollar bills
        int the_division_1 = Subtraction_division_2; 

        System.out.println(the_division_100 + " nota(s) de R$ 100,00");
        System.out.println(the_division_50 + " nota(s) de R$ 50,00");
        System.out.println(the_division_20 + " nota(s) de R$ 20,00");
        System.out.println(the_division_10 + " nota(s) de R$ 10,00");
        System.out.println(the_division_5 + " nota(s) de R$ 5,00");
        System.out.println(the_division_2 + " nota(s) de R$ 2,00");
        System.out.println(the_division_1 + " nota(s) de R$ 1,00");
    }
}
