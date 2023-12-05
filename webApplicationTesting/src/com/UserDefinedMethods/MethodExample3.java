package com.UserDefinedMethods;

public class MethodExample3 {
	
private void multiplication()
{
	int var1=30;
	int var2=40;
	int var3;
	var3=var1*var2;
	System.out.println("The Result of Multiplication Operation of var1 and var2 is:-"+ var3);
}
public static void main(String[] args) {
	MethodExample3 m3 = new MethodExample3();
	m3.multiplication();
	m3.division();
}	
	
public void division()
{
	int var1=40;
	int var2=20;
	int var3;
	var3= var1/var2;
	System.out.println("The Result of Division Operation of var1 and var2 is :-"+ var3);
}
	
	
	

}
