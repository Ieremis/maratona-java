package ieremis.maratonajava.javacore.introducaometodos.test;

import ieremis.maratonajava.javacore.introducaometodos.dominio.Calculadora;

public class CalculadoraTest02 {
    public static void main(String[] args) {
        Calculadora calc = new Calculadora();
        int[] numeros = {1,2,3,4,5};

        calc.somaArrays(numeros);
        calc.somaVarArgs(1,2,3,4,5,6,7);
    }
}
