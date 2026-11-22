class Usuario {
    private String nome;

    //Retorna o nome
    public String getNome() {
        return nome;
    }

    //Modifica o nome
    public void setNome(String nome) {
        this.nome = nome;
    }
}


public class GetterSetter {
    public static void main(String[] args) {
        Usuario pessoa1 = new Usuario();

        pessoa1.setNome("Eder");

        System.out.println(pessoa1.getNome());
    }
}
