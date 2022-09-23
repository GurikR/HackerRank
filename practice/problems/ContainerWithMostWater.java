package org.practice.problems;

/**
 *https://leetcode.com/problems/container-with-most-water/
 *
 * 2 pointer method
 */
public class ContainerWithMostWater {

	public static void main(String[] args) {
		case2();
	}
	
	static void case1() {
		int[] ip = {1, 8, 6, 2, 5, 4, 8, 3, 7};
		System.out.println(maxArea(ip));
	}
	
	static void case2() {
		int[] ip = {3, 0, 0, 2, 0 , 4};
		System.out.println(maxArea(ip));
	}
	
	static int maxArea(int[] heights) {
		int max_area = 0;
		int a_pointer = 0;
		int b_pointer = heights.length - 1;
		
		while(a_pointer < b_pointer) {
			if(heights[a_pointer] < heights[b_pointer]) {
				max_area = Math.max(max_area, heights[a_pointer] * (b_pointer - a_pointer));
				a_pointer++;
			} else {
				max_area = Math.max(max_area, heights[b_pointer] * (b_pointer - a_pointer));
				b_pointer--;
			}
		}
		
		return max_area;
	}
}
