package com.bptn.course._23_generics;

class GenericClass2<T>{
	/*
	 * T stands for any reference Type 
	 */
	T data;

	public T getData() {
		return data;
	}

	public void setData(T data) {
		this.data = data;
	}
}

/*
 * a class that is not generic, does not have the generic types <>
 * it can have a generic method
 */
class MyGenericUtil{
	static<T> boolean compare(GenericClass2<T> obj1, GenericClass2<T> obj2) {
		T data1 = obj1.getData();
		T data2 = obj2.getData();
		
		//will return true if the data variables are the same
		return obj1.equals(obj2);
	}
	
}

public class MyGenericMethodClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
