package net.zero123.doitalgoritm.review;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class P1546_re {
    public static int findMax(int arr[], int n) {
        int max = 0;
        for(int i=0;i<n;i++) {
            if(arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
    }

    public static double newAvr(int arr[], int max, int n) {
        double sum = 0;
        for(int i=0;i<n;i++) {
            sum +=arr[i];
        }
        sum = sum/max*100/3;
        return sum;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        int arr[] = new int[n];

        for(int i=0;i<n;i++){
            arr[i] = Integer.parseInt(st.nextToken());
        }

        int max = findMax(arr, n);
        System.out.println(newAvr(arr, max, n));
    }

}
