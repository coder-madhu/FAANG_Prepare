package com.faang.StringsSet1;

class PalindromeRemoveChar {

    public boolean check(String A,int s,int e){
        while(s<=e){
            if(A.charAt(s) != A.charAt(e)){
                return false;
            }
            s++;
            e--;
        }
        return true;
    }

    boolean validPalindrome(String A) {
        int s=0;
        int e = A.length()-1;

        while(s<=e){
            if(A.charAt(s) != A.charAt(e)){
                // 2 cases
                // delete s  check for A[s+1...e]
                // delete e check for A[s...e-1]
                if(check(A,s+1,e) || check(A,s,e-1)){
                    return true;
                } else {
                    // after deleting 1 char we are unable to obtain a palin
                    return false;
                }
            }
            s++;
            e--;
        }

        return true;
    }
};