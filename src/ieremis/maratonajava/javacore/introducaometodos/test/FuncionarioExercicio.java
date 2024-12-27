package ieremis.maratonajava.javacore.introducaometodos.test;

import ieremis.maratonajava.javacore.introducaometodos.dominio.Funcionario;

public class FuncionarioExercicio {
    public static void main(String[] args) {
        Funcionario funcionario1 = new Funcionario();

        funcionario1.nome = "Ieremis";
        funcionario1.idade = 22;
        funcionario1.salarios = new double[]{600, 1200, 2600};
        funcionario1.imprimeFuncionario();
        System.out.println("-------------------");
        System.out.println("Média salarial: " + funcionario1.calculaMediaSalario());
        System.out.println("-------------------");
        System.out.println("Média salarial com VarArgs: " + funcionario1.calculaMediaComVarArgs(1000,1000,1000));
    }
}
