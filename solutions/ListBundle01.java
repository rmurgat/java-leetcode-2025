package solutions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Hashtable;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
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

    public List<List<String>> groupAnagrams(String[] strs) {
        Hashtable<String, List<String>> ht = new Hashtable<>();
        for (String s : strs) {
            char[] arr = s.toCharArray();
            Arrays.sort(arr);
            String ss = String.valueOf(arr);
            List<String> located = ht.get(ss);
            if( located!=null ) {
                located.add(s);
                ht.put(ss, located);
            } else {
                List<String> n = new ArrayList<>();
                n.add(s);
                ht.put(ss, n);
            }
        }
        return ht.values().stream().toList();
    }

    public int[] replaceElements(int[] arr) {
        List<Integer> ans = new ArrayList<>();
        int max1 = -1;
        int L = arr.length;
        for(int i=L-1; i>-1; i--) {
            ans.add(max1);
            max1 = Math.max(max1,arr[i]);
        }
        Collections.reverse(ans);
        int[] aans = new int[ans.size()];
        for(int i=0; i<L; i++) {
            aans[i] = ans.get(i).intValue();
        }
        return aans;
    }

    public boolean isSubsequence(String s, String t) {
        int L = s.length();
        int located = 0;
        int i=0, j=0;
        while (j<t.length()) {
            if (located==L) return true;
            if (s.charAt(i)==t.charAt(j)) {
                i++;
                located++;
            }
            j++;
        }
        if(located==L) return true;
        return false;
    }

    public int lengthOfLastWord(String s) {
        String rs = s.trim();
        int L = rs.length()-1;
        int j = L;
        while (j>-1) {
            if(rs.charAt(j)==' ') break;
            j--;
        }
        return (L-j);
    }

    public String longestCommonPrefix_1(String[] strs) {
        String ans = "";
        Arrays.sort(strs);
        String first = strs[0];
        String last = strs[strs.length-1];
        for(int i=0; i<Math.min(first.length(),last.length()); i++) {
            if(first.charAt(i)!=last.charAt(i)) break;
            ans+=first.charAt(i);
        }
        return ans;
    }    

    public String longestCommonPrefix_2(String[] strs) {    
        if(strs==null || strs.length==0) return "";
        String prefix = strs[0];
        for (String s : strs) 
            while(s.indexOf(prefix)!=0) 
                prefix = prefix.substring(0, prefix.length()-1);
        return prefix;
    }

    public int[] topKFrequent(int[] num, int k) {
        int[] res = new int[k];
        Map<Integer,Integer> memo = new HashMap<>();
        for (int i : num) {
            Integer located = memo.get(i);
            if (located!=null) {
                memo.put(i, located + 1);
            } else {
                memo.put(i, 1);
            }
        }
        List<Map.Entry<Integer,Integer>> list = new ArrayList<>(memo.entrySet());
        list.sort(Map.Entry.comparingByValue());
        int j=0;
        for(int i=list.size()-1; i>-1; i--) {
            if (j==k) break;
            Map.Entry<Integer,Integer> entry = list.get(i);
            res[j++] = entry.getKey().intValue();
        }
        return res;
    }

    public String encode(List<String> strs) {
        String ans = "";
        for (String s: strs) {
            for (char c: s.toCharArray()) {
                int i = ((int) c) << 2;
                ans += (char) i;
            }
            ans += (char) 10;
        }
        return ans;
    }

    public List<String> decode(String s) {
        List<String> ans = new ArrayList<>();
        String ele = "";

        for (char c: s.toCharArray()) {
            if(c==10) {
                ans.add(ele);
                ele = "";
            } else {
                int i = (int) c >> 2;
                ele += (char) i;
            }
        }
        return ans;
    }

    public int[] productExceptSelf(int[] nums) {
        int[] ans= new int[nums.length];
        int left = 1;
        for(int i=0; i<nums.length; i++) {
            ans[i] = left;
            left = left * nums[i];
        }
        int right = 1;
        for(int i= nums.length-1; i>-1; i--){
            ans[i] = right * ans[i];
            right = right * nums[i];
        }
        return ans;
    }    

}
