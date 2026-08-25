package net.zero123.doitalgoritm.Sort;

import java.util.Scanner;

public class P2751 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i=0;i<n;i++) {
            arr[i] = sc.nextInt();
        }
        merge_sort(arr,0,n-1);
        for(int i=0;i<n;i++) {
            System.out.println(arr[i]);
        }
    }
    private static void merge_sort(int arr[], int left, int right) {
        if(left<right) {
            int mid = left + (right-left)/2;

            merge_sort(arr, left, mid);
            merge_sort(arr, mid +1, right);

            merge(arr, left, mid, right);
        }
    }
    private static void merge(int arr[], int left, int mid, int right) {
        int i = left;
        int j = mid + 1;
        int temp[] = new int[right-left+1];
        int k =0;
        while(i<=mid && j<=right) {
            if(arr[i] <=arr[j]) {
                temp[k++] = arr[i++];
            }else {
                temp[k++] = arr[j++];
            }
        }

        while(i<=mid) {
            temp[k++] = arr[i++];
        }
        while(j<=right) {
            temp[k++] = arr[j++];
        }

        System.arraycopy(temp, 0, arr, left, temp.length);
    }

    /*
    병합 정렬
    1. 가장 작은 단위로 나눔.
    2. 병합하면서 비교. 모든 수가 병합될때까지.


     */
}
