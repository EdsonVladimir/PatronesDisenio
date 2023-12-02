package patterns.strategy;

public class CommisionBaja implements CommissionStrategy{
    @Override
    public double aplicarCommision(double monto) {
        return monto * 0.10d;
    }
}
