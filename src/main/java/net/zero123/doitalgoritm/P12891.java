package net.zero123.doitalgoritm;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class P12891 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken()); //n = 문자열 개수
        int m = Integer.parseInt(st.nextToken());//m = 슬라이딩 할 문자열
        int count =0 ;
        String s = br.readLine();  //s = 그냥 임시 문자열 저장
        char srr[] = s.toCharArray(); //srr[] = 원본 문자열
        char cmpsrr[] = new char[m]; //cmpsrr[] = 비교할 문자열(슬라이딩 할 문자열)

        for(int i=0;i<m;i++) { //cmpsrr 채우기
            cmpsrr[i] = srr[i];
        }

        st = new StringTokenizer(br.readLine());

        int standard[] = new int[4]; //적합 기준 A,C,G,T 기준

        for(int i=0;i<4;i++) {
            standard[i] = Integer.parseInt(st.nextToken());
        }

        int checkArr[] = {0,0,0,0}; //비교할 문자열의 개수 A,C,G,T

        for(int i=0;i<m;i++) {
            cmpsrr[i] = srr[i];
            switch(cmpsrr[i]) {
                case 'A' : checkArr[0]++; break;
                case 'C' : checkArr[1]++; break;
                case 'G' : checkArr[2]++; break;
                case 'T' : checkArr[3]++; break;
            }
        }

        if(iscorrect(standard, checkArr)) {
            count++;
        }

        int si = 0;
        int ei = m;

        while(ei<n) {

            switch(srr[si]) {
                case 'A' : checkArr[0]--; break;
                case 'C' : checkArr[1]--; break;
                case 'G' : checkArr[2]--; break;
                case 'T' : checkArr[3]--; break;

            }
            si++;
            switch(srr[ei]) {
                case 'A' : checkArr[0]++; break;
                case 'C' : checkArr[1]++; break;
                case 'G' : checkArr[2]++; break;
                case 'T' : checkArr[3]++; break;
            }
            ei++;

            if(iscorrect(standard, checkArr)) {
                count++;
            }
        }

        System.out.println(count);

    }
    public static boolean iscorrect(int[] standard, int[] checkArr) {
        for(int i=0;i<4;i++) {
            if(checkArr[i] < standard[i]) return false;
        }
        return true;
    }

}
