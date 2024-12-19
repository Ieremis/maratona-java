package ieremis.maratonajava.introducao;

public class Aula05EstruturasCondicionais01 {
    public static void main(String[] args){
        int idade = 17;
        boolean isMaiorDeIdade = idade >= 18;

        if(isMaiorDeIdade) {
            System.out.println("É maior de idade");
        }else {
            System.out.println("É menor de idade");
        }

    }
}
