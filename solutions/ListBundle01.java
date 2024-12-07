package solutions;

import java.util.HashSet;
import java.util.Hashtable;
import java.util.List;
import java.util.Set;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class ListBundle01 {

    public int[] twoSum(int[] nums, int target) {
        Hashtable<Integer, Integer> memo = new Hashtable<>();
        int L = nums.length;
        for(int i=0; i<L; i++) {
            Integer located = memo.get(Integer.valueOf(target-nums[i]));
            if( located != null ) {
                return new int[] { i, located };
            }
            memo.put(nums[i], i);
        }
        return null;
    }

    public boolean hasDuplicate(int[] nums) {
        Set<Integer> set = new HashSet<>();
        int L = nums.length;
        for(int i=0; i<L; i++) {
            if (set.contains(nums[i])) {
                return true;
            }
            set.add(nums[i]);
        }
        return false;
    }    

    public boolean isAnagram(String s, String t) {
        Hashtable<Character, Integer> memo = new Hashtable<>();
        for (Character c : s.toCharArray()) {
            Integer located = memo.get(c);
            if(located!=null) {
                memo.put(c, located+1);
            } else {
                memo.put(c, 1);
            }
        }
        for (Character c: s.toCharArray()) {
            Integer located = memo.get(c);
            if(located!=null) {
                memo.put(c, located-1);
            } else {
                return false;
            }
        }
        List<Integer> res = memo.values().stream().filter(x -> x!=0).collect(Collectors.toList());
        if (res.isEmpty())  return true;
        return false;
    }
}
