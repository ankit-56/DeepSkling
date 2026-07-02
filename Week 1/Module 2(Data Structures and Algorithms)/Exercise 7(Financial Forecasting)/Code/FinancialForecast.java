import java.util.HashMap;
import java.util.Scanner;

public class FinancialForecast {

    static HashMap<Integer, Double> memo = new HashMap<>();

    public static double forecast(int year, double currentValue, double growthRate) {

        if (year == 0) {
            return currentValue;
        }

        if (memo.containsKey(year)) {
            return memo.get(year);
        }

        double previous = forecast(year - 1, currentValue, growthRate);
        double result = previous * (1 + growthRate);

        memo.put(year, result);

        return result;
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter current value: ");
        double currentValue = scanner.nextDouble();

        System.out.print("Enter annual growth rate (as decimal, e.g., 0.05 for 5%): ");
        double growthRate = scanner.nextDouble();

        System.out.print("Enter number of years to forecast: ");
        int years = scanner.nextInt();

        double futureValue = forecast(years, currentValue, growthRate);

        System.out.printf("\nForecasted value after %d years: %.2f\n", years, futureValue);

        System.out.println("\nAnalysis:");
        System.out.println("Time Complexity with Memoization: O(n)");
        System.out.println("Space Complexity: O(n)");
        System.out.println("Memoization avoids repeated recursive calculations and improves performance.");

        scanner.close();
    }
}