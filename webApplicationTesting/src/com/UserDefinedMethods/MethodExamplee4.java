package com.UserDefinedMethods;

public class MethodExamplee4 {
	
private void multiplication()
{

int var1=30;
int var2=10;
int var3;
var3=var1/var2;
System.out.println("The Result of Multiplication Operation of var1 and var2 is :-"+var3);
    	
}

public static void main(String[] args) {
	MethodExample2 m2 = new MethodExample2();
	m2.addition();//public
	m2.subtraction();//public
	MethodExample3 m3 = new MethodExample3();
	m3.division();//public and private cannot be accessed of m3.multiplication
			
	MethodExamplee4 m4=new MethodExamplee4();
	m4.multiplication();
}

}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

