package com.ARRAYS;

public class MultiDimensionalArrayExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String array1[][]=new String[2][2];
		array1[0][0]="manual testing";
		array1[0][1]="venkat sir";
		array1[1][0]="selenium";
		array1[1][1]="srini sir";
		
		for(int rowofindex=0;rowofindex<=1;rowofindex++)
		{
			for(int rowofcellsindex=0;rowofcellsindex<=1;rowofcellsindex++)
			{
				System.out.print(array1[rowofindex][rowofcellsindex]);
			}
			System.out.println();
		}
		
		for(int rowofindex=0;rowofindex<array1.length;rowofindex++)
		{
			for(int rowofcellsindex=0;rowofcellsindex<array1.length;rowofcellsindex++)
			{
				System.out.println(array1[rowofindex][rowofcellsindex]);
			}
		}
	}

}
