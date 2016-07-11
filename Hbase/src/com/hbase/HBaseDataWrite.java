package com.hbase;

import org.apache.hadoop.conf.*;
import java.io.File;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

import org.apache.hadoop.hbase.*;
import org.apache.hadoop.hbase.client.*;

public class HBaseDataWrite {

	public static void main(String[] args) throws IOException {
		// Instantiate the configuration
		Configuration conf = HBaseConfiguration.create();
		
		// No need of admin privileges
		
		//HTableDescriptor htable = new HTableDescriptor("stocks");
		HTable htable = new HTable(conf,"stocks");
		Put data = null;
		int count = 0;
		File file = new File("/home/training/stocks");
		BufferedReader br = new BufferedReader(new FileReader(file));
		String line = br.readLine();
		while(line != null)
		{
			String [] parts = line.split("\\t");
			if(parts.length == 9)
			{
				String rowKey = parts[1]+" $ "+parts[2];
				data = new Put(rowKey.getBytes());
				data.add("nyse".getBytes(), "open".getBytes(), parts[3].getBytes());
				data.add("nyse".getBytes(), "high".getBytes(), parts[4].getBytes());
				data.add("nyse".getBytes(), "low".getBytes(), parts[5].getBytes());
				data.add("nyse".getBytes(), "close".getBytes(), parts[6].getBytes());
				data.add("nyse".getBytes(), "volume".getBytes(), parts[7].getBytes());
				data.add("nyse".getBytes(), "adj_close".getBytes(), parts[8].getBytes());
			}
			htable.put(data);
			count++;
			line = br.readLine();
		}
		if(count > 3)
			System.out.println("Data written in to table");
		else
			System.out.println("only one record added");
	}

}

