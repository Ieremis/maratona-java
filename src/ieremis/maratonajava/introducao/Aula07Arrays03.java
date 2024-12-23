package ieremis.maratonajava.introducao;

public class Aula07Arrays03 {
    public static void main(String[] args) {
        int[] numeros1 = new int[3];
        int[] numeros2 = {1,2,3,4,5};
        int[] numeros3 = new int[]{1,3,4};

        for (int i = 0; i < numeros2.length; i++) {
            System.out.println(numeros2[i]);
        }
        for (int i:numeros3){
            System.out.println(i); //itera pelo array e printa os valores dos espaços
        }
    }
}
