package com.hive;
/*
 * select fname,count(extractDate(tdate)) AS counter from tlist_db group by fname HAVING counter>1;
 */
import org.apache.hadoop.hive.ql.exec.UDF;
import org.apache.hadoop.io.*;

public class extractYear extends UDF{
	public Text evaluate(final Text s)
	{
		if(s==null) return null;
		else
			return new Text(s.toString().substring(1,10).replace(':','-'));
	}

}
