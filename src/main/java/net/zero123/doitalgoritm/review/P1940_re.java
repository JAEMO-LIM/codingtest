package net.zero123.doitalgoritm.review;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.util.Arrays;
public class P1940_re {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int m = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());

        int arr[] = new int[n];
        for(int i=0;i<n;i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }
        Arrays.sort(arr);

        int si = 1;
        int ei = n;
        int count = 0;


        while(si<ei) {
            if(si+ei>m) {
                ei--;
            }else if(si+ei<m) {
                si++;
            }else {
                count++;
                si++;
                ei--;
            }
        }

        System.out.println(count);

    }
}
