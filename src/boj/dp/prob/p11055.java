package boj.dp.prob;

import java.util.Scanner;

public class p11055 {

	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        int a[] = new int[n];
        int dp[] = new int[n];
        
        for(int i=0; i<n; i++)
            a[i] = sc.nextInt();
        
        int max = 0;
        for(int i=0; i<n; i++) {
            dp[i] = a[i];
            for(int j=0; j<i; j++) {
                if(a[i] > a[j] && dp[i] < dp[j] + a[i])
                    dp[i] = dp[j] + a[i];
            }
            if(max < dp[i])
                max = dp[i];
        }
        
        System.out.println(max);
        sc.close();
    }
}
