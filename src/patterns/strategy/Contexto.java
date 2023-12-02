package patterns.strategy;


public class Contexto {
    private CommissionStrategy commissionStrategy;

    public Contexto(CommissionStrategy commissionStrategy){
        this.commissionStrategy = commissionStrategy;
    }

    public double ejecutarStrategy(double monto) {
       return commissionStrategy.aplicarCommision(monto);
    }
}
