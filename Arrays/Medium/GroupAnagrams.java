package Arrays.Medium;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
class GroupAnagrams {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String,List<String>> hm = new HashMap<>();
        for(int i=0;i<strs.length;i++){
            char c[] = strs[i].toCharArray();
            Arrays.sort(c);
            String newstr = new String(c);
            if(!hm.containsKey(newstr)){
                hm.put(newstr,new ArrayList<>());
            }
            hm.get(newstr).add(strs[i]);
        }
        System.out.println(hm.values()+"------------VALUES--------------"+hm.keySet()+"------------KEYS");

        return new ArrayList<>(hm.values());
    }
    public static void main(String[] args) {
        GroupAnagrams ga = new GroupAnagrams();
        String[] strs = {"eat", "tea", "tan", "ate", "nat", "bat"};
        List<List<String>> result = ga.groupAnagrams(strs);
        System.out.println(result);
    }
}