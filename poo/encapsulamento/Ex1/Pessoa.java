package poo.encapsulamento.Ex1;

public class Pessoa {
    private String nome;
    private int idade;

    public Pessoa(String nome, int idade) {
        this.nome = nome;
        setIdade(idade);
    }

    public String getNome() {
        return nome;
    }

    public int getIdade() { return idade; }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setIdade(int idade) {
        if (idade >= 0) {
            this.idade = idade;
        } else {
            // Você passou um argumento inválido para esse metodo
            throw new IllegalArgumentException("Idade não pode ser negativa");
        }
    }
}
