package com.java;

public class mergesort {
	int [] list;
	int [] temp;
	int low=0;
	int high=0;
	public mergesort(int[] a)
	{
		this.list = a;
		this.high = a.length;
		this.temp = new int[a.length];
		merging(low,high-1);
	}
	//int [] merging(int [] b, int l, int h)
	void merging(int l, int h)
	{
		if(l<h)
		{
			int m = l+(h-l)/2;
			merging(l,m);
			merging(m+1,h);
			merge(l,m,h);
		}
	}
	void merge(int l1, int m1, int h1)
	{
		for(int i=l1; i<h1;i++)
			temp[i]=list[i];
		int i =l1;
		int j = m1+1;
		int k = l1;
		
		while(i<=m1 && j<=h1)
		{
			if(temp[i]<=temp[j]){
				list[k] = temp[i];
				i++; }
			else
			{ list[k] = temp[j];
			j++;
			}
			k++;
		}
			while(i<=m1)
			{
				list[k] = temp[i];
				k++;
				i++;
			}
		
	}
	
	public static void main(String [] args)
	{
		int [] a = {111,20,2,41,4,55,100,9,6};
		mergesort m = new mergesort(a);
		for(int i=0;i<a.length;i++)
			System.out.println(a[i]);
	}

}
