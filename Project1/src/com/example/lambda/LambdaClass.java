package com.example.lambda;

public class LambdaClass {
	public static void main(String[] args) {
		PrintSomething((s)->{
			System.out.println("Meow " + s);
			return s;
		});
		
		PrintSomething((s)-> "meow" + s);
		
//		Cat myCat = s-> System.out.println("Meow" + s);
//		PrintSomething(myCat);
	}
	


	public static void PrintSomething(Cat cat) {
		cat.method1("!");
	}
}
