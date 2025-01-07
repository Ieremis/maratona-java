package ieremis.maratonajava.javacore.introducaometodos.test;

import ieremis.maratonajava.javacore.introducaometodos.dominio.Pessoa;

public class PessoaTest {
    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa();

        pessoa.setNome("Ieremis");
        pessoa.setIdade(22);

        System.out.println("Nome: " + pessoa.getNome());
        System.out.println("Idade: " + pessoa.getIdade());
    }
}
