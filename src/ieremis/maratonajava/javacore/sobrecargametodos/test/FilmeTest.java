package ieremis.maratonajava.javacore.sobrecargametodos.test;

import ieremis.maratonajava.javacore.sobrecargametodos.dominio.Filme;

public class FilmeTest {
    public static void main(String[] args) {
        Filme filme1 = new Filme();
        filme1.init("Pulp Fiction", "Cinema", 1994);
        filme1.imprime(); // vai retornar o genero como null

        Filme filme2 = new Filme();
        filme2.init("Interstellar", "Cinema", 2014, "SciFi"); //mesmo o método possuindo o mesmo nome, por conta da quantidade de parametros o Java sabe qual ele deve chamar
        filme2.imprime();
    }
}
