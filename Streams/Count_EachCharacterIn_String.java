package Streams;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class Count_EachCharacterIn_String {
	public static void main(String args[])
	{
		String s="My Name is Amit";
		Map<String,Long> map=Arrays.stream(s.split(""))
                .map(String::toLowerCase)
                .collect(Collectors
                .groupingBy(str -> str, 
                  LinkedHashMap::new, Collectors.counting()));
	}
}
