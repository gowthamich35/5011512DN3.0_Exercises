package financial;

public class FinancialForecasting {

    public static double calculateFutureValue(double[] growthRates, int n, double initialValue) {
        if (n == 0) {
            return initialValue;
        }
        return calculateFutureValue(growthRates, n - 1, initialValue) * (1 + growthRates[n - 1]);
    }

    public static double calculateFutureValueOptimized(double[] growthRates, int n, double initialValue, Double[] memo) {
        if (n == 0) {
            return initialValue;
        }
        if (memo[n] != null) {
            return memo[n];
        }
        memo[n] = calculateFutureValueOptimized(growthRates, n - 1, initialValue, memo) * (1 + growthRates[n - 1]);
        return memo[n];
    }
}
