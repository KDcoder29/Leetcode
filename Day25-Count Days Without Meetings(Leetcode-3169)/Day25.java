import java.util.Arrays;

class Day25 {
    public int countDays(int days, int[][] meetings) {
        Arrays.sort(meetings, (a, b) -> Integer.compare(a[0], b[0]));

        int ans = meetings[0][0] - 1;
        int previous = meetings[0][1];

        for (int i = 1; i < meetings.length; i++) {
            int csp = meetings[i][0];
            if (csp > previous) {
                ans = ans + csp - previous - 1;
            }
            previous = Math.max(previous, meetings[i][1]);
        }
        return ans + days - previous;
    }

    public static void main(String[] args) {
        Day25 solution = new Day25();

        int days = 10;
        int[][] meetings = {
                { 1, 3 },
                { 5, 6 },
                { 7, 8 }
        };

        int result = solution.countDays(days, meetings);
        System.out.println("Number of free days: " + result); // Output should be 3
    }
}
