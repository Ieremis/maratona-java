package ieremis.maratonajava.introducao;

public class Aula04Operadores {
    public static void main(String[] args) {
        int numero01 = 10;
        int numero02 = 20;

        double resultado = numero01 / numero02;
        System.out.println(resultado); //como as duas variaveis utilizadas sao int, mesmo o resultado sendo double, sera calculado com int

        double numero03 = 10;
        int numero04 = 20;

        double resultado02 = numero03 / numero04;
        System.out.println(resultado02);
    }
}
