package ieremis.maratonajava.javacore.introducaometodos.dominio;

public class Funcionario {
    public String nome = "";
    public int idade = 0;
    public double[] salarios = new double[3];

    public void imprimeFuncionario(){
        System.out.println("-------------");
        System.out.println("Nome do funcionário: " + this.nome);
        System.out.println("Idade do funcionário: " + this.idade);
        System.out.println("Salários do funcionário: ");

        for (double aux:this.salarios){
            System.out.println(aux);
        }
    }

    public double calculaMediaSalario(){
        double media;
        double soma = 0;

        for(double aux:salarios){
            soma += aux;
        }

        media = soma / salarios.length;
        return media;
    }

    public double calculaMediaComVarArgs(double... salarios){
        double media;
        double soma = 0;
        for(double aux:salarios){
            soma += aux;
        }
        media = soma / salarios.length;
        return media;
    }
}
