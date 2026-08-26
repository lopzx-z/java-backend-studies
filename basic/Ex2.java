package basic;

import java.util.Scanner;

public class Ex2 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite seu nome: ");
        String name = scanner.nextLine();

        System.out.print("Digite sua idade: ");
        int age = scanner.nextInt();

        System.out.print("Olá, " + name + "! Você tem " + age + " anos.");

        scanner.close();
    }

}
