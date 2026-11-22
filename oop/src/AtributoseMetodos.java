class Cachorro {

    String nome;  // Caracteristica (Atributos)

    void latir() {
        // Metódo
        System.out.println("Aua Aua, meu nome é " + nome);
    }
}



public class AtributoseMetodos {
    public static void main(String[] args) {

    Cachorro meuCachorro = new Cachorro();

    meuCachorro.nome = "Rex";

    meuCachorro.latir();               // Execução do Metódo

    }
}
