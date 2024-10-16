package com.bptn.course._23_generics;

class BoundedGenericClass<T extends Number>{
	T data;

	BoundedGenericClass(T data) {
		this.data = data;
	}

	T getData() {
		return data;
	}

	void setData(T data) {
		this.data = data;
	}
	
	@Override
	public String toString() {
		return "BoundedGenericClass [data = " + data + "]";
	}
	
}

public class BoundedGenericExample {

	public static void main(String[] args) {
		BoundedGenericClass<Integer> obj1 = new BoundedGenericClass<>(20);
		System.out.println(obj1);

//		//passes if the type is not bounded nut if it's bounded <T extends Superclass>
//		// t can only be a type of one of the subclassed of the declared superclass
//		BoundedGenericClass<String> obj2 = new BoundedGenericClass<>("hello");
//		System.out.println(obj2);
		
		BoundedGenericClass<Double> obj3 = new BoundedGenericClass<>(12.5);
		System.out.println(obj3);
	}

}
