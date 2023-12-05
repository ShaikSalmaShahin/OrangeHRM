package com.Inheritance;

public class Test03 extends Test02 {
	protected void multiplication()
	{
		int var1=30;
		int var2=50;
		int var3;
		
		var3=var1*var2;
		System.out.println(" The value of the variable var3 after Multiplication is :- "+var3);
	}

	public static void main(String[] args) {
		
		Test03 t3 = new Test03();
		System.out.println(" ****** Multiplication Method of Class Test03 ********");
		t3.multiplication();
		System.out.println();
		
		t3.addition();
		System.out.println(" ****** Addition Method of Class Test01 ********");
		

}
}
