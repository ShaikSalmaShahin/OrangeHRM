package com.ARRAYS;

public class ObjectArrayExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Object array1[]=new Object[4];

array1[0]=20;
array1[1]="webdriver";
array1[2]='A';
array1[3]=10.7543;

for(int index=0;index<array1.length;index++)
{
	System.out.println(array1[index]);
}
System.out.println("******for each loop*****");

for(Object arrayindex:array1)
{
	System.out.println(arrayindex);
}
	}

}
