package com.ignite.explore.java.collections;

import java.util.ArrayList;
import java.util.List;

public class CollectionsWithGenerics {

	public static void main(String[] args) {
		
		List<Integer> marks = new ArrayList(); 
		marks.add(66);
		marks.add(77);
		marks.add(88);
		marks.add(98);
		marks.add(68);
		marks.add(66);
		marks.add(93);
		marks.add(55);
		
		int totalMarks = 0;
		for (Object eachMark : marks) {
			totalMarks = totalMarks + ((int)eachMark) ;
		}
		System.out.println(marks);
		System.out.println(totalMarks);
		System.out.println(totalMarks / marks.size());

	}

}
