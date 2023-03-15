package strategy;
public class Context {
    // the type is the generic interface type
    private Strategy strategy;
    
    public void setStrategy(Strategy stra){
        // strategy from the client
        this.strategy = stra;
    }

    public double executeStrategy(double n, double j){
        return strategy.calculate(n, j);
    }
}
