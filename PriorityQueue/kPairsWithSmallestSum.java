package PriorityQueue;
import java.util.PriorityQueue;
import java.util.Collections;
import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;

class kPairsWithSmallestSum {
    public List<List<Integer>> kSmallestPairs(int[] nums1, int[] nums2, int k) {
        PriorityQueue<int[]> pq = new PriorityQueue<>((a,b)->a[0]+a[1]-b[0]-b[1]);
        List<List<Integer>> ls = new ArrayList<>();

        for(int i=0;i<nums1.length && i<k;i++){
            pq.offer(new int[]{nums1[i],nums2[0],0});
        }   

        while(k-->0 && !pq.isEmpty()){
            int newans [] = pq.poll();
            ls.add(Arrays.asList(newans[0],newans[1]));
            if(newans[2] == nums2.length-1) continue;
            pq.offer(new int[]{newans[0],nums2[newans[2]+1],newans[2]+1});
        }
        return ls;
    }
}