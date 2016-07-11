package com.java;

import java.util.*;

public class weatherreport {

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
		/*Map<String, List<Integer>> m2 = new HashMap <String, List<Integer>>();
		m2.put("Sunday", Arrays.asList(20,40));
		m2.put("Monday", Arrays.asList(30,42));
		m2.put("Tuesday", Arrays.asList(24,39));
		m2.put("Wednesday", Arrays.asList(21,41));
		m2.put("Thursday", Arrays.asList(12,46));
		m2.put("Friday", Arrays.asList(27,37));
		m2.put("Saturday", Arrays.asList(29,90));
		
		int size = m2.size();
		String Lkey = "";
		String Gkey = "";
		for()
		*/
		
		HashMap<String, List<Integer>> m1 = new HashMap<String, List<Integer>>();
		m1.put("Sunday", Arrays.asList(20,40));
		m1.put("Monday", Arrays.asList(30,42));
		m1.put("Tuesday", Arrays.asList(24,39));
		m1.put("Wednesday", Arrays.asList(21,41));
		m1.put("Thursday", Arrays.asList(12,46));
		m1.put("Friday", Arrays.asList(27,37));
		m1.put("Saturday", Arrays.asList(29,90));
		
		//Set st = m1.keySet();
		// Set st = m1.entrySet();
		Collection<List<Integer>> st = m1.values();
		Iterator it = st.iterator();
		while(it.hasNext())
		{
			//m1.get(it.next().toString());
			System.out.println(it.next());
			//System.out.println(it.next());
		}
		
		/*
		for(int i =0; i <size-1;i++)
		{
			if(ltemp >= m1.get(i).get(1))
				{
				ltemp = m1.get(i).get(1);
				Lkey = m1.get(i);
				}
			if(gtemp <= m1.get(i).get(2))
				gtemp = m1.get(i).get(2);
		}*/
	}
}
