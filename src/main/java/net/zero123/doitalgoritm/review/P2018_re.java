package net.zero123.doitalgoritm.review;

import java.util.Scanner;

public class P2018_re {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int si = 1;
        int ei = 1;
        int count = 1;
        int sum = 1;

        while(ei<n) {
            if(sum>n) {
                sum = sum-si;
                si++;
            }else if (sum<n) {
                ei++;
                sum = sum + ei;
            }else {
                count++;
                ei++;
                sum = sum + ei;
            }
        }

        System.out.println(count);
    }
}
