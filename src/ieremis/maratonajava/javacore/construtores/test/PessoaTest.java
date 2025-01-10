package ieremis.maratonajava.javacore.construtores.test;

import ieremis.maratonajava.javacore.construtores.dominio.Pessoa;

public class PessoaTest {
    public static void main(String[] args) {
        Pessoa pessoa1 = new Pessoa("Ieremis", "Bonini", 22, "10/07/2002");
        pessoa1.imprime();

        Pessoa pessoa2 = new Pessoa();
        pessoa2.imprime();

        Pessoa pessoa3 = new Pessoa("Gabriel", "Silva", 23, "10/07/2001", "Paula");
        pessoa3.imprime();
    }
}
