package samplecode;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Stream {

	public static void main(String[] args) {
		
		List<String> names = Arrays.asList("Abe", "Bob", "Chris", "Dan", "Eve"); 
		List<String> collect = names.stream().map(String::toUpperCase).collect(Collectors.toList());
        System.out.println(collect);
        List<String> startWithC = names.stream().filter(str -> str.matches("C.*")).collect(Collectors.toList());
        System.out.print(startWithC);
		

	}

}
