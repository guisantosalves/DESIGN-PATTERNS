package strategy;
public class concreteStrategyAdd implements Strategy {

    @Override
    public double calculate(double n, double j){
        double result = n + j;
        return result;
    }
    
}
