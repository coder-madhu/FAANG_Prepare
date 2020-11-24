package com.faang.SpecialCases;

import java.util.HashMap;
import java.util.Map;

public class LoggerRateLimiter {

    Map<String, Integer> map;

    public LoggerRateLimiter() {
        map = new HashMap<>();
    }

    public boolean shouldPrintMessage(int timestamp, String message) {

        if(!map.containsKey(message))
        {
            map.put(message,timestamp);
            return true;
        }

        int lastime = map.get(message);
        if(timestamp -lastime >=10)
        {
            map.put(message,timestamp);
            return true;
        }

        return false;



    }
}

