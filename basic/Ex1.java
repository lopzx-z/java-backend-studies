package basic;

import java.util.Scanner;

public class Ex1 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite seu email:");
        String email = scanner.nextLine();

        System.out.print("Digite sua senha:");
        String password = scanner.nextLine();

        if (email.equalsIgnoreCase("teste@teste.com") && password.equals("123")) {
            System.out.print("Login bem sucedido!");
        } else {
            System.out.print("Email ou senha incorretos");
        }

        scanner.close();
    }
}
