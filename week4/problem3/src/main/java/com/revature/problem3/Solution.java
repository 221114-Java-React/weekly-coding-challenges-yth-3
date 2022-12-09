package com.revature.problem3;

import java.util.*;

public class Solution {
    public String wordCount(String sentence) {
        Map<String, Integer> map = new Hashtable();
        for (String word : split(sentence)) {
            if (map.containsKey(word)) {
                map.put(word, map.get(word) + 1);
            } else {
                map.put(word, 1);
            }
        }

        List<String> sortedKeys = new ArrayList<>();
        for (String key: map.keySet()) {
            sortedKeys.add(key);
        }
        Collections.sort(sortedKeys);


        StringBuilder sb = new StringBuilder();
        for (String key : sortedKeys) {
            if (map.get(key) > 1) {
                sb.append(key);
                sb.append(": ");
                sb.append(map.get(key));
                sb.append("\n");
            }
        }

        String result = sb.toString();
        return result.substring(0, result.length() - 1);
    }

    private List<String> split(String input) {
        List<String> result = new ArrayList<>();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < input.length(); ++i) {
            char c = input.toCharArray()[i];
            if (Character.isAlphabetic(c)) {
                sb.append(c);
            } else if (sb.length() > 0) {
                String word = sb.toString().toLowerCase();
                result.add(word);
                sb = new StringBuilder();
            }
        }

        if (sb.length() > 0) {
            result.add(sb.toString());
        }

        return result;
    }
}
