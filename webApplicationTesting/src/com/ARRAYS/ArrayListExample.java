package com.ARRAYS;

import java.util.ArrayList;
import java.util.List;

public class ArrayListExample {

	public static void main(String[] args) {
		// TODO Auto-generated 
List<Object>arraylist1=new ArrayList<>();

arraylist1.add(10);
arraylist1.add("salma");
arraylist1.add('A');
arraylist1.add(88.13847);
System.out.println(arraylist1);
System.out.println(arraylist1.get(0));
System.out.println(arraylist1.get(1));
System.out.println(arraylist1.get(2));
System.out.println(arraylist1.get(3));

for(int index=0;index<arraylist1.size(); index++)
{
	System.out.println(arraylist1.get(index));
}


	}

}
