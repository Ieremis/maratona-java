package ieremis.maratonajava.javacore.associacao.dominio;

public class Jogador {
    private String nome;
    private Time time;

    public Jogador(String nome){
        this.nome = nome;
    }

    public void imprime(){
        System.out.println(this.nome);
        if(time == null){
            return;
        }
        else{
            System.out.println(this.time.getNome());
        }
    }

    public void setTime(Time time) {
        this.time = time;
    }
}
