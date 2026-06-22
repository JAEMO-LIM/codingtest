package net.zero123.doitalgoritm;

import java.util.Scanner;

public class P11720 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int sum =0;
        String sNum = sc.next();
        char[] cNum = sNum.toCharArray();
        for(int i=0;i<N;i++) {
            sum += cNum[i]-'0';
        }

        System.out.println(sum);
    }
}
