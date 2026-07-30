package net.zero123.doitalgoritm.Sort;

import java.util.Scanner;

public class P1427 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[11];
        int cnt=0;
        int i =0;

        while(n>0) {
            arr[i] = n%10;
            n = n/10;
            i++;
            cnt++;
        }

        int temp = arr[0];


        for(i=0;i<cnt;i++){
            int max_index =i;
            for(int j=i;j<cnt;j++){
                if(temp<arr[j]) {
                    temp = arr[j];
                    max_index=j;
                }
            }
            temp = arr[i];
            arr[max_index] = arr[i];
            arr[i] = temp;
        }

        for(i=0;i<cnt;i++){
            System.out.print(arr[i]);
        }
    }
}
