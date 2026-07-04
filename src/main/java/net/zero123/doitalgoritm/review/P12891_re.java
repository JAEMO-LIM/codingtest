package net.zero123.doitalgoritm.review;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class P12891_re {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        String s = br.readLine();
        char[] c = s.toCharArray();

        int[] answerArr = new int [4];
        st = new StringTokenizer(br.readLine());
        for(int i=0;i<4;i++) {
            answerArr[i] = Integer.parseInt(st.nextToken());
        }

        int si = 0;
        int ei = m-1;
        int[] checkArr = {0,0,0,0};

        for(int i=0;i<m;i++) {
            switch(c[i]) {
                case 'A' :
                    checkArr[0]++;
                    break;
                case 'C' :
                    checkArr[1]++;
                    break;
                case 'G' :
                    checkArr[2]++;
                    break;
                case 'T' :
                    checkArr[3]++;
                    break;

            }
        }
        int count =0;

        if(checkAnswer(checkArr, answerArr)) count++;

        while(ei<n-1) {
            switch(c[si]) {
                case 'A' :
                    checkArr[0]--;
                    break;
                case 'C' :
                    checkArr[1]--;
                    break;
                case 'G' :
                    checkArr[2]--;
                    break;
                case 'T' :
                    checkArr[3]--;
                    break;
            }
            si++;
            ei++;
            switch(c[ei]) {
                case 'A' :
                    checkArr[0]++;
                    break;
                case 'C' :
                    checkArr[1]++;
                    break;
                case 'G' :
                    checkArr[2]++;
                    break;
                case 'T' :
                    checkArr[3]++;
                    break;

            }
            if(checkAnswer(checkArr, answerArr)) count++;
        }

        System.out.println(count);

    }
    public static boolean checkAnswer(int[] part, int[] answer) {
        for(int i=0;i<4;i++) {
            if(part[i]<answer[i]) {
                return false;
            }
        }
        return true;
    }
}
