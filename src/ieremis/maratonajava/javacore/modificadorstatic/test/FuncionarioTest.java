package ieremis.maratonajava.javacore.modificadorstatic.test;

import ieremis.maratonajava.javacore.modificadorstatic.dominio.Funcionario;

public class FuncionarioTest {
    public static void main(String[] args) {
        Funcionario func1 = new Funcionario();
        func1.setNome("Ieremis");
        func1.setJornadaDeTrabalho(9);

        Funcionario func2 = new Funcionario();
        func2.setNome("Gabriel");
        func2.setJornadaDeTrabalho(10);

        Funcionario func3 = new Funcionario();
        func3.setNome("Igor");

        func1.imprime();
        func2.imprime();
        func3.imprime();
    }
}
