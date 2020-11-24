package com.faang.StringsSet1;
import java.util.*;

public class StringBasicFn {

        public static void main(String[] args)
        {
            Scanner sc = new Scanner(System.in);
            int t = sc.nextInt();
            sc.nextLine();

            while(t--!=0)
            {
                int v =0, ws= 0,d = 0,lca = 0;
                String val = sc.nextLine();
                System.out.print(val);
                for(int i =0; i<val.length(); i++)
                {
                    if ( val.charAt(i)== 'a' || val.charAt(i) == 'e' || val.charAt(i) == 'i'
                            || val.charAt(i) == 'o' || val.charAt(i) == 'u')
                        v++;
                    if(Character.isDigit(val.charAt(i)))
                        d++;
                    if(Character.isLowerCase(val.charAt(i)))
                        lca++;
                    if(val.charAt(i) == ' ')
                        ws++;
                }
                System.out.printf("V: %d  WS: %d D: %d LCA: %d\n",v,ws,d,lca);
            }
        }
    }

