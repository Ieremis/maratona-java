package ieremis.maratonajava.introducao;

public class Aula07Arrays05 {
    public static void main(String[] args) {
        int[][] arrayInt = new int[3][];
        int[] array = {3, 4, 5, 6, 7};

        arrayInt[0] = new int[]{1, 2};
        arrayInt[1] = array; //referenciando um array dentro do array "pai"
        arrayInt[2] = new int[]{8, 9, 10, 11, 12};

        for (int[] arrayBase : arrayInt) {
            System.out.println("\n---------");
            for (int num : arrayBase) {
                System.out.print(num + " ");
            }
        }

        int[][] arrayInt2 = {{1,2},{3,4,5,6,7},{8,9,10,11,12}}; //inicializando o array multidimensional ja com a atribuição de valores
        for(int[] arrayBase: arrayInt2){
            System.out.println("\n------------");
            for(int valor: arrayBase){
                System.out.print(valor + " ");
            }
        }
    }
}
