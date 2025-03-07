package Strings;
class ZigZagPattern {
    public String convert(String s, int numRows) {
        if(numRows ==1 || numRows>=s.length()) return s;

        StringBuilder str[] = new StringBuilder[Math.min(numRows,s.length())];
        for (int i = 0; i < str.length; i++) str[i] = new StringBuilder();

        int currRow = 0;
        boolean goingDown = false;

        for(char a : s.toCharArray()){
            str[currRow].append(a);
            if(currRow == 0 || currRow == numRows-1) goingDown = !goingDown;
            currRow += goingDown ? 1 : -1;
        }

        StringBuilder finalStr = new StringBuilder();
        for(StringBuilder a : str){
            finalStr.append(a);
        }
        
        return finalStr.toString();
    }
}