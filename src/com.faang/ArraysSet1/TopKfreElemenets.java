package com.faang.ArraysSet1;
import java.io.*;
import java.util.*;

public class TopKfreElemenets {
    public static void main (String[] args) {

        int[] ip = new int[]{1,1,1,2,2,3,3};
        int k = 2;
        topKfreqele(ip, k);

    }

    static void topKfreqele(int[] n, int k )
    {
        int[] result = new int[k];
        HashMap<Integer, Integer> fre = new HashMap<>();
        //TC1 isnull
        if( n == null || n.length == 0)
            System.out.println(" Given array should not be empty");
        //TC2. <1,3> <2,2> < 4, 2 ><3,1>
        for( int i=0; i< n.length; i++)
        {
            fre.put(n[i], fre.getOrDefault(n[i],0)+1);
        }
        // TC2. <1,3> <2,2> <3,4>
        // Building PQ (sorting)
        PriorityQueue<Integer> pq= new PriorityQueue<>((w1,w2)
                -> fre.get(w1).equals(fre.get(w2)) ? w1.compareTo(w2) : fre.get(w2) -fre.get(w1));
        pq.addAll(fre.keySet());
        int i =0;
        while(!pq.isEmpty() && k >0)
        {
            result[i] =pq.poll();
            k--;
            i++;
        }
        // Printing

        System.out.println(" Printing top k ele");
        for( int j =0; j<result.length; j++)
        {
            System.out.println(result[j]);

        }
    }
}


