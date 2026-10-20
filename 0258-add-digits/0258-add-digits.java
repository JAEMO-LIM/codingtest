class Solution {
    public int addDigits(int num) {
        while(true) {
            int sum =0;
            while(num/10>0) {
                sum = sum + (num%10);
                num = num/10;
            }
            sum = sum + (num%10);

            if(sum/10<=0) {
                return sum;
            }else {
                num = sum;
            }
        }
    }
}