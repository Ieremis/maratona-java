package ieremis.maratonajava.javacore.introducaoclasses2.test;

import ieremis.maratonajava.javacore.introducaoclasses2.dominio.Calculadora;

public class CalculadoraTest {
    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora();

        calculadora.somaDoisNumeros();
        calculadora.subtraiDoisNumeros();
        calculadora.multiplicaDoisNumeros(10,10);

        double result = calculadora.divideDoisNumeros(10, 2);
        System.out.println(result); //ou System.out.println(calculadora.divideDoisNumeros(10, 2))

        calculadora.divideDoisNumerosComReturn(10, 0);
        calculadora.divideDoisNumerosComReturn(10, 2);

    }
}
