package com.java;

public class MinMaxMedian {
	
	public int Min(int[] a)
	{
		int temp =a[0];
		for(int i =0; i<a.length-1;i++)
			if(temp>a[i])
				temp = a[i];
		return temp;
	}
	
	public int Max(int[] b)
	{
		int temp =b[0];
		for(int i =0; i<b.length-1;i++)
			if(temp<b[i])
				temp = b[i];
		return temp;
	}
	
	public int Mean(int[] c)
	{
		int sum=0, mean=0;
		for(int i=0;i<c.length;i++)
			sum=sum+c[i];
		mean = sum/c.length;
		return mean;
		
	}
	public int Median(int d, int e)
	{
		return (d+e)/2;
	}
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] input = new int[] {11,2,5,15,31,22};
		int [] output = new int[5];
		MinMaxMedian m = new MinMaxMedian();
		output[0] = m.Min(input);
		output[1]= m.Max(input);
		output[2] = m.Mean(input);
		output[3] = m.Median(output[0],output[1]);
		output[4] = input[input.length/2];
		for(int i=0; i<input.length;i++)
			System.out.print(input[i]+ " ");
		System.out.println();
		for(int i=0; i<output.length;i++)
			System.out.print(output[i]+ " ");
	}

}
