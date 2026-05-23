package net.zero123.programmers.level1;

import java.util.Arrays;

public class MinMax {
    public String solution(String s) {
        // 공백으로 쪼갠 문자열 배열을 정수 배열로 변환
        int[] intarr = Arrays.stream(s.split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();
        int min = Arrays.stream(intarr).min().orElse(0);
        int max = Arrays.stream(intarr).max().orElse(0);
        return min + " " + max;
    }
}

//class Solution {
//    public String solution(String s) {
//        String[] arr = s.split(" ");
//        int min, max, n;
//        min = max = Integer.parseInt(arr[0]);
//
//        for(int i=0;i<arr.length;i++) {
//            n = Integer.parseInt(arr[i]);
//            if(min > n) {
//                min = n;
//            }
//            if(max < n) {
//                max = n;
//            }
//        }
//
//        return min + " " + max;
//
//    }
//}