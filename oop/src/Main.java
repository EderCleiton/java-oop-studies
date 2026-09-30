
class Pessoa {
    private String nome;
    private int idade;

    Pessoa(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

    String getNome() {
        return nome;
    }



    void apresentar() {
        System.out.println("Olá, meu nome é " + nome + " e tenho " + idade + " anos");
    }
}

public class Main {
    public static void main(String[] args) {

        Pessoa user = new Pessoa("Ana", 20);

        System.out.println(user.getNome());

    }
}