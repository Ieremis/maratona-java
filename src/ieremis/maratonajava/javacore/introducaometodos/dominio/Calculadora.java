package ieremis.maratonajava.javacore.introducaometodos.dominio;

public class Calculadora {

    public void somaDoisNumeros() {
        System.out.println(10 + 10);

    }

    public void subtraiDoisNumeros() {
        System.out.println(21 - 2);
    }

    public void multiplicaDoisNumeros(int num1, int num2) {
        System.out.println(num1 * num2);
    }

    public double divideDoisNumeros(double num1, double num2) {
        return num1 / num2;
    }

    public void divideDoisNumerosComReturn(double num1, double num2) {
        if (num2 == 0) {
            System.out.println("Não existe divisão por 0");
            return;
        }
        System.out.println(num1 / num2);
    }

    public void somaArrays(int[] array){
        int soma = 0;
        for(int num:array){
            soma += num;
        }
        System.out.println(soma);
    }

    public void somaVarArgs(int... array){
        int soma = 0;
        for(int num:array){
            soma += num;
        }
        System.out.println(soma);
    }
}
