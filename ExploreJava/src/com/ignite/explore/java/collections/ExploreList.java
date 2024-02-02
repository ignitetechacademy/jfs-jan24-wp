package com.ignite.explore.java.collections;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ExploreList {

	public static void main(String[] args) {
		
		LinkedList ll;
		
		List marks = new ArrayList(); // 5 subjects marks
		marks.add(66);
		marks.add(77);
		marks.add(88);
		marks.add(95);
		marks.add(68);
		marks.add(88);
		marks.add(99);
		marks.add(55);
		
		
		System.out.println(marks.size());
		System.out.println(marks);

	}

}
