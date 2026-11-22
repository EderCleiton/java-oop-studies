class ContaBancaria {

    //Proteção dos atributos, assim outras classes não poderão acessa-las diretamente.
    private String titular;
    private double saldo;

    //Construtor
    ContaBancaria(String titular, double saldo) {
        this.titular = titular;
        this.saldo = saldo;

    }

    //Getter - Retorna o Saldo
    public double getSaldo() {
        return saldo;
    }

    //Metódos para controlar o atributo "Saldo"
    void depositar(double valor) {
        if (valor > 0) {
            saldo = saldo + valor;

        } else {
            System.out.println("Valor Negativo");
        }
    }
}


public class Encapsulamento {
    public static void main(String[] args) {

    ContaBancaria usuario1 = new ContaBancaria("Cris",1000);

    usuario1.depositar(500);

    System.out.println(usuario1.getSaldo());

    }
}
