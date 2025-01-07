package ieremis.maratonajava.javacore.sobrecargametodos.dominio;

public class Filme {
    private String nome;
    private String tipo;
    private int ano;
    private String genero;

    //Qual é o cenário: Primeiramente foi criado um método init com somente os atributos nome, tipo e episodios, que inicia as variáveis igual um setter

    public void init(String nome, String tipo, int ano){
        this.nome = nome;
        this.tipo = tipo;
        this.ano = ano;
    }

    //Após isso, foi criado uma nova variável, a genero. Com isso, criei um novo método init, adicionando o parametro genero, que vai chamar o método init antigo e vai iniciar o genero
    //mesmo o método possuindo o mesmo nome, por conta da quantidade de parametros o Java sabe qual ele deve chamar

    public void init(String nome, String tipo, int ano, String genero){
        this.init(nome, tipo, ano);
        this.genero = genero;
    }

    public void imprime(){
        System.out.println("------------------");
        System.out.println(this.nome);
        System.out.println(this.tipo);
        System.out.println(this.ano);
        System.out.println(this.genero);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }
}
