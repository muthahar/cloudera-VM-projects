package com.java;

import java.util.*;

public class Weatherreport03 {

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
		Map<String, List<Integer>> temp = new HashMap <String, List<Integer>>();
		temp.put("Sunday", Arrays.asList(20,40));
		temp.put("Monday", Arrays.asList(30,42));
		temp.put("Tuesday", Arrays.asList(24,39));
		temp.put("Wednesday", Arrays.asList(21,41));
		temp.put("Thursday", Arrays.asList(12,46));
		temp.put("Friday", Arrays.asList(27,37));
		temp.put("Saturday", Arrays.asList(29,90));

		Set st = temp.entrySet();
		Iterator it = st.iterator();
		int Ltemp = Integer.MAX_VALUE;
		int low=0,high=0;
		int Htemp = Integer.MIN_VALUE;
		String Lkey = "";
		String Hkey = "";
		String key ="";
		
		while(it.hasNext())
		{
			Map.Entry<String, List<Integer>> me = (Map.Entry<String, List<Integer>>)it.next();
			low=me.getValue().get(0);
			high=me.getValue().get(1);
			key = me.getKey();
			if(low<=Ltemp)
			{
				Ltemp = low;
				Lkey = key;
			}
			if(high>=Htemp)
			{
				Htemp=high;
				Hkey=key;
			}
		}
		System.out.println("Low Temp is "+Ltemp+ " and key is "+Lkey);
		System.out.println("High Temp is "+Htemp+ " and key is "+Hkey);
	}
}
