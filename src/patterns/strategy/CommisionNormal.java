package patterns.strategy;

public class CommisionNormal implements CommissionStrategy {
    @Override
    public double aplicarCommision(double monto) {
        return monto * 0.30d;
    }
}
