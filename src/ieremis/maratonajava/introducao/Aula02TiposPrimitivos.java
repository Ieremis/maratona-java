package ieremis.maratonajava.introducao;

public class Aula02TiposPrimitivos {
    public static void main(String[] args){
         int idade = 10; //4 bytes
         long salarioLong = 3500; //8 bytes
         double salarioDouble = 2000.0; //8 bytes com decimal
         float salarioFloat = 2500.0f; //4 bytes com decimal
         byte idadeByte = 10; //1 byte
         short idadeShort = 10; //2 bytes
         boolean verdadeiro = true; //1 bit true ou false
         boolean falso = false;
         char caractere = 'M';

         System.out.println("A idade é " + idade + " anos");
         System.out.println(verdadeiro);
         System.out.println(falso);
    }
}
