package ieremis.maratonajava.introducao;
import java.util.Scanner;
public class Aula05EstruturasCondicionaisEx02 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Insira um dia da semana (número): ");
        int dia = scanner.nextInt();

        switch (dia){
            case 1:
                System.out.println("Domingo é fim de semana!");
                break;
            case 2:
                System.out.println("Segunda é dia útil!");
                break;
            case 3:
                System.out.println("Terça é dia útil!");
                break;
            case 4:
                System.out.println("Quarta é dia útil!");
                break;
            case 5:
                System.out.println("Quinta é dia útil!");
                break;
            case 6:
                System.out.println("Sexta é dia útil!");
                break;
            case 7:
                System.out.println("Sábado é fim de semana!");
                break;
            default:
                System.out.println("Insira um dia válido!");
                break;
        }
    }
}
