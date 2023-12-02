package patterns.strategy;

public class EjecutarStrategy {
    public static void main(String[] args) {
        CommissionStrategy commissionStrategy = getStrategy(1000d);
        Contexto contexto = new Contexto(commissionStrategy);
        System.out.println("Commision por 1000d = " + contexto.ejecutarStrategy(1000d));

        commissionStrategy = getStrategy(500d);
        contexto = new Contexto(commissionStrategy);
        System.out.println("Commision por 500d = " + contexto.ejecutarStrategy(500d));

        commissionStrategy = getStrategy(100d);
        contexto = new Contexto(commissionStrategy);
        System.out.println("Commision por 100d = " + contexto.ejecutarStrategy(100d));
    }

    private static CommissionStrategy getStrategy(double monto) {
        CommissionStrategy strategy;
        if(monto >= 1000d) {
            strategy = new CommisionCompleta();
        } else if (monto >= 500d && monto <= 999d){
            strategy = new CommisionNormal();
        } else {
            strategy = new CommisionBaja();
        }
        return strategy;
    }
}
