package frameworkspractice;

import java.util.ArrayDeque;

public class arraydeque {

	public static void main(String[] args) {
		ArrayDeque<Integer>aq=new ArrayDeque<>();
		aq.add(7);
		aq.add(78);
		aq.addFirst(67);
		aq.addLast(56);
		aq.add(57);
		aq.poll();
		System.out.println(aq);
	}

}
