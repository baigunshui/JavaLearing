package Algorithm;

public class Accumulator {
    private double total;
    private int N;
    public void addDataValue(double val) {
        N++;
        total += val;
    }

    public double mean() {
        return total/N;
    }

    @Override
    public String toString() {
        return "Mean (" +
                "total=" + total +
                ", N=" + N + ", mean=" + String.format("%7.5f", mean()) +
                ')';
    }
}
