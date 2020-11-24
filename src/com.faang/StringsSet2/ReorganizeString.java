package com.faang.StringsSet2;

import java.util.*;

public class ReorganizeString {
    public String reorganizeString(String S) {
        Map<Character, Integer> charToCount = new HashMap<>();

        for (char c : S.toCharArray()) {
            int count = charToCount.getOrDefault(c, 0);
            charToCount.put(c, count + 1);
        }

        PriorityQueue<Character> pq = new PriorityQueue<>((c1, c2) -> charToCount.get(c2) - charToCount.get(c1));
        pq.addAll(charToCount.keySet());

        StringBuilder sb = new StringBuilder();

        while (!pq.isEmpty()) {
            char c = pq.poll();
            int currentLength = sb.length();

            Character adjacentDuplicate = null;
            if (currentLength != 0 && sb.charAt(currentLength - 1) == c) {
                if (pq.isEmpty()) {
                    return "";
                } else {
                    adjacentDuplicate = c;
                    c = pq.poll();
                }
            }

            sb.append(c);

            int newCount = charToCount.get(c) - 1;
            charToCount.put(c, newCount);

            if (newCount > 0) {
                pq.add(c);
            }
            if (adjacentDuplicate != null) {
                pq.add(adjacentDuplicate);
            }
        }

        return sb.toString();
    }
}