package com.UserDefinedMethods;

public class MethodExample8 {
	int var1=40;
	int var2=20;
	
	public void addition()
	{
		int var1=20;
		int var2=10;
		int var3;
		var3=var1+var2;
		System.out.println("The Result of Addition Operation is:-"+ var3);
	}
	
	public void subtraction() {
		int var3;
		var3=var1-var2;
		System.out.println("The Result of Subtraction Operation is:-"+ var3);
	}
	
public static void main(String[] args) {
	MethodExample8 m8= new MethodExample8();
	m8.addition();
	m8.subtraction();
}
}
