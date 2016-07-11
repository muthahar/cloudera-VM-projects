package com.hbase;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

import org.apache.hadoop.conf.Configuration;
import org.apache.hadoop.hbase.HBaseConfiguration;
import org.apache.hadoop.hbase.client.Get;
import org.apache.hadoop.hbase.client.HTable;
import org.apache.hadoop.hbase.client.Result;
import org.apache.hadoop.hbase.client.ResultScanner;
import org.apache.hadoop.hbase.client.Scan;
import org.apache.hadoop.hbase.util.Bytes;

public class HBaseDataRead {
	
	public static void main(String [] args) throws IOException
	{
		Configuration conf = HBaseConfiguration.create();
		HTable htable = new HTable(conf,"stocks");
		//Scan sc = new Scan();
		//htable.getScanner(sc);
		
		/*
		 * 1. if we know the key
		 * 2. get specific column for all keys
		 */
		Get data = null;
		System.out.println("Enter 1. Read by Key or 2. Read by column for all keys");
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		//in input = in.read();
		Scanner sc1 = new Scanner(System.in);
		int input = sc1.nextInt();
		if(input == 1)
		{
			System.out.println("Input record key as 'CAP $ 2009-04-20' ");
			String Key = in.readLine();
			data = new Get(Bytes.toBytes(Key));
			
			Result r1 = htable.get(data);
			String open = Bytes.toString(r1.getValue("nyse".getBytes(), "open".getBytes()));
			String high = Bytes.toString(r1.getValue("nyse".getBytes(), "high".getBytes()));
			String low = Bytes.toString(r1.getValue("nyse".getBytes(), "low".getBytes()));
			//System.out.println(Bytes.toString(r1.getValue("nyse".getBytes(), "open".getBytes())));
			System.out.println(Key + "\t" + open + "\t" +high +"\t"+low);
			//System.exit(1);
			// get specific key value
			// SOP
		}
		else
		{
			System.out.println("Enter columns that u want to display for all keysby spaces ");
			String column = in.readLine();
			if(column != null)
			{
				Scan sc = new Scan();
				ResultScanner rs = htable.getScanner(sc);
				for(Result r = rs.next();r!=null;r=rs.next())
				{
					System.out.print(Bytes.toString(r.getRow()) + " \t ");
					System.out.println(Bytes.toString(r.getValue("nyse".getBytes(),column.getBytes())));
				}
			}
		}
	}
}
