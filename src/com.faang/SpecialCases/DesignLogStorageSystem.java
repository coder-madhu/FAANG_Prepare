package com.faang.SpecialCases;

import java.util.*;

class LogSystem {



/**
 * Your LogSystem object will be instantiated and called as such:
 * LogSystem obj = new LogSystem();
 * obj.put(id,timestamp);
 * List<Integer> param_2 = obj.retrieve(s,e,gra);
 */




    Map<Integer, String> map;
    Map<String, Integer> idxMap;
    public LogSystem() {
        map = new HashMap<>();
        idxMap = new HashMap<>();
        idxMap.put("Year", 0);
        idxMap.put("Month", 1);
        idxMap.put("Day", 2);
        idxMap.put("Hour", 3);
        idxMap.put("Minute", 4);
        idxMap.put("Second", 5);
    }

    public void put(int id, String timestamp) {
        map.put(id, timestamp);
    }

    public List<Integer> retrieve(String s, String e, String gra) {
        List<Integer> res = new ArrayList<>();
        long sl = convert(s, gra);
        long el = convert(e, gra);
        for (int key : map.keySet()) {
            long kl = convert(map.get(key), gra);
            if (kl >= sl && kl <= el)
                res.add(key);
        }
        return res;
    }

    private long convert(String s, String gra) {
        String[] sa = s.split(":");
        String ss = "";
        for (int i = 0; i <= idxMap.get(gra); i++) {
            ss += sa[i];
        }
        long sl = Long.valueOf(ss);
        return sl;
    }
}