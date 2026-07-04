package net.zero123.doitalgoritm.review;

import java.util.Scanner;

public class P11720_re {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String s = sc.next();
        char[] c = s.toCharArray();
        int sum =0;
        for(int i=0;i<n;i++) {
            sum+=c[i]-'0';
        }
        System.out.println(sum);
    }
}
