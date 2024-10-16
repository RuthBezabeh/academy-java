package com.bptn.course._23_generics;

class GenericClass<T>{
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

class GenericDuoClass<S,U>{
	S data1;
	U data2;
	
	public GenericDuoClass(S data1, U data2) {
		this.data1 = data1;
		this.data2 = data2;
	}
	
	public S getData1() {
		return data1;
	}
	
	public void setData1(S data1) {
		this.data1 = data1;
	}
	
	public U getData2() {
		return data2;
	}
	
	public void setData2(U data2) {
		this.data2 = data2;
	}
	
	@Override
	public String toString() {
		return "GenericDuoClass [data1 = ]" + data1 + ", data2 = " + data2 + "]";
	}
	
}
public class MyGenericClass {

	public static void main(String[] args) {

		/*we can use the same class using generics eliminating
		 * the need for 3 different classes and type casting
		 */
		GenericClass <Integer> obj1 = new GenericClass<>();
		GenericClass <String> obj2 = new GenericClass<>();
		GenericClass <Long> obj3 = new GenericClass<>();
		
		GenericDuoClass<String,Integer> obj4 = new GenericDuoClass<>("Hello", 7);
		System.out.println(obj1);
		
		GenericDuoClass<Long,Boolean> obj5 = new GenericDuoClass<>(12L, true);
		System.out.println(obj5);
	}

}
