package net.zero123.programmers.level1;

class StringToInt {
    public int solution(String s) {

        int answer = Integer.parseInt(s);


        return answer;
    }

    public static void main(String[] args) {
        int solution = new StringToInt().solution("1234");
        System.out.println(solution);
    }
}