package ieremis.maratonajava.introducao;

public class Aula04Operadores {
    public static void main(String[] args) {
        //+ - * /
        int numero01 = 10;
        int numero02 = 20;

        double resultadoComInt = numero01 / numero02;
        System.out.println("resultadoComInt " + resultadoComInt); //como as duas variaveis utilizadas sao int, mesmo o resultado sendo double, sera calculado com int

        double numero03 = 10;
        int numero04 = 20;

        double resultadoComDouble = numero03 / numero04;
        System.out.println("resultadoComDouble " + resultadoComDouble); //imprime corretamente, mesmo somente uma variavel sendo double


        //%
        int resto = 20 % 2; //% é um operador para RESTO
        System.out.println("resto " + resto);

        //< > <= >= == !=
        boolean isDezMaiorQueVinte = 10 > 20;
        boolean isDezMenorQueVinte = 10 < 20;
        boolean isDezIgualAVinte = 10 == 20;
        boolean isDezIgualADez = 10 == 10;
        boolean isDezDiferenteDeDez = 10 != 10;
        System.out.println("isDezMaiorQueVinte " + isDezMaiorQueVinte);
        System.out.println("isDezMenorQueVinte " + isDezMenorQueVinte);
        System.out.println("isDezIgualAVinte " + isDezIgualAVinte);
        System.out.println("isDezIgualADez " + isDezIgualADez);
        System.out.println("isDezDiferenteDeDez " + isDezDiferenteDeDez);

        //&& AND
        int idadeAtual = 22;
        boolean isAdulto = idadeAtual >= 18 && idadeAtual < 60;
        System.out.println("isAdulto " + isAdulto);

    }
}
