package String;
import java.util.*;
public class sortCharByFreq {
    public static String frequencySort(String s) {
        HashMap<Character, Integer> freq = new HashMap<>();
        for (char ch : s.toCharArray()) {
            freq.put(ch, freq.getOrDefault(ch, 0) + 1);
        }
        List<Character> chars = new ArrayList<>(freq.keySet());
        Collections.sort(chars, (a, b) -> {
            int freqA = freq.get(a);
            int freqB = freq.get(b);
            if (freqA != freqB) {
                return freqB - freqA;
            }
            return a - b;
        });
        StringBuilder result = new StringBuilder();
        for (char ch : chars) {
            int count = freq.get(ch);
            for (int i = 0; i < count; i++) {
                result.append(ch);
            }
        }

        return result.toString();
    }
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        String s =sc.nextLine();
        System.out.println(frequencySort(s));
    }
}
