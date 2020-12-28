


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.*;
import java.util.*;

public class Stream_1 {
	public static void main (String args[])
	{
		//ArrayList<String> list  = (ArrayList<String>) Arrays.asList("Ashi","Bindal","Sharve","Sharma");
		List<String> list = new ArrayList<>(Arrays.asList("Ashi","Bindal"));
		
		System.out.println
		(list);
		
		Stream substream = list.stream().map(x -> {
			if (x.startsWith("B"))
			return "Sharma";
			return x;});
		substream.forEach(y -> System.out.println(y));
		
		
		IntStream.range(1, 10).forEach(System.out::print);
		
		}
	
	}	
