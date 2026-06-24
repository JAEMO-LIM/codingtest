package net.zero123.doitalgoritm;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class P1940 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        int m = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        int arr[] = new int[n];
        for(int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        int startIndex = 0;
        int endIndex = n-1;
        int count=0;

        Arrays.sort(arr);

        while(startIndex < endIndex) {
            if(arr[startIndex] + arr[endIndex] == m) {
                count++;
                startIndex++;
                endIndex--;
            }else if (arr[startIndex] + arr[endIndex]> m) {
                endIndex--;
            }else {
                startIndex++;
            }
        }
        System.out.println(count);

    }
}
