package com.bptn.course._23_generics;

class RawType<T>{
	T data;

	RawType(T data) {
		super();
		this.data = data;
	}

	T getData() {
		return data;
	}

	void setData(T data) {
		this.data = data;
	}
	
}
public class MyRawType {

	public static void main(String[] args) {
		RawType<Integer> obj1 = new RawType<>(1);
		RawType obj2 = new RawType("hello");
		
		obj1 = obj2; //would give an error if obj2 was not a raw type achieving type safety
		System.out.println(obj1.getData());
		
		
	}

}
