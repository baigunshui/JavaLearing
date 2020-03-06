package Algorithm;

import java.util.Scanner;

public class Average
{
    public static void main(String[] args)
    {
        double sum = 0.0;
        int cnt = 0;
        Scanner input=new Scanner(System.in);
        while(input.hasNext())
        {
            sum+=input.nextDouble();
            cnt++;
        }
        double avg = sum/cnt;
        System.out.printf("Average is %.5f\n",avg);
    }
}