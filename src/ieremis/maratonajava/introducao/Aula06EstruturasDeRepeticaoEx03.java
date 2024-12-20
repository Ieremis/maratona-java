package ieremis.maratonajava.introducao;

public class Aula06EstruturasDeRepeticaoEx03 {
    public static void main(String[] args) {
        double valorCarro = 50000;
        double valorParcelaMax = 1000;

        for (int parcela = (int) valorCarro; parcela  >= 1; parcela--) {
            double valorParcela = valorCarro / parcela;

            if (valorParcela < valorParcelaMax){
                continue; //aqui, primeiro ele vai percorrer o for até o valor da parcela começar a ser > 1000
                //quando o valor da parcela passar de 1000, ele começa a printar no console
            }

            System.out.println("Parcela " + parcela + " R$" + valorParcela);
        }
    }
}
