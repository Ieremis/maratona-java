package ieremis.maratonajava.javacore.associacao.test;

import ieremis.maratonajava.javacore.associacao.dominio.Jogador;
import ieremis.maratonajava.javacore.associacao.dominio.Time;

public class JogadorTest02 {
    public static void main(String[] args) {
        Jogador jogador1 = new Jogador("Pelé");
        Time time1 = new Time("Seleção Brasileira");

        jogador1.setTime(time1);
        jogador1.imprime();

        Jogador jogador2 = new Jogador("Kaká");

        jogador2.setTime(time1);
        jogador2.imprime();
    }
}
