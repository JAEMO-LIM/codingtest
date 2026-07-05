package net.zero123.doitalgoritm;

import java.sql.SQLOutput;
import java.util.Scanner;
import java.util.Stack;

public class P1874 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a = 1;
        int arr[] = new int[n];

        for(int i=0;i<n;i++) {
            arr[i] = sc.nextInt();
        }

        Stack<Integer> stack = new Stack<>();

        for(int i=0;i<n;i++) {
            if(a <= arr[i]) {
                while(a <= arr[i]) {
                    System.out.println("+");
                    stack.push(a);
                    a++;
                }
                System.out.println("-");
                stack.pop();
            } else {
                if(stack.peek() == arr[i]) {
                    stack.pop();
                    System.out.println("-");
                } else {
                    System.out.println("NO");
                    return;
                }
            }
        }
    }
}
