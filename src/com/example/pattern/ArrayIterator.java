package com.example.pattern;

public class ArrayIterator implements Iterator {
	private Object[] arrays;
	private int index = 0;
	// ͨ�����캯��������������
	public ArrayIterator(Object[] arrays) {
		this.arrays = arrays;
	}

	public boolean hasNext() {
		if(index >= arrays.length){
			return false;
		}
		return true;
	}

	public Object next() {
		return arrays[index++];
	}

	public Object pre() {
		return arrays[index--];
	}

}
