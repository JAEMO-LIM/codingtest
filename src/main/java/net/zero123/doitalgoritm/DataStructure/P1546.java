package net.zero123.doitalgoritm.DataStructure;

import java.util.Scanner;

public class P1546 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        double m =0 ;
        double sum = 0;

        double arr[] = new double[n];
        for(int i=0;i<n;i++) {
            arr[i] = sc.nextInt();
            if(m < arr[i]) {
                m = arr[i];
            }
        }

        for(int i=0;i<n;i++) {
            sum += arr[i]/m*100;
        }

        System.out.println(sum/n);
    }
}