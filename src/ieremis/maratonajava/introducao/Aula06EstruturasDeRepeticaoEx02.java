package ieremis.maratonajava.introducao;

public class Aula06EstruturasDeRepeticaoEx02 {
    public static void main(String[] args) {
        double valorCarro = 50000;
        double valorParcelaMax = 500;

        for (int parcela = 1; parcela <= valorCarro; parcela++) {
            double valorParcela = valorCarro / parcela;

            if(valorParcela < valorParcelaMax){
                break;
            }
            System.out.println("Parcela " + parcela + " R$" + valorParcela);

        }

    }
}
