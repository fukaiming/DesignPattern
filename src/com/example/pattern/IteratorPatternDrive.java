package com.example.pattern;

public class IteratorPatternDrive {
	public static void main(String[] args) {
		String[] arrays = new String[]{"1","2","3","4","5"};
		Iterator iterator = new ArrayIterator(arrays);
		while(iterator.hasNext()){
			System.out.println(iterator.next());
		}
	}
}
