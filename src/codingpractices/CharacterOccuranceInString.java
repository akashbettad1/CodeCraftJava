package codingpractices;

import java.util.HashMap;

public class CharacterOccuranceInString {

    /**
     * Counts the occurrences of each character in the given string.
     *
     * @param val the string to analyze
     * @return a map with characters as keys and their counts as values
     */
    public HashMap<Character, Integer> countCharactersOccurance(String val) {

        HashMap<Character, Integer> map = new HashMap<>();

        // Edge case
        if (val == null || val.isEmpty()) {
            System.out.println("Provided string is empty.");
            return map;
        }

        char[] charArr = val.toCharArray();

        for (char ch : charArr) {
            if(map.containsKey(ch)) {
                map.put(ch, map.get(ch) + 1);
            }
            else {
                map.put(ch,  1);
            }
        }
        return map;
    }

    public static void main (String[] args) {
        CharacterOccuranceInString obj = new CharacterOccuranceInString();

        System.out.println(obj.countCharactersOccurance("Mesemerizing"));
        System.out.println(obj.countCharactersOccurance("racecar"));
    }
}
