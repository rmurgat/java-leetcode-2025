package solutions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Hashtable;
import java.util.List;
import java.util.Map;
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

    public boolean isPalindrome(String s) {
        int l = 0, r = s.length()-1;
        while (l<r) {
            while ( l<r && !Character.isLetterOrDigit(s.charAt(l))) l++;
            while ( l<r && !Character.isLetterOrDigit(s.charAt(r))) r--;
            if (Character.toLowerCase(s.charAt(l))!=Character.toLowerCase(s.charAt(r))) return false;
            l++;
            r--;
        }
        return true;
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

    public int[] topKFrequent(int[] nums, int k) {
        int[] res = new int[k];
        Hashtable<Integer, Integer> ht = new Hashtable<>();
        for(int n:nums) {
            ht.put(Integer.valueOf(n), 1 + ht.getOrDefault(Integer.valueOf(n), 0));
        }
        List<Map.Entry<Integer, Integer>> sorted = ht.entrySet().stream().sorted(Map.Entry.comparingByValue(Comparator.reverseOrder())).collect(Collectors.toList());
        int i = 0;
        while (i<k) {
            Map.Entry<Integer,Integer> e = sorted.get(i);
            res[i] = e.getKey();
            i++;
        }
        return res; 
    }

    public String encode(List<String> strs) {
        String ans = "";
        if(strs.size()==0) return null;
        String tmp = String.join("|", strs);
        for (char c: tmp.toCharArray()) {
            ans = ans + (char)(c^30);
        }
        return ans;
    }
    public List<String> decode(String str) {
        String ans = "";
        if(str==null) return new ArrayList<>();
        if(str.equals("")) new ArrayList<>(Arrays.asList(""));
        for (char c: str.toCharArray()) {
            ans = ans + (char)(c^30);
        }
        String[] ans1 = ans.split("\\|"); 
        return Arrays.asList(ans1);
    }

    public int[] productExceptSelf_1(int[] nums) {
        int[] res = new int[nums.length];
        for (int i=0; i<nums.length; i++) {
            int p = 1, j=0;
            do {
                if(i!=j) p = p * nums[j];
                j++;
            } while(j<nums.length);
            res[i] = p;
        }
        return res;
    }
    public int[] productExceptSelf_2(int[] nums) {
        int[] ans = new int[nums.length];
        int p = 1, l=0, r=nums.length-1;
        while(l<nums.length) {
            ans[l] = p;
            p = p * nums[l];
            l++;
        }
        p = 1;
        while(r>-1) {
            ans[r] = p * ans[r];
            p = p * nums[r];
            r--;
        }
        return ans;
    }
    
}
