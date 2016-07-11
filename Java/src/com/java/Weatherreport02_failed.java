package com.java;

import java.util.*;

public class Weatherreport02_failed {

	/**
	 * @param args
	 * Day			Min			Max
	 * Sunday		20			40
	 * Monday		21			44
	 * Tuesday		44			30
	 * Wednesday	20			23
	 * Thursday		40			22
	 * Friday		10			11
	 * Saturday		51			10
	 * Sunday		19			91
	 * 
	 * Key Value Pairs <LinkedList/ArrayList/List>
	 * or 7*3 = 21
	 * 1. use Map and Array
	 * 2. user Array using odd numbs
	 * 3. use Map and LinkedList
	 * 
	 * 
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<Integer, String> day = new HashMap <Integer, String>();
		day.put(1,"Sunday");
		day.put(2,"Monday");
		day.put(3,"Tuesday");
		day.put(4,"Wednesday");
		day.put(5,"Thursday");
		day.put(6,"Friday");
		day.put(7,"Saturday");
		
		Map<Integer, List<Integer>> temp = new HashMap <Integer, List<Integer>>();
		temp.put(1, Arrays.asList(20,40));
		temp.put(2, Arrays.asList(30,42));
		temp.put(3, Arrays.asList(24,39));
		temp.put(4, Arrays.asList(21,41));
		temp.put(5, Arrays.asList(12,46));
		temp.put(6, Arrays.asList(27,37));
		temp.put(7, Arrays.asList(29,90));
		
		
		
		//ArrayList<Integer> Min = new ArrayList<Integer>();
		//ArrayList<Integer> Max = new ArrayList<Integer>();
		
		Iterator<List<Integer>> it = temp.values().iterator();
		int ltemp = it.next().get(1);
		int htemp = it.next().get(2);
		while(it.hasNext())
		{
			
			//Map.Entry<Integer, List<Integer>> me = (Map.Entry<Integer, List<Integer>>) it.next();
			//Min.add(me.getValue().get(1));
			//Max.add(me.getValue().get(2));
			List<Integer> l1 = it.next();
		
				
			
			//Min.add(l1.get(0));
			//Max.add(l1.get(1));
			
		}
		//java.util.Arrays.sort(Min.toArray());
		//java.util.Arrays.sort(Max.toArray());
		
		//System.out.println(Min.get(0));
		//System.out.println(Max.get(Max.size()-1));
		//System.out.println(day.containsValue(temp.containsValue(Min.get(0))));
		//System.out.println(day.containsValue(temp.containsValue(Max.get(Max.size()-1))));
	}
}
