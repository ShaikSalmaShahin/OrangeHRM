package com.UserDefinedMethods;

public class MethodExample11 {
	protected void division()
	{
		try
		{
			int var1=30;
			int var2=0;
			int var3;
			var3=var1/var2;
			System.out.println("The Result of division Operation of var1 and var2 is :-"+var3);
			    	
		}
		catch(Exception divisionException)
		{
			System.out.println("The Exception is:-"+divisionException);
		}
		
	}
public static void main(String[] args) {
	MethodExample11 m11 = new MethodExample11();
	m11.division();
	
}
}
