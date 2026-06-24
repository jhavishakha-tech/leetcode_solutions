class Solution {
    long MOD = 1000000007;
    public int countGoodNumbers(long n) {
        long even = (n + 1) / 2;
        long odd = n / 2;
        long ans = (power(5, even) * power(4, odd)) % MOD;
        return (int) ans;
    }
    private long power(long x, long n) {
        if (n == 0) return 1;
        long temp = power(x, n / 2);
        if (n % 2 == 0)
            return (temp * temp) % MOD;
        return (x * temp % MOD * temp) % MOD;
    }
}