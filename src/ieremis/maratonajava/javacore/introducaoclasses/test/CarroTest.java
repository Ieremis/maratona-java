package ieremis.maratonajava.javacore.introducaoclasses.test;

import ieremis.maratonajava.javacore.introducaoclasses.dominio.Carro;

public class CarroTest {
    public static void main(String[] args) {
        Carro carro1 = new Carro();
        carro1.marca = "Toyota";
        carro1.modelo = "Etios";
        carro1.ano = 2012;

        Carro carro2 = new Carro();
        carro2.marca = "Nissan";
        carro2.modelo = "March";
        carro2.ano = 2015;

        System.out.println("------Carro 1-------");
        System.out.println("Marca: " + carro1.marca + "\nModelo: " + carro1.modelo + "\nAno: " + carro1.ano);

        System.out.println("------Carro 2-------");
        System.out.println("Marca: " + carro2.marca + "\nModelo: " + carro2.modelo + "\nAno: " + carro2.ano);
    }
}
