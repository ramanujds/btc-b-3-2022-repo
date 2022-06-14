package streamapi;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
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
													.map(String::toUpperCase)
													.collect(Collectors.toList());
		//System.out.println(namesInUppercase);
		
		// create a list of integers
		
		// find all the odd integers and square them and add them to a new list
		
		List<Integer> list = Arrays.asList(10,8,3,6,2,4);
		
		int sum = list.stream().filter(num->num%2!=0)
								.map(num->num*2)
								
								//.reduce((i,s)->i+s)
								.findFirst()
								.orElseThrow(()->new ArithmeticException("No value was found"));
		
		
		
		
		System.out.println(sum);
		
		Stream<String> values = Stream.of("Tushar","Manish","Anuj","Harsh","Manisha");
		
		// values.sorted(Comparator.reverseOrder()).forEach(s->System.out.println(s));
		
		long total = values.filter(s->s.length()>=5).filter(s->s.startsWith("M")).count();
		
		System.out.println(total);
		
		
		
	}
	
	
	
}
