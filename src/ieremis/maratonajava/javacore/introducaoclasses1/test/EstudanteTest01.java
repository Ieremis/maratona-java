package ieremis.maratonajava.javacore.introducaoclasses1.test;

import ieremis.maratonajava.javacore.introducaoclasses1.dominio.Estudante;

public class EstudanteTest01 {
    public static void main(String[] args) {
        Estudante estudante = new Estudante();
        estudante.nome = "Ieremis";
        estudante.sexo = 'M';
        estudante.idade = 22;

        System.out.println(estudante.nome);
        System.out.println(estudante.sexo);
        System.out.println(estudante.idade);

    }
}
