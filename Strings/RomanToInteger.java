package Strings;

import java.util.HashMap;

class RomanToInteger {
    public int romanToInt(String s) {
        HashMap<Character,Integer> hm = new HashMap<>();
        hm.put('I',1);
        hm.put('V',5);
        hm.put('X',10);
        hm.put('L',50);
        hm.put('C',100);
        hm.put('D',500);
        hm.put('M',1000);

        int result = hm.get(s.charAt(s.length()-1));
        
        for(int i=s.length()-2;i>=0;i--){
            if(hm.get(s.charAt(i)) < hm.get(s.charAt(i+1))){
                result -= hm.get(s.charAt(i));
            }else{
                result += hm.get(s.charAt(i));
            }
        }

        return result; 
    }
    // optimal
    public int romanToInt2(String s) {
        int result = 0;
            int num = 0;
            for(int i=s.length()-1;i>=0;i--){
                switch(s.charAt(i)){
                    case 'I':num=1; break;
                    case 'V':num=5; break;
                    case 'X':num=10; break;
                    case 'L':num=50; break;
                    case 'C':num=100; break;
                    case 'D':num=500; break;
                    case 'M':num=1000; break;
                }
                if(4*num<result) result-=num;
                else result+=num; 
            }

            return result; 
    }
}