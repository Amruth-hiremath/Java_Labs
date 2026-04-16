package part_b;

import java.util.LinkedList;

public class lab7_b {

	public static void main(String[] args) {
		LinkedList<String> list = new LinkedList<>();

		list.addFirst("First Element");

		list.addLast("Last Element");

		list.add(1, "Middle Element");

		System.out.println("Current Linked List: " + list);
	}

}
