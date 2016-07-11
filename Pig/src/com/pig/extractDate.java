package com.pig;
import java.io.*;
import org.apache.pig.EvalFunc;
import org.apache.pig.data.Tuple;

public abstract class extractDate extends EvalFunc<String>{
	public String exec(Tuple input) throws IOException
	{
		if(input == null) return null;
		else
			return input.get(6).toString().substring(1,10).replace(':','-');
	}

}
