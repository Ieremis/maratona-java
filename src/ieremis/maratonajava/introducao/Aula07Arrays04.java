package ieremis.maratonajava.introducao;

public class Aula07Arrays04 {
    public static void main(String[] args) {
        //1,2,3,4,5 meses
        //31,28,31,30 dias
        int[][] dias = new int[3][3];

        dias[0][0] = 31;
        dias[0][1] = 28;
        dias[0][2] = 30;

        dias[1][0] = 31;
        dias[1][1] = 30;
        dias[1][2] = 31;

        for (int i = 0; i < dias.length; i++) {
            for (int j = 0; j < dias[i].length; j++) {
                System.out.println(dias[i][j]);
            }
        }
        System.out.println("-------------");
        //com foreach
        for (int[] arrBase : dias) { //cria um int[] pois é uma variavel temporaria referenciando um array
            for (int num : arrBase) { //depois cria a variavel temporaria agora referenciando um int normal pois é o que sera retornado, com referencia em cima da variavel arrBase
                System.out.println(num); //imprime o retorno
            }
        }


    }
}
