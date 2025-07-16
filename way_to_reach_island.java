import java.util.Scanner;

public class Main {
    static long countWays(int N) {
        long[] dp = new long[N + 1];
        dp[1] = 1;

        for (int i = 1; i <= N; i++) {
            for (int j = i * 2; j <= N; j += i) {
                dp[j] += dp[i];
            }
        }

        return dp[N];
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        long result = countWays(N);
        System.out.println(result);

        sc.close();
    }
}
