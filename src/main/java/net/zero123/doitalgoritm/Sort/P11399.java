    package net.zero123.doitalgoritm.Sort;

    import java.util.Scanner;

    public class P11399 {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int n = sc.nextInt();
            int arr[] = new int[n];
            for(int i=0;i<n;i++) {
                arr[i] = sc.nextInt();
            }

            for(int i=1;i<n;i++) {
                int j=i-1;
                int target = arr[i];

                while(j>=0 && target<arr[j]) {
                    arr[j+1] = arr[j];
                    j--;
                }
                arr[j+1] = target;
            }
            int sum =0;
            int sums =0;

            for (int i = 0; i < n; i++) {
                sums += arr[i];
                sum += sums;
            }

            System.out.println(sum);
        }
    }
