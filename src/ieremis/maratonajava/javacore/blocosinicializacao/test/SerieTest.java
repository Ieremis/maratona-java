package ieremis.maratonajava.javacore.blocosinicializacao.test;

import ieremis.maratonajava.javacore.blocosinicializacao.dominio.Serie;

public class SerieTest {
    public static void main(String[] args) {
        Serie serie = new Serie("Seinfeld");

        for (int episodio : serie.getEpisodios()) {
            System.out.print(episodio + " ");
        }

    }
}
