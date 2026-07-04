package net.zero123.doitalgoritm.review;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class P1253_re {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        StringTokenizer st = new StringTokenizer(br.readLine());

        int arr[] = new int [n];

        for(int i=0;i<n;i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }
        Arrays.sort(arr);
        int count = 0;

        for(int i=0;i<n;i++) {
            int si = 0;
            int ei = n-1;

            while(si<ei) {
                if(arr[si]+arr[ei]==arr[i]) {
                    if(arr[si] == arr[i] || arr[ei] == arr[i]) {
                        continue;
                    }
                    count++;
                    break;
                } else if(arr[si]+arr[ei]<arr[i]) {
                    si++;
                } else {
                    ei--;
                }

            }
        }

        System.out.println(count);

    }
}
