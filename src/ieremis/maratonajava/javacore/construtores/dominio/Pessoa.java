package ieremis.maratonajava.javacore.construtores.dominio;

public class Pessoa {
    private String nome;
    private String sobrenome;
    private int idade;
    private String dataDeNascimento;
    private String nomeDaMae;

    public Pessoa(String nome, String sobrenome, int idade, String dataDeNascimento) {
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.idade = idade;
        this.dataDeNascimento = dataDeNascimento;
    } //isso é um Construtor
    //não se utiliza VOID em Construtor, apenas public NomeDaClasse

    public Pessoa() {

    }

    public Pessoa(String nome, String sobrenome, int idade, String dataDeNascimento, String nomeDaMae) {
        this(nome, sobrenome, idade, dataDeNascimento); //para chamar o construtor, utiliza-se apenas o this();
        this.nomeDaMae = nomeDaMae;
    }

    public void imprime() {
        System.out.println("-----------------");
        System.out.println(nome);
        System.out.println(sobrenome);
        System.out.println(idade);
        System.out.println(dataDeNascimento);
        System.out.println(nomeDaMae);
    }
}
