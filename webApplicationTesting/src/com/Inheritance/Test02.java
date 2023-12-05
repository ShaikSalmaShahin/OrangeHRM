package com.Inheritance;

public class Test02 extends Test01{
	private void subtraction()
	{
		int var1=30;
		int var2=50;
		int var3;
		
		var3=var1-var2;
		System.out.println(" The value of the variable var3 after Subtraction is :- "+var3);
	}

	public static void main(String[] args) {
		 
		Test02 t2 = new Test02();
		System.out.println(" ****** Subtractin Method of Class Test02 ********");
		t2.subtraction();
		System.out.println();
	
		/*
		Test01 t001 = new Test01();
		System.out.println(" ****** Addition Method of Class Test01 ********");
		t001.addition();
		System.out.println();
		*/
		
			
		t2.subtraction();
		System.out.println(" ****** Subtractin Method of Class Test02 ********");
		System.out.println();
		
		t2.subtraction();
		System.out.println(" ****** Subtractin Method of Class Test02 ********");
		System.out.println();
		
		t2.addition();
		

}
}
