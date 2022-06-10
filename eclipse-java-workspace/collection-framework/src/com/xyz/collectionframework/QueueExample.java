package com.xyz.collectionframework;

import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class QueueExample {

	public static void main(String[] args) {
		
		Queue<String> queue = new PriorityQueue<String>();
		
		queue.add("Tushar");
		queue.add("Harsh");
		queue.add("Javed");
		queue.add("Kunal");
		
		while(!queue.isEmpty()) {
			System.out.println(queue.poll());
		}
		
		
		

	}

}
