package basic;

import java.util.Scanner;

public class Ex4 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a nota de João: ");
        double note1 = scanner.nextDouble();

        System.out.print("Digite a nota de Maria: ");
        double note2 = scanner.nextDouble();

        System.out.print("Digite a nota de Kaiqui: ");
        double note3 = scanner.nextDouble();

        double media = (note1 + note2 + note3 ) / 3;

        System.out.print("A média dos três alunos é: " + media + System.lineSeparator());

        if (note1 >= 6) {
            System.out.print("João está aprovado" + System.lineSeparator());
        } else {
            System.out.print("João está reprovado" + System.lineSeparator());
        }

        if (note2 >= 6) {
            System.out.print("Maria está aprovada" + System.lineSeparator());
        } else {
            System.out.print("Maria está reprovada" + System.lineSeparator());
        }

        if (note3 >= 6) {
            System.out.print("Kaiqui está aprovado" + System.lineSeparator());
        } else {
            System.out.print("Kaiqui está reprovado" + System.lineSeparator());
        }

        scanner.close();
    }

}
