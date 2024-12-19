package ieremis.maratonajava.introducao;

import java.util.Scanner;

public class Aula05EstruturasCondicionaisEx01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double tetoInicial = 34712;
        double tetoFinal = 68507;
        double taxa = 0;
        double valorImposto = 0;

        System.out.println("Insira seu salário anual: ");
        double salario = scanner.nextDouble();

        if(salario <= tetoInicial){
            taxa = 9.70;
            valorImposto = salario * (taxa / 100);
        }
        else if(salario <= tetoFinal){
            taxa = 37.35;
            valorImposto = salario * (taxa / 100);
        }
        else{
            taxa = 49.50;
            valorImposto = salario * (taxa / 100);
        }

        System.out.println("Sua taxa de imposto anual na Holanda é " + taxa + "%");
        System.out.println("Valor do imposto pago: " + valorImposto);
    }
}
