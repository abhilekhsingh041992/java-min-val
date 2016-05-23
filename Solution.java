package test;

// you can also use imports, for example:
import java.util.*;

// you can write to stdout for debugging purposes, e.g.
// System.out.println("this is a debug message");



class Solution {
    static public int solution(int[] A) {
        // write your code in Java SE 8

        int n = A.length;
        int[] cnt = new int[n];
        int k = 0;
        for (int elem : A) {
            cnt[elem]++;
            if(cnt[elem] == 1) k++;
        }
        Arrays.fill(cnt, 0);

        int curr = 0;
        int result = n;
        for(int i=0, j=0;j<n;j++) {
            cnt[A[j]]++;
            if(cnt[A[j]] == 1) curr++;

            if(curr == k) {
                result = Math.min(result, (j-i+1));
                while(i <= j) {
                    if(cnt[A[i]] == 1) break;
                    cnt[A[i]]--;
                    i++;
                    result = Math.min(result, (j-i+1));
                }
            }
        }

        return  result;
    }

    int a=20;
    static int b=10;
    void m1()
    {
        Solution t= new Solution();
        System.out.println(t.b);
    }
    public static void main(String args[])
    {
        Solution t1= new Solution();
        t1.m1();
    }
}