package com.UserDefinedMethods;

public class MethodExample2 {
	
public void addition()
{
	int var1=10;
	int var2=20;
	int var3;
	var3=var1+var2;
	System.out.println("The Result of Additon Operation of var1 and var2 is:-"+ var3);
}
public static void main(String[] args) {
	MethodExample2 m2= new MethodExample2();
	m2.addition();
	m2.subtraction();
}	
	
	public void subtraction()
	{
		int var1=50;
		int var2=30;
		int var3;
		var3=var1-var2;
		System.out.println("The Result of Subtraction Operation of var1 and var2 is :-"+ var3);
	}
	

}
