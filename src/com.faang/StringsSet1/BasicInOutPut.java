package com.faang.StringsSet1;
import java.util.*;

public class BasicInOutPut {

   public  static String returnfalg(Boolean val)
        {

            if (val == true )
                return "MARRIED";
            else
                return "UNMARRIED";

        }

        public static void main(String[] args)
        {
            Scanner sc = new Scanner(System.in);
            int t = sc.nextInt();
            sc.nextLine();

            while(t--!=0)
            {
                String name = sc.nextLine();
                int age = sc.nextInt();
                float ht = sc.nextFloat();
                boolean flag = sc.nextBoolean();
                System.out.printf("%s is %d years old and %.2ft tall and is %s\n",name,age,ht,returnfalg(flag));

                // System.out.printf("V: %d  WS: %d D: %d LCA: %d\n",v,ws,d,lca);
            }
        }
    }