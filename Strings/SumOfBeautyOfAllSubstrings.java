package Strings;

class SumOfBeautyOfAllSubstrings {
    public int beautySum(String s) {
        int sum = 0;
        for(int i=0;i<s.length();i++){
            int freq[] = new int[26];
            for(int j=i;j<s.length();j++){
                freq[s.charAt(j)-'a']++;
                int max = Integer.MIN_VALUE;
                int min = Integer.MAX_VALUE;
                for(int x:freq){
                    if(x != 0){
                        max = Math.max(max,x);
                        min = Math.min(min,x);
                    }
                }
                sum += (max-min);
            }
        }
        return sum;
    }
}