import java.util.*;class Solution {
    public String mostCommonWord(String paragraph, String[] banned) {
        Set<String> bannedSet = new HashSet<>(Arrays.asList(banned));
        Map<String, Integer> count = new HashMap<>();
        String[] words = paragraph.toLowerCase().replaceAll("[^a-z ]", " ").split("\\s+");
        for (String word : words) {
            if (!bannedSet.contains(word)) {
                count.put(word, count.getOrDefault(word, 0) + 1);
            }
        }
        String result = "";
        int max = 0;
        for (String word : count.keySet()) {
            if (count.get(word) > max) {
                max = count.get(word);
                result = word;
            }
        }
        return result;
    }
}