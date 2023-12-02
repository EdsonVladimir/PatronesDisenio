package patterns.strategy;

public class CommisionCompleta implements CommissionStrategy {
    @Override
    public double aplicarCommision(double monto) {
        return monto * 0.50d;
    }
}
