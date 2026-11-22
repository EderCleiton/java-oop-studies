
class Pessoa {
    String nome;
    int idade;
    String cidade;

    // Construtor
    Pessoa(String nome, int idade, String cidade) {
        this.nome = nome;
        this.idade = idade;
        this.cidade = cidade;
    }

    //Metódo
    void apresentar() {
        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade);
        System.out.println("Cidade: " + cidade);
    }

}


public class Construtor {
    public static void main(String[] args) {

        Pessoa pessoa1 = new Pessoa("Carlos", 25, "São Paulo");

        pessoa1.apresentar();

    }
}
