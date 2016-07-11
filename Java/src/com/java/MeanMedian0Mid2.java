package com.java;

import java.io.*;
import java.util.*;

public class MeanMedian0Mid2 {
	int Ltemp = Integer.MAX_VALUE;
	int Htemp = Integer.MIN_VALUE;
	
	public int Min(int[] input)
	{
		for(int a: input)
			if(Ltemp>=a)
				Ltemp=a;
		return Ltemp;
	}

	public int Max(int[] input){
		for(int a:input)
			if(Htemp<=a)
				Htemp=a;
		return Htemp;
	}
	
	public int Med()
	{	return (Ltemp+Htemp)/2;	}
	
	public int Mean(int[] input)
	{
		int sum=0;
		for(int a: input)
			sum=sum+a;
		return(sum/input.length);
	}
	
	public int mid(int[] input)
	{
		return input[(input.length)/2];
	}
	public static void main(String []args)throws IOException
	{
		int [] input = {111,100,9,14,23,31,41};
		MeanMedian0Mid2 mm = new MeanMedian0Mid2();
		List<Integer> li= new ArrayList<Integer>();
		li.add(mm.Min(input));
		li.add(mm.Max(input));
		li.add(mm.Med());
		li.add(mm.Mean(input));
		li.add(mm.mid(input));
		
		for(Integer a:li)
			System.out.print(a+" ");
		
	}
}
