/**
 * Created by suziray on 11/15/16.
 */
// https://leetcode.com/problems/two-sum/

import java.util.HashMap;

public class twoSum {
    public int[] twoSum(int[] nums, int target) {
        int len = nums.length;
        if(len < 3) return new int[]{0, 1};
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
        for(int i = 0; i < len; ++i){
            if(map.containsKey(nums[i])){
                if(2 * nums[i] == target) return new int[]{map.get(nums[i]), i};
            } else {
                map.put(nums[i], i);
            }
        }
        for(int i = 0; i < len; ++i){
            if(2 * nums[i] != target && map.containsKey(target - nums[i])){
                return new int[]{i, map.get(target - nums[i])};
            }
        }
        return null;
    }
}
