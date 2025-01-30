package solutions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Hashtable;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class ListBundle01 {

    /* LC#1 - Two Sum */
    public int[] twoSum(int[] nums, int target) {
        Hashtable<Integer, Integer> ht = new Hashtable<>();
        int L = nums.length;
        for (int i=0; i<L; i++) {
            Integer located = ht.get(Integer.valueOf(target-nums[i]));
            if (located != null) {
                return new int[] { i, located };
            }
            ht.put(i, nums[i]);
        }
        return null;
    }

    public boolean hasDuplicate_1(int[] nums) {
        Arrays.sort(nums);
        for (int i=1; i<nums.length; i++) {
            if (nums[i-1]==nums[i]) return true;
        }
        return false;
    }
    public boolean hasDuplicate_2(int[] nums) {
        Set<Integer> s = null;
        s  = Arrays.stream(nums).boxed().collect(Collectors.toSet());
        return s.size()!=nums.length;
    }
    public boolean hasDuplicate_3(int[] nums) {
        List<Integer> list = new ArrayList<>();
        for(int i: nums) list.add(Integer.valueOf(i));
        Integer last = 0;
        for(Integer i: list) {
            if (i==last) return true;
            last = i;
        }
        return false;
    }

    public boolean isAnagram(String s, String t) {
        Hashtable<Character, Integer>  ht = new Hashtable<>();
        for(Character c: s.toCharArray()) {
            Integer located = ht.get(c);
            if (located!=null) {
                ht.replace(c, located+1);
            } else
                ht.put(c, 1);
        }
        for(Character c: t.toCharArray()) {
            Integer located = ht.get(c);
            if (located!=null) {
                ht.replace(c, located-1);
            } else
                return false;
        }
        List<Integer> res= ht.values().stream().filter(v->v!=0).collect(Collectors.toList());
        return res.size()==0;
    }

    public List<List<String>> groupAnagrams(String[] strs) {
        Hashtable<String, List<String>> ht = new Hashtable<>();
        for(String s: strs) {
            char[] as = s.toCharArray();
            Arrays.sort(as);
            String ss = String.valueOf(as);
            List<String> located = ht.get(ss);
            if(located!=null) {
                located.add(s);
                ht.put(ss, located);
            } else {
                List<String> newone = new ArrayList<>();
                newone.add(s);
                ht.put(ss, newone);
            }
        }
        return ht.values().stream().collect(Collectors.toList());
    }

}
