package com.java;

import java.io.*;
import java.util.*;

public class MeanMedian0Mid1 {

	public static void main(String []args)throws IOException
	{
		ArrayList<Integer> ar = new ArrayList();
		ArrayList<Integer> ar1 = new ArrayList();
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String input=null;
		while((input=br.readLine())!=null && !input.equalsIgnoreCase("stop"))
		{	ar.add(Integer.valueOf(input));}
		int mid = ar.get((ar.size()/2));	// gives mid value
		java.util.Arrays.sort(ar.toArray());
		int high = ar.get(0);					// gives min value
		int low = ar.get(ar.size()-1);			// gives max value
		int median = (low+high)/2;
		int sum =0;
		for(int a: ar)
			sum=sum+a;
		int mean = sum/ar.size();
		ar1.add(low);
		ar1.add(high);
		ar1.add(mean);
		ar1.add(median);
		ar1.add(mid);
		for(int a:ar1)
			System.out.print(a+ " ");
	
	}
}
