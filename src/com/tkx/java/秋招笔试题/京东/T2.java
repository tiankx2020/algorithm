import java.util.Arrays;
import java.util.Scanner;

public class T2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        int max = Arrays.stream(arr).max().getAsInt();
        int[] dp = new int[max + 100];
        dp[1] = 0;
        dp[2] = 1;
        dp[3] = 2;
        for (int i = 4; i <= max; i++) {
            dp[i] = 1 + dp[i - 1];
            for (int k = 2; k*k<=i; k++) {
                if (i % k == 0) {
                    int a = i / k;
                    int b = k;
                    dp[i] = Math.min(dp[i], dp[a] + dp[b] + 1);
                }
            }
        }
        int res = 0;
        for (int i = 0; i < arr.length; i++) {
            res += dp[arr[i]];
        }
        System.out.println(res);
    }

}
