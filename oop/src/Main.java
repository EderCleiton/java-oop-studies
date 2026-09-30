class Cachorro {
    String nome;

    void apresentar() {
        System.out.println("Meu nome é " + nome);
    }
}

public class Main {
    public static void main(String[] args) {

    Cachorro dog1 = new Cachorro();
    Cachorro dog2 = new Cachorro();
    dog2.nome = "Bob";
    dog1.nome = "Rex";
    dog1.apresentar();
    dog2.apresentar();

    }
}