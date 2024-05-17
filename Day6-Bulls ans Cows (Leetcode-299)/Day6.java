import java.util.HashMap;

public class Day6 {
    public static void main(String[] args) {
        // Example usage:
        String secret = "1234";
        String guess = "0111";
        System.out.println(getHint(secret, guess));
    }

    public static String getHint(String secret, String guess) {
        int count = 0;
        int count2 = 0;

        HashMap<Character, Integer> hm = new HashMap<>();

        for (int i = 0; i < guess.length(); i++) {
            if (hm.containsKey(guess.charAt(i))) {
                int temp = hm.get(guess.charAt(i));
                hm.put(guess.charAt(i), temp + 1);
            } else {
                hm.put(guess.charAt(i), 1);
            }
        }

        for (int i = 0; i < secret.length(); i++) {
            if (hm.containsKey(secret.charAt(i)) && hm.get(secret.charAt(i)) > 0) {
                int temp = hm.get(secret.charAt(i));
                hm.put(secret.charAt(i), temp - 1);
                count2++;
            }
        }

        for (int i = 0; i < secret.length(); i++) {
            if (secret.charAt(i) == guess.charAt(i)) {
                count++;
                count2--;
            }
        }

        String ans = "" + count + "A" + count2 + "B";
        return ans;
    }
}
