package com.faang.SpecialCases;

import java.lang.reflect.Array;
import java.util.*;
import java.util.Arrays;

public class MeetingRoomsII {


    public class Interval {
        int start;
        int end;

        Interval() {
            start = 0;
            end = 0;
        }

        Interval(int s, int e) {
            start = s;
            end = e;
        }
    }

    class Solution {
        public int minMeetingRooms(Interval[] intervals) {

            if (intervals == null || intervals.length == 0)
                return 0;
            Arrays.sort(intervals, (a, b) -> a.start - b.start);
            PriorityQueue<Interval> minHeap = new PriorityQueue<Interval>((a, b) -> a.end - b.end);
            minHeap.add(intervals[0]);
            for (int i = 1; i < intervals.length; i++) {
                Interval current = intervals[i];
                Interval earliest = minHeap.remove();
                if (current.start >= earliest.end)
                    earliest.end = current.end;
                else
                    minHeap.add(current);

                minHeap.add(earliest);
            }

            return minHeap.size();


        }
    }
}
