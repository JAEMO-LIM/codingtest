package net.zero123.doitalgoritm.DataStructure;

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
        Stack<Integer> st = new Stack<>();

        StringBuilder sb = new StringBuilder();

        for(int i=0;i<n;i++) {
            int target = arr[i];
            if(a <= target) {
                while(a<=target) {
                    st.push(a);
                    a++;
                    sb.append("+\n");
                }
                st.pop();
                sb.append("-\n");
            }else {
                if(st.peek() == target) {
                    st.pop();
                    sb.append("-\n");
                }else {
                    System.out.println("NO");
                    return;
                }
            }
        }
        System.out.println(sb);
    }
}
