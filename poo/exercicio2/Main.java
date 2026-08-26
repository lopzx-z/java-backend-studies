package poo.exercicio2;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite 1 para ligar e 2 para desligar ");
        int interruptor = scanner.nextInt();

        Lampada lampada = new Lampada(false);

        if (interruptor == 1) {
            lampada.ligar();
            System.out.print(lampada.mostrarEstado());

        } else if (interruptor == 2){
            lampada.desligar();
            System.out.print(lampada.mostrarEstado());

        } else {
            System.out.print("Tente novamente");
        }
    }
}
