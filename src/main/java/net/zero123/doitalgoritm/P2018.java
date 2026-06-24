package net.zero123.doitalgoritm;

import java.util.Scanner;

public class P2018 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int count = 1;
        int startIndex = 1;
        int endIndex = 1;
        int sum = 1;

        while(endIndex != n) {
            if(sum == n) {
                count++;
                endIndex++;
                sum += endIndex;
            }else if(sum>n) {
                sum = sum - startIndex;
                startIndex++;
            }else {
                endIndex++;
                sum += endIndex;
            }

        }
        System.out.println(count);
    }
}
