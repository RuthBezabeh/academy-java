package com.bptn.course._23_generics;

import java.util.ArrayList;

class ClassA{
	Integer data;

	public Integer getData() {
		return data;
	}

	public void setData(Integer data) {
		this.data = data;
	}
}

class ClassB{
	String data;

	public String getData() {
		return data;
	}

	public void setData(String data) {
		this.data = data;
	}
}

class ClassC{
	Long data;

	public Long getData() {
		return data;
	}

	public void setData(Long data) {
		this.data = data;
	}
}

public class MyClass {

	public static void main(String[] args) {
		ArrayList list = new ArrayList(); //has no type safety
		list.add("Hello");
		list.add(42); // stored string and int in the same array
		
		String str = (String) list.get(1); // will throw a classcastexception
		
		System.out.println(list);
		System.out.println(str);
		
		ArrayList<String> list1 = new ArrayList<>();
		
	}

}