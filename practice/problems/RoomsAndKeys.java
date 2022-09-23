package org.practice.problems;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Stack;

/**
 * Leet code 841
 *
 *https://leetcode.com/problems/keys-and-rooms/
 */
public class RoomsAndKeys {
	
	public static void main(String[] args) {
		//case1();
		case2();
		
	}
	
	static void case1() {
		List<List<Integer>> rooms = new ArrayList<>();
		rooms.add(Arrays.asList(1));
		rooms.add(Arrays.asList(2));
		rooms.add(Arrays.asList(3));
		rooms.add(Collections.emptyList());
		
		System.out.println(canVisitAllRooms(rooms));
	}
	
	static void case2() {
		List<List<Integer>> rooms = new ArrayList<>();
		rooms.add(Arrays.asList(1, 3));
		rooms.add(Arrays.asList(3, 0, 1));
		rooms.add(Arrays.asList(2));
		rooms.add(Arrays.asList(0));
		
		System.out.println(canVisitAllRooms(rooms));
	}
	
	static boolean canVisitAllRooms(List<List<Integer>> rooms) {
		boolean[] visited = new boolean[rooms.size()];
		visited[0] = true;
			
		Stack<Integer> allKeys = new Stack<>();
		allKeys.add(0);
		
		while(!allKeys.isEmpty()) {
			int key = allKeys.pop();
			List<Integer> keys = rooms.get(key);
			for(Integer nk: keys) {
				if(!visited[nk]) {
					visited[nk] = true;
					allKeys.push(nk);
				}
			}
		}
		
		for(int i = 0 ; i < rooms.size(); i++) {
			if(!visited[i]) return false;
		}
		
		return true;
	}
}
