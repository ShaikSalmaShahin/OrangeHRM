package com.Inheritance;

public class Test04 extends Test03 {
	void division()
	{
		int var1=30;
		int var2=5;
		int var3;
		
		var3=var1/var2;
		System.out.println(" The value of the variable var3 after Division is :- "+var3);
	}


 public static void main(String[] args) {
	
	 Test04 t4 = new Test04();
	 t4.division();
	 System.out.println(" ****** Division Method of Class Test04 ********");
	 System.out.println();
	 
	 t4.multiplication();
	 System.out.println(" ****** Multiplication Method of Class Test03 ********");
	 System.out.println();
	 
	 System.out.println(" Subtraction is a Private Method and cannot be Accessed in the Current Class");
	 System.out.println(" ****** Subtraction Method of Class Test02 ********");
	 System.out.println();
	 
	 t4.addition();
	 System.out.println(" ****** Addition Method of Class Test01 ********");
	 
}

}
