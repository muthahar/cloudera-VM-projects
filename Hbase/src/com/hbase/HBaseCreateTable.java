package com.hbase;

import java.io.*;
import org.apache.hadoop.hbase.HBaseConfiguration;
import org.apache.hadoop.hbase.HTableDescriptor;
import org.apache.hadoop.hbase.HColumnDescriptor;
import org.apache.hadoop.conf.*;
import org.apache.hadoop.hbase.client.*;


public class HBaseCreateTable {
	
	public static void main(String [] args)throws IOException
	{
		// Instantiate Hbase configuration first
		Configuration conf = HBaseConfiguration.create();
		
		// HTable should have table name as input <toBytes>
		HTableDescriptor htable = new HTableDescriptor("stocks");
		
		// create admin to manage tables
		HBaseAdmin admin = new HBaseAdmin(conf);
		
		// Now create ColumnDescriptor for creating column names
		//HColumnDescriptor Hcol = new HColumnDescriptor("nyse");
		
		htable.addFamily(new HColumnDescriptor("nyse"));
		
		if(admin.tableExists("stocks"))
		{
			admin.disableTable("stocks");
			System.out.println("Table disabled for deletion");
			admin.deleteTable("stocks");
			System.out.println("Existing table deleted");
		}
		admin.createTable(htable);
		System.out.println("New Table created");
	}
}
