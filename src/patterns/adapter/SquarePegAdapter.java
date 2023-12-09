package patterns.adapter;

public class SquarePegAdapter extends RoundPeg {
    private SquarePeg peg;

    public SquarePegAdapter(SquarePeg peg) {
        this.peg = peg;
    }

    @Override
    public double getRadius() {
        double result;
        // Calcula un radio de círculo mínimo que pueda caber en esta clavija.
        result = (Math.sqrt(Math.pow((peg.getWidth() /2), 2)* 2));
        return result;
    }
}
