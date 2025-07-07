package frameworkspractice;

import java.util.PriorityQueue;

public class priorityqueue {

	public static void main(String[] args) {
		PriorityQueue <Integer> pq= new PriorityQueue<>();
		/*
		 * adding element method :add();,offer();
		 * retrieval-peak();
		 * removal-poll();,remove();
		 */
		pq.add(45);
		pq.offer(67);
		System.out.println(pq);
		System.out.println(pq.size());
//		System.out.println(pq.capacity());
	}

}
