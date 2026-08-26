package basic;

import java.util.Scanner;

public class Ex5 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um número: ");
        int number = scanner.nextInt();

        int resultado = number % 2;

        if (resultado == 0) {
            System.out.print("O número " + number + " é par");
        } else {
            System.out.print("O número " + number + " é ímpar");
        }

        scanner.close();
    }

}
