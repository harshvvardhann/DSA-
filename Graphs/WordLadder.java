package Graphs;
class WordLadder {
    class Pair{
        String text;
        int sequence;

        Pair(String text,int sequence){
            this.text = text;
            this.sequence = sequence;
        }
    }
    public int ladderLength(String beginWord, String endWord, List<String> wordList) {
        Queue<Pair> queue = new LinkedList<>();
        queue.add(new Pair(beginWord,1));

        HashSet<String> hs = new HashSet<>();
        for(String s: wordList){
            hs.add(s);
        }

        while(!queue.isEmpty()){
            String txt = queue.peek().text;
            int seq = queue.peek().sequence;
            
            if(txt.equals(endWord) == true) return seq;

            char newarr[] = txt.toCharArray();
            for(int i=0;i<txt.length();i++){
                for(char c='a';c<='z';c++){
                    newarr[i] = c;
                    String newstr = new String(newarr);
                    if(hs.contains(newstr)){
                        hs.remove(newstr);
                        queue.add(new Pair(newstr,seq+1));
                    }
                }
                newarr = txt.toCharArray();
            }
            queue.poll();
        }
        return 0;
    }
}