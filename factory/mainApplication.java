package factory;

import java.util.Scanner;

public class mainApplication {
    public static void main(String[] args){
        FactoryPessoa fPessoa = new FactoryPessoa();
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite um nome masculino: ");
        String male = sc.nextLine();
        
        System.out.println("Digite um nome feminino");
        String female = sc.nextLine();

        fPessoa.getPessoa(male, "M");
        fPessoa.getPessoa(female, "F");

        sc.close();
    }
}
