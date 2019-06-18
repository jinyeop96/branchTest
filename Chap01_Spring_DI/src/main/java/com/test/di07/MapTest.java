package com.test.di07;

import java.util.Map;
import java.util.Set;

public class MapTest {
	private Map<Integer, String> map;

	public Map<Integer, String> getMap() {
		return map;
	}

	public void setMap(Map<Integer, String> map) {
		this.map = map;
	}
	
	public void prn() {
		Set<Integer> set = map.keySet();
		
		for(Integer k : set) {
			System.out.println(map.get(k));
		}
	}
}
