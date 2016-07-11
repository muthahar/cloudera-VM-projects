package com.hive;
import org.apache.hadoop.hive.ql.exec.UDF;
import org.apache.hadoop.io.Text;

public final class myUpperhiveudf extends UDF{
	public Text evaluate(final Text s)
	{
		if(s==null) return null;
		else
			return new Text(s.toString().toUpperCase());
	}

}
