package biggerthan3;

import java.util.Scanner;

public class Biggerthan3 {

    public static void main(String[] args) {
        int big;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Write a number");
        int variable_1 = scanner.nextInt();

        System.out.println("Write a second number");
        int variable_2 = scanner.nextInt();

        System.out.println("Write the third number");
        int variable_3 = scanner.nextInt();

        // Cambio en la condición y agregado del operador de igualdad (>=)
        if (variable_1 >= variable_2 && variable_1 >= variable_3) {
            big = variable_1;
            System.out.println("The biggest number is: " + big);
        } else if (variable_2 >= variable_1 && variable_2 >= variable_3) {
            // Cambio en la condición y asignación de 'big'
            big = variable_2;
            System.out.println("The biggest number is:" + big);
        } else if (variable_3 >= variable_1 && variable_3 >= variable_2) {
            // Cambio en la condición y asignación de 'big'
            big = variable_3;
            System.out.println("The biggest number is:" + big);
        }
    }
}
