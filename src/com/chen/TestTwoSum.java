package com.chen;

public class TestTwoSum {
	/**
	 * 2017/07/08
	 Given an array of integers, return indices of the two numbers such that
	 they add up to a specific target.

	 You may assume that each input would have exactly one solution, and you
	 may not use the same element twice.
	  */
	/*
	 * Example: Given nums = [2, 7, 11, 15], target = 9,
	 * 
	 * Because nums[0] + nums[1] = 2 + 7 = 9, return [0, 1].
	 */

	public int[] twoSum(int[] nums, int target) {
		int result[] = new int[2];
		if (null != nums && nums.length >= 1) {
			for (int i = 0; i < nums.length; i++) {
				for (int j = i + 1; j < nums.length; j++) {
					if (nums[i] + nums[j] == target) {
						result[0] = i;
						result[1] = j;
					}
				}
			}
		}
		return result;
	}

	public static void main(String[] args) {
		int nums[] = { 2, 7, 11, 15 };
		int target = 17;
		int rs[] = new TestTwoSum().twoSum(nums, target);
		for (int i = 0; i < rs.length; i++) {
			System.out.println(rs[i]);
		}
	}
}
