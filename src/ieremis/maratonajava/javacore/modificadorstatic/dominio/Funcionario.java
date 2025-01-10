package ieremis.maratonajava.javacore.modificadorstatic.dominio;

public class Funcionario {
    private String nome;
    private static int jornadaDeTrabalho = 8;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public static int getJornadaDeTrabalho() {
        return jornadaDeTrabalho;
    }

    public static void setJornadaDeTrabalho(int jornadaDeTrabalho) {
        Funcionario.jornadaDeTrabalho = jornadaDeTrabalho;
    }

    public void imprime(){
        System.out.println("----------");
        System.out.println(this.nome);
        System.out.println(this.jornadaDeTrabalho);
    }
}
