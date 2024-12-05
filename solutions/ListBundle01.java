package solutions;

import java.util.Hashtable;

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
}
