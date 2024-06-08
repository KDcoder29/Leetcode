import java.util.Arrays;

class Day28 {
    public int maximumPopulation(int[][] logs) {
        int[] populationChange = new int[101]; // Covers years from 1950 to 2050

        // Apply population changes based on birth and death years
        for (int[] log : logs) {
            populationChange[log[0] - 1950]++; // A person is born
            populationChange[log[1] - 1950]--; // A person dies
        }

        // Traverse through the years to find the year with maximum population
        int maxPopulation = 0;
        int yearWithMaxPopulation = 1950; // Start with the first year
        int currentPopulation = 0;

        for (int year = 0; year < 101; year++) {
            currentPopulation += populationChange[year];
            if (currentPopulation > maxPopulation) {
                maxPopulation = currentPopulation;
                yearWithMaxPopulation = 1950 + year;
            }
        }

        return yearWithMaxPopulation;
    }

    public static void main(String[] args) {
        Day28 solution = new Day28();

        // Example 1
        int[][] logs1 = { { 1950, 1961 }, { 1960, 1971 }, { 1970, 1981 } };
        int result1 = solution.maximumPopulation(logs1);
        System.out.println("Maximum population year (example 1): " + result1); // Expected: 1960

        // Example 2
        int[][] logs2 = { { 1993, 1999 }, { 2000, 2010 } };
        int result2 = solution.maximumPopulation(logs2);
        System.out.println("Maximum population year (example 2): " + result2); // Expected: 1993

        // Additional test case
        int[][] logs3 = { { 1950, 1955 }, { 1951, 1957 }, { 1953, 1960 }, { 1955, 1965 } };
        int result3 = solution.maximumPopulation(logs3);
        System.out.println("Maximum population year (additional test case): " + result3); // Expected: 1955
    }
}
