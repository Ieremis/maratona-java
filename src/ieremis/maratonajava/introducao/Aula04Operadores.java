package ieremis.maratonajava.introducao;

public class Aula04Operadores {
    public static void main(String[] args) {
        //+ - * /
        int numero01 = 10;
        int numero02 = 20;

        double resultadoComInt = numero01 / numero02;
        //System.out.println("resultadoComInt " + resultadoComInt); //como as duas variaveis utilizadas sao int, mesmo o resultado sendo double, sera calculado com int

        double numero03 = 10;
        int numero04 = 20;

        double resultadoComDouble = numero03 / numero04;
        //System.out.println("resultadoComDouble " + resultadoComDouble); //imprime corretamente, mesmo somente uma variavel sendo double


        //%
        int resto = 20 % 2; //% é um operador para RESTO
        //System.out.println("resto " + resto);

        //< > <= >= == !=
        boolean isDezMaiorQueVinte = 10 > 20;
        boolean isDezMenorQueVinte = 10 < 20;
        boolean isDezIgualAVinte = 10 == 20;
        boolean isDezIgualADez = 10 == 10;
        boolean isDezDiferenteDeDez = 10 != 10;
        //System.out.println("isDezMaiorQueVinte " + isDezMaiorQueVinte);
        //System.out.println("isDezMenorQueVinte " + isDezMenorQueVinte);
        //System.out.println("isDezIgualAVinte " + isDezIgualAVinte);
        //System.out.println("isDezIgualADez " + isDezIgualADez);
        //System.out.println("isDezDiferenteDeDez " + isDezDiferenteDeDez);

        //&& AND
        int idadeAtual = 17;
        boolean isAdulto = idadeAtual >= 18 && idadeAtual < 60;
        //System.out.println("isAdulto " + isAdulto);

        //|| OR
        double valorTotalContaCorrente = 200;
        double valorTotalContaPoupanca = 5000;
        float valorVideogame = 3500f;
        boolean isVideogameAcessivel = valorTotalContaCorrente > valorVideogame || valorTotalContaPoupanca > valorVideogame;
        //System.out.println("isVideogameAcessivel " + isVideogameAcessivel);

        //= += -= *= /= %=
        double bonus = 1800;
        bonus = 2000;
        //System.out.println(bonus);

        bonus += 1000;
        //System.out.println(bonus);

        bonus -= 1000;
        //System.out.println(bonus);

        bonus *= 2;
        //System.out.println(bonus);

        bonus /= 2;
        //System.out.println(bonus);

        bonus %= 2;
        //System.out.println(bonus);

        int contador = 0;
        System.out.println(contador++); //primeiro ele printa o 0 e depois incrementa
        System.out.println(++contador); //primeiro ele incrementa o valor, e depois printa

    }
}
