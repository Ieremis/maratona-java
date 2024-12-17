package ieremis.maratonajava.introducao;

import java.util.Scanner;

public class Aula03TiposPrimitivosExercicio {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Insira seu nome: ");
        String nome = scanner.nextLine();

        System.out.println("Insira seu endereco de recebimento: ");
        String endereco = scanner.nextLine();

        System.out.println("Insira seu salario: ");
        float salario = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Insira a data de recebimento: ");
        String dataRecebimentoSalario= scanner.nextLine();

        System.out.println("Eu " + nome + ", morando no endereco " + endereco + ",\n" +
                "confirmo que recebi o salário de " + salario + ", na data " + dataRecebimentoSalario);

        scanner.close();
    }
}
