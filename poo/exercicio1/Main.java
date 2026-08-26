package poo.exercicio1;

public class Main {
    public static void main(String[] args) {
        Pessoa joao = new Pessoa("João", 19, 1.70);

        System.out.print(joao.info() + "\n");
        System.out.print(joao.verificarIdade());
    }
}
