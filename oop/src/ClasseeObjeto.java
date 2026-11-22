class Carro {              // Classe

    String modelo;         // Caracteristicas (Atributos)
    String cor;
    int ano;

}


public class ClasseeObjeto {
    public static void main(String[] args) {

        Carro meuCarro = new Carro();      // Criação do Objeto

        meuCarro.modelo = "Honda Civic ";
        meuCarro.cor = "Preto ";
        meuCarro.ano = 2026;

        System.out.println(meuCarro.modelo);
        System.out.println(meuCarro.cor);
        System.out.println(meuCarro.ano);

    }
}
