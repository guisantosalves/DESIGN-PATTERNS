package strategy;
import java.io.InputStream;
import java.util.Scanner;

public class mainApplication {
    public static void main(String[] args){
        Context ctx = new Context();
        Scanner sc = new Scanner(System.in);

        System.out.println("Insira o primeiro número: ");
        double numberOne = sc.nextDouble();

        System.out.println("Insira o segundo número: ");
        double numberTwo = sc.nextDouble();

        System.out.println("O que desejas ?\n1) Somar\n2) Subtrair\n3) Multiplicar");
        int choice = sc.nextInt();

        switch(choice){
            case 1:
                ctx.setStrategy(new concreteStrategyAdd());
            break;
            case 2:
                ctx.setStrategy(new concreteStrategySubtract());
            break;
            case 3:
                ctx.setStrategy(new concreteStrategyMultiply());
            break;
            default:
                throw new Error("Escolha um número entre 1, 2, 3");
        }
        
        var result = ctx.executeStrategy(numberOne, numberTwo);
        
        System.out.println("\nResultado: "+result);
    }
}
