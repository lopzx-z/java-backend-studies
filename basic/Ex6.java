package basic;

import java.util.Scanner;

public class Ex6 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um número: ");
        int num1 = scanner.nextInt();

        System.out.print("Digite outro número: ");
        int num2 = scanner.nextInt();

        if (num1 > num2) {
            System.out.print(num1 + " é maior que " + num2);
        } else if (num2 > num1) {
            System.out.print(num2 + " é maior que " + num1);
        } else {
            System.out.print("Os números são iguais");
        }
    }
}
