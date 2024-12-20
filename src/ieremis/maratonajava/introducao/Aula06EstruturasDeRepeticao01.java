package ieremis.maratonajava.introducao;

public class Aula06EstruturasDeRepeticao01 {
    public static void main(String[] args) {
        //while, do while, for
        int count = 0;
        while (count < 10){
            System.out.println(count);
            count++;
        }
        // do while sempre executa o código do bloco pelo menos uma vez, e depois verifica a condição
        do {
            System.out.println("dentro do do-while");
        }while (count < 10);

        for(int i = 0; i < 10; i++){
            System.out.println("dentro do for " + i);
        }
    }
}
