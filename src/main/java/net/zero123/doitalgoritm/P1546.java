package net.zero123.doitalgoritm;

import java.util.Scanner;

public class P1546 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int max = 0;
        double sum =0;

        int arr[] = new int[n];

        for(int i=0;i<n;i++) {
            arr[i] = sc.nextInt();
            if(max < arr[i]) {
                max = arr[i];
            }
        }

        for(int i=0;i<n;i++) {
            sum += (double) arr[i]/max*100;
        }

        System.out.println(sum/n);

    }
}
