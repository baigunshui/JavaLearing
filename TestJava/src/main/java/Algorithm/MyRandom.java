package Algorithm;

public class MyRandom {
    public static double uniform(double a, double b){
        return a + Math.random()*(b-a);
    }

    public static int uniform(int N){
        return (int) (Math.random()*N);
    }

    public static int uniform(int lo, int hi){
        return lo + MyRandom.uniform(hi - lo);
    }

    public static int discrete(double []a){
        /**
         * a[] 中各个元素之和必须是1
         */
        double r = Math.random();
        double sum = 0.0;
        for(int i = 0; i < a.length; i++){
            sum = sum + a[i];
            if(sum >= r)
                return i;
        }
        return -1;
    }

    public static void shuffle(double[] a){
        int N = a.length;
        for (int i = 0; i < N; i++){
            int r = i + MyRandom.uniform(N - i);
            double temp = a[i];
            a[i] = a[r];
            a[r] = temp;
        }
    }

    public static void main(String[] args) {
        System.getProperties();
//        System.out.println(args[0]);
//        System.out.println(args[1]);

        System.out.printf("%14.2f", 512.1);
    }
}
