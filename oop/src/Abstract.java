//Uma classe abstrata é uma classe que serve como base para outras classes. Ela não pode ser instanciada diretamente.

abstract class Pagamento {

    abstract void processar(double valor);   //Metodo abstrato obriga as classes filhas a implementar

}

class Pix extends Pagamento {
    @Override
    void processar(double valor) {
        System.out.println("Pagamento Pix realizado: R$ " + valor);
    }
}

class Cartao extends Pagamento {

    @Override
    void processar(double valor) {
        System.out.println("Pagamento Cartão realizado: R$ " + valor);

    }
}


public class Abstract {
    public static void main(String[] args) {

    Pagamento transacao1 = new Pix();
    Pagamento transacao2 = new Cartao();

    transacao1.processar(100);
    transacao2.processar(1000);

    }
}
