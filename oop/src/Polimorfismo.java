class Animal {
    private String nome;

    public void emitirSom() {
        System.out.println("Som genérico!");
    }

}

class Gato extends Animal {

    @Override                   // Subrescrever
    public void emitirSom() {
    System.out.println("Miau!");

    }
}



public class Polimorfismo{
    public static void main(String[] args) {

    Animal meuGato = new Gato();         // Tipo Animal mas Objeto diferente Gato

    meuGato.emitirSom();

    }
}
