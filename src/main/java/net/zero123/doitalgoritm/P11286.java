package net.zero123.doitalgoritm;

import java.util.PriorityQueue;
import java.util.Scanner;

public class P11286 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        PriorityQueue<Integer> priorityQueue = new PriorityQueue<>((o1, o2) -> {
            int first_abs = Math.abs(o1);
            int second_abs = Math.abs(o2);
            if(first_abs == second_abs) {
                return o1 > o2 ? 1 : -1;
            }else {
                return first_abs - second_abs;
            }
        });

        for(int i=0;i<n;i++) {
            int request = sc.nextInt();
            if(request ==0) {
                if(priorityQueue.isEmpty()) {
                    System.out.println("0");
                }else {
                    System.out.println(priorityQueue.poll());
                }
            } else {
                priorityQueue.add(request);
            }
        }
    }
}
