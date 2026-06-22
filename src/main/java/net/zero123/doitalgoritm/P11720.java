package net.zero123.doitalgoritm;

import java.util.Scanner;

public class P11720 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum = 0;
        String s = sc.next();
        char[] cArr = s.toCharArray();
        for (int i = 0; i < n; i++) {
            sum += cArr[i] - '0';
        }

//        System.out.println(sum);
//
//        String sNum2 = "12345";
//        int num = Integer.parseInt(sNum2);
//        double d = Double.parseDouble(sNum2);
//
//        String sNum3 = String.valueOf(num);
//        System.out.println(sNum3+1);

    }
}
