package ieremis.maratonajava.javacore.introducaometodos.test;

import ieremis.maratonajava.javacore.introducaometodos.dominio.Estudante;

public class EstudanteTest02 {
    public static void main(String[] args) {
        Estudante estudante01 = new Estudante();
        Estudante estudante02 = new Estudante();

        estudante01.nome = "Marcelo";
        estudante01.idade = 27;
        estudante01.sexo = 'M';

        estudante02.nome = "Ieremis";
        estudante02.idade = 22;
        estudante02.sexo = 'M';

        estudante01.imprime();
        estudante02.imprime();
    }
}
