package com.faang.StringsSet1;

import java.util.HashMap;
import java.util.HashSet;

public class MostCommonWord {
        public String mostCommonWord(String paragraph, String[] banned) {
            HashSet<String> bannedWords = new HashSet<>();

            for(String words:banned)
            {
                bannedWords.add(words);
            }
            bannedWords.add("");

            HashMap<String, Integer> counts =new HashMap<>();
            for(String word:
                    paragraph.replaceAll("[^a-zA-Z]"," ").trim().toLowerCase().split(" "))
            {
                if(!bannedWords.contains(word))
                {
                    counts.put(word, counts.getOrDefault(word,0)+1);

                }

            }

            String result = "";
            int max = -1;

            for(String key: counts.keySet())
            {
                System.out.println(key + " "+ counts.get(key) );

                if(counts.get(key) > max)
                {
                    result = key;
                    max = counts.get(key);
                }
            }

            return result;
        }
    }