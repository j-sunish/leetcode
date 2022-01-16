package com.leetcode.easy;

import java.util.HashMap;
import java.util.Map;

/**
 * 1. Two Sum.
 * 
 *
 */
public class TwoSum {
	public int[] twoSum(int[] nums, int target) {
		Map<Integer, Integer> map = new HashMap<>();
		int[] rst = new int[2];
		for (int i = 0; i < nums.length; i++) {
			if (map.containsKey(target - nums[i])) {
				rst[0] = i;
				rst[1] = map.get(target - nums[i]);
				break;
			}
			map.put(nums[i], i);
		}
		return rst;
	}
}
