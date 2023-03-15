package strategy;
public class concreteStrategyMultiply implements Strategy{
    @Override
    public double calculate(double n, double j){
        double result = n * j;
        return result;
    }
}
