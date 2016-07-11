package com.java;

import java.io.*;
import java.util.*;

public class MinMaxMeanMedian {

	public static void main(String []args)throws IOException
	{
		int [] input = new int[] {111,22,33,4,15,1,100};	
		MinMaxMeanMedian mm = new MinMaxMeanMedian();
		// calculate mean, median, min, max, midvalue;
		for(int b: input)
			System.out.print(b+" ");
		int Lval = Integer.MAX_VALUE;
		int Hval = Integer.MIN_VALUE;
		int sum = 0;
		for(int i=0;i<input.length;i++)
		{
			if(input[i]<=Lval)
				Lval=input[i];
			if(input[i]>=Hval)
				Hval=input[i];
			sum=sum+input[i];
		}
		ArrayList<Integer> al = new ArrayList<Integer>(input.length);
		al.add(Lval);				// least
		al.add(Hval);				// high
		al.add(sum/input.length);	// mean
		al.add((Lval+Hval)/2);		// median
		System.out.println(input.length/2);
		al.add(input[(input.length/2)]);//mid val
		for(Integer a: al)
			System.out.print(a+" ");
	}
}
