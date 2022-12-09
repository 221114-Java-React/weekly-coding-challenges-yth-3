package com.revature.problem2;

import java.util.*;

public class Solution {
    public List<String> autoComplete(List<String> list) {
        List<String> result = new ArrayList<>();

        String target = list.get(0);
        for (int i = 1; i < list.size(); ++i) {
            String candidate = list.get(i);
            if (candidate.startsWith(target)) {
                result.add(candidate);
            }
        }

        Collections.sort(result);
        return result;
    }
}
