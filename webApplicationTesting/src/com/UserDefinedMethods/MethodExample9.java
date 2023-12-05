package com.UserDefinedMethods;

public class MethodExample9 {
	public void addition()
	
	{
	int var1=10;
	int var2=20;
	int var3;
	var3=var1+var2;
	System.out.println("The Result is :-"+ var3);
	}	
		
	//Method OverLoading
	//With Two Parameters
public void addition(int var1, int var2)
{
	int var3;
	var3=var1+var2;
	System.out.println("The Result is:-"+ var3);
}
//With Three Parameters

public void addition(int var1,int var2, int var3)
{
	var3=var1+var2;
	System.out.println("The Result is:-"+ var3);
}
//With Three Parameters but different DataTypes
public void addition(int var1, int var2, double var3)
{
	double var4;
	var4=var1+var2+var3;
	System.out.println("The Result is :-"+ var4);
}

public static void main(String[] args) {
	MethodExample9 m9 = new MethodExample9();
	m9.addition();
	System.out.println("The Result With Two Parameters is");
	m9.addition(20, 30);
	System.out.println("The Result With Three Parameters is");
	m9.addition(10, 40, 60);
	System.out.println("The Result With Three Parameters But Different DataTypes is ");
	m9.addition(30, 40, 50.234);
	
	
}



}
