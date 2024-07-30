package financial;

public class Main {

    public static void main(String[] args) {
        double[] growthRates = {0.05, 0.1, 0.07, 0.02}; 
        double initialValue = 1000.0; 
        int n = growthRates.length;

        double futureValue = FinancialForecasting.calculateFutureValue(growthRates, n, initialValue);
        System.out.println("Future Value (Recursive): " + futureValue);

        Double[] memo = new Double[n + 1];
        double futureValueOptimized = FinancialForecasting.calculateFutureValueOptimized(growthRates, n, initialValue, memo);
        System.out.println("Future Value (Optimized Recursive): " + futureValueOptimized);
    }
}
