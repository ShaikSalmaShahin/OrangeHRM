package com.UserDefinedMethods;

public class MethodExample1 {

public void selenium()
{
	System.out.println("Automation is done for Regression Testing");
}
		
public static void main(String[] args) {
 	MethodExample1 m1= new MethodExample1();
 	m1.selenium();
 	m1.manual();
}
public void manual()
{
	System.out.println("Manual Testing is a Mandatory Process");
}

}
