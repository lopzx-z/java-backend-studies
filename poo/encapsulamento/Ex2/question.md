# Exercício Encapsulamento

Crie uma classe Pessoa

private String nome; <br>
private int idade;

<hr>

### Regras:

nome não pode ser vazio.

idade deve estar entre 0 e 150.

Crie getters.

Crie setters.

Se tentar colocar um valor inválido, use IllegalArgumentException.

<hr>

### Teste:
Pessoa p = new Pessoa();

p.setNome("João");

p.setIdade(25);

System.out.println(p.getNome());

System.out.println(p.getIdade());
