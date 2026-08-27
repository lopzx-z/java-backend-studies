package poo.encapsulamento.Ex2;

public class Main {
    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa("Maria", 18);

        pessoa.setNome("Ana");
        pessoa.setIdade(19);

        System.out.println(pessoa.getNome());
        System.out.print(pessoa.getIdade());
    }
}
