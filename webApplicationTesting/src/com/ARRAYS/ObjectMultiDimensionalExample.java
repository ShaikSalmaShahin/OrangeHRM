package com.ARRAYS;

public class ObjectMultiDimensionalExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Object array1[][]=new Object[2][2];
array1[0][0]="salma";
array1[0][1]='S';
array1[1][0]=10;
array1[1][1]=73.87457;
for(int index=0;index<array1.length;index++)
{
	for(int cellindex=0;cellindex<array1.length;cellindex++)
		
	{
		System.out.println(array1[index][cellindex]);
	}
}


}

}
