package factory;

public class Homem extends Pessoa {
    public Homem(String nome){
        this.nome = nome;
        System.out.println("Olá "+nome);
    }
}
