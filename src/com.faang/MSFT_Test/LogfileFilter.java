// you can also use imports, for example:
// import java.util.*;

// you can write to stdout for debugging purposes, e.g.
// System.out.println("this is a debug message");

class Solution {
    
    private boolean checkSize(String fileSize) {
        
        Character unit = fileSize.charAt(fileSize.length()-1);
        
        if (Character.isDigit(unit)) {
            return true;
        }
        
        double kbScale = 1000.0;
        Integer number = Integer.parseInt(fileSize.substring(0, fileSize.length()-1));
        
        if ('M' == unit) {
            return number < 14;
        } else if ('K' == unit) {
            return true;    
        }
        return false;
    }
    
    private boolean checkDate(String date) {
        String[] dateParts = date.split("-");
        Integer year = Integer.parseInt(dateParts[0]);
        String month = dateParts[1];
        String day = dateParts[2];
        
        if (year < 1990 || (1990 == year && "01".equals(month))) {
            return false;
        }
        return true;
    }
    
    private boolean checkFileName(String fileName) {
        Character lastChar = fileName.charAt(fileName.length()-1);
        if ('~' == lastChar) {
            return true;
        }
        return false;
    }
    
    public String solution(String S) {
        // write your code in Java SE 8
        
        String[] lines = S.split("\\r?\\n");
        int minLen = Integer.MAX_VALUE;
        for (String line : lines) {
            
            String[] metaData = line.split(" ");
            int l = metaData.length;
            String size = metaData[l-3];
            String date = metaData[l-2];
            String fileName = metaData[l-1];
            
            boolean sizeCheck = checkSize(size);
            boolean dateCheck = checkDate(date);
            boolean nameCheck = checkFileName(fileName);
            
            if (checkSize(size) && checkDate(date) && checkFileName(fileName)) {
                int index = fileName.lastIndexOf(".");
                int len = fileName.length();
                if (l != -1) {
                    len = index;
                }
                minLen = Math.min(minLen, len);
            }
        }
        
        if (minLen == Integer.MAX_VALUE) {
            return "-1";
        }
        
        return String.valueOf(minLen);
        
    }
}
