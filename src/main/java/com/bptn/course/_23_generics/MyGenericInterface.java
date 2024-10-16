package com.bptn.course._23_generics;

interface GenericInterface<T>{
	T getData();
}
class MyGenericImplementation<T> implements GenericInterface<T>{

	T data;
	
	MyGenericImplementation(T data){
		this.data = data;
	}
	@Override
	public T getData() {
		return this.data;
	}
	
}

public class MyGenericInterface {

	public static void main(String[] args) {
		
		GenericInterface<String> obj1 = new MyGenericImplementation<>("some string");
		System.out.println(obj1);
		
		GenericInterface<Integer> obj2 = new MyGenericImplementation<>(100);
		System.out.println(obj2);
		
	}

}
