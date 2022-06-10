package com.xyz.collectionframework;

public class GenericExample {

	public static void main(String[] args) {
		Calculator<Double> c = new Calculator<>(10.0, 15.0);
		var sum = c.add(20.5);
		System.out.println(sum);
	}
	
}


class Calculator<T>{
	
	T x;
	T y;
	
	public Calculator(T x, T y) {
		this.x=x;
		this.y=y;
	}
	
	int add(T z) {
		return (Integer)x + (Integer) y +(Integer)z;
	}
	
}
