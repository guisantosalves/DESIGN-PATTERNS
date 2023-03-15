package strategy;
public class concreteStrategySubtract implements Strategy {
  @Override
  public double calculate(double n, double j) {
    double result = n - j;
    return result;
  }
}
