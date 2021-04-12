package com.pack1;

import java.util.PriorityQueue;
import java.util.Queue;

public class M2 {

	public static void main(String[] args) {
		Queue<Integer> queue = new PriorityQueue<Integer>();
		queue.add(20);
		queue.add(18);
		queue.add(14);
		queue.add(18);
		//queue.add("hi");
		//queue.add(null);
		System.out.println(queue);
		System.out.println(queue.size());
		for(Integer i : queue)
		{
			System.out.println(i);
		}
		System.out.println("====");
		System.out.println(queue.peek());
		System.out.println(queue.size());
		System.out.println("====");
		System.out.println(queue.poll());
		System.out.println(queue.size());
		System.out.println(queue);
		System.out.println("====");
		System.out.println(queue.poll());
		System.out.println(queue.size());
		System.out.println(queue);
		System.out.println("====");
		queue.clear();
		System.out.println(queue.size());
		System.out.println(queue);

		
	}

}
