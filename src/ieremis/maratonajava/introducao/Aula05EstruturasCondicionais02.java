package ieremis.maratonajava.introducao;

public class Aula05EstruturasCondicionais02 {
    public static void main(String[] args) {
        int nota = 3;

        if(nota >= 8){
            System.out.println("Passou tranquilo!");
        }
        else if (nota >= 6){
            System.out.println("Passou raspando!");
        }
        else{
            System.out.println("Ficou de recuperação!");
        }
    }
}
