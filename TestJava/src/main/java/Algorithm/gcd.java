package Algorithm;

public class gcd {
    public static int gcd_1(int p, int q){
        if(q == 0)
            return p;
        int r = p % q;
        return gcd_1(q,r);
    }

    public double findMax(int[] a){
        double max = a[0];
        for(int i = 0; i < a.length; i++){
            if (a[i] > max)
                max = a[i];
        }
        return max;
    }

    public static void main(String[] args) {
        int[] a = {1,2,3,4,5,6,7,8,9,0};

        int[] b = new int[10];
        for (int i = 0; i<a.length; i++)
            b[i] = a[i];
        b[2] = 10;
        System.out.println(a[2]);

        //System.out.println(a[0]);
    }
}
