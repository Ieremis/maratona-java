package ieremis.maratonajava.javacore.associacao.test;

import ieremis.maratonajava.javacore.associacao.dominio.Escola;
import ieremis.maratonajava.javacore.associacao.dominio.Professor;

public class EscolaTest01 {
    public static void main(String[] args) {
        Professor professor1 = new Professor("Ieremis");
        Escola escola1 = new Escola("Microdata");

        escola1.setProfessores(new Professor[]{professor1});
        escola1.imprime();

        Professor professor2 = new Professor("Gabriel");

        escola1.setProfessores(new Professor[]{professor1, professor2});
        escola1.imprime();
    }
}
