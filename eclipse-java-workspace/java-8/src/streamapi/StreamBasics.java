package streamapi;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamBasics {

	public static void main(String[] args) {
		List<String> names = Arrays.asList("Gaurav","Suraj","Mohit","Javed","Harsh","Supriya");
		
		// Find the people whose name starts with s
		
		// convert the names to uppercase and store it to a new list
		
		
		List<String> namesInUppercase = names.stream().filter(s->s.startsWith("S"))
													.map(s->s.toUpperCase())
													.collect(Collectors.toList());
		System.out.println(namesInUppercase);
		
		// create a list of integers
		
		// find all the odd integers and square them and add them to a new list
		
	}
	
	
	
}
