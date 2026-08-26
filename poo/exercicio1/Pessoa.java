package poo.exercicio1;

public class Pessoa {
    public String nome;
    public int idade;
    public double altura;

    public Pessoa(String nome, int idade, double altura) {
        this.nome = nome;
        this.idade = idade;
        this.altura = altura;
    }

    public String info() {
        return "Nome: " + nome + " Idade: " + idade + " Altura: " + altura;
    }

    public String verificarIdade() {
        if (idade >= 18) {
            return nome + " é maior de idade";
        } else  {
            return nome + " é menor de idade";
        }
    }
}