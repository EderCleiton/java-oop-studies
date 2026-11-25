//Classe Pai
class Automovel {
    private String marca;
    private String modelo;

    public Automovel(String marca, String modelo) {
        this.marca = marca;
        this.modelo = modelo;
    }

    void ligar() {
        System.out.println("Veiculo Ligado!");
    }
}

//Classe Filha
class Auto extends Automovel {       // Car herda de Veiculo

    public Auto(String marca, String modelo){

    super(marca,modelo);    //Para poder usar o construtor da Classe Pai
    }

    void buzinar() {
        System.out.println("Beep beep");

    }
}


public class Heranca {
    public static void main(String[] args) {
        Auto meucarro = new Auto("Ford","KA");

        meucarro.ligar();        //Uso do metódo da Classe Pai
        meucarro.buzinar();      //Uso do metódo da Classe Filha

    }
}
