package ieremis.maratonajava.introducao;

public class Aula07Arrays02 {
    public static void main(String[] args) {
        int [] idades = new int[3];
        idades[0] = 21;
        idades[1] = 15;
        idades[2] = 30;

        for (int i = 0; i < idades.length; i++) {
            System.out.println(idades[i]);
        }
    }
}
