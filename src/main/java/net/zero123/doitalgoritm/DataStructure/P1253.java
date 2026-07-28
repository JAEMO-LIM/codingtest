package net.zero123.doitalgoritm.DataStructure;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class P1253 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine()); //n 입력받기
        StringTokenizer st = new StringTokenizer(br.readLine());
        int arr[] = new int[n]; //n의 값 입력받기.
        for(int i=0;i<n;i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        int count =0;
        Arrays.sort(arr);

        for(int i=0;i<n;i++) {
            int si =0;
            int ei = n-1;
            while(si<ei) {
                if(si == i) {
                    si++;
                    continue;
                }
                if(ei == i) {
                    ei--;
                    continue;
                }

                if(arr[si]+arr[ei] > arr[i]) {
                    ei--;
                }else if(arr[si]+arr[ei] <arr[i]) {
                    si++;
                }else {
                    count++;
                    break;
                }

            }
        }

        System.out.println(count);


    }
}
