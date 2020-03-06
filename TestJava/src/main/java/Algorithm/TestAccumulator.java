package Algorithm;

public class TestAccumulator {
    public static void main(String[] args) {
        int T = 100000;
        Accumulator a = new Accumulator();
        for (int t = 0; t < T; t++) {
            a.addDataValue(Math.random());
        }
        System.out.println(a);
    }
}
