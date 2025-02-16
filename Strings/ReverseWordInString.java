package Strings;

class ReverseWordInString {
    public String reverseWords(String s) {
        String words[] = s.trim().split("\\s+");
        StringBuilder a = new StringBuilder();
        for(int i=words.length-1;i>=0;i--){
            a.append(words[i]);
            if(i>0) a.append(" ");
        }
        return a.toString();
    }
}