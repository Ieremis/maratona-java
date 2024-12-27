package ieremis.maratonajava.javacore.introducaometodos.dominio;

public class Estudante {
    public String nome;
    public int idade;
    public char sexo;

    public void imprime(){
        System.out.println("------------");
        System.out.println(this.nome); //poderia até tirar o this pois só existe esses 3 atributos na classe
        System.out.println(this.idade); //porém é uma boa pratica informar o this
        System.out.println(this.sexo);
    }
}
