package ieremis.maratonajava.introducao;

public class Aula05EstruturasCondicionais03 {
    public static void main(String[] args) {
        //OPERADOR TERNÁRIO
        //(condicao) ? verdadeiro : falso

        int nota = 6;
        String msgPassou = "Você passou de ano!";
        String msgNaoPassou = "Você repetiu de ano!";

        String resultado = nota >= 6 ? msgPassou : msgNaoPassou;
        System.out.println(resultado);
    }
}
