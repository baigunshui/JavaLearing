package Algorithm;

public class Flips {
    public static void main(String[] args) {
        int T = 10;
        Counter heads = new Counter("heads");
        Counter tails = new Counter("tails");
        for (int t = 0; t<T; t++) {
            if(Math.random() >= 0.5)
                heads.increment();
            else
                tails.increment();
        }
        System.out.println(heads);
        System.out.println(tails);
        int d = heads.tally() - tails.tally();
        System.out.println("delta: " + Math.abs(d)/(double) T);

    }
}
