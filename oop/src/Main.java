interface Voador{
void voar();
}

class Passaro implements Voador{
@Override
public void voar(){
System.out.println("O passáro está voando");}
}


public class Main {
    public static void main(String[] args) {

        Passaro pass = new Passaro();

        pass.voar();
    }
}