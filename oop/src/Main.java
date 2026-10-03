
abstract class Animal {
    String nome;

    abstract void emitirSom();
}

class Cachorro extends Animal {

    @Override
    void emitirSom() {
        System.out.println("Aua Au");
    }
}
class Gato extends Animal{
    @Override
    void emitirSom() {
        System.out.println("Miau");
        }
}
public class Main {
    public static void main(String[] args) {

        Animal dog = new Cachorro();
        Animal cat = new Gato();

        dog.emitirSom();
        cat.emitirSom();
    }
}