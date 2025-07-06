package module1;

import java.util.Arrays;

public class Array {

	public static void main(String[] args) {

		int []arr=new int[3];
		arr[0]=45;
		arr[1]=56;
		arr[2]=96;
	System.out.println("arr : "+Arrays.toString(arr));
		
		int [] arr1=new int[3];
		arr1[0]=arr[0];
		arr1[1]=arr[1];
		arr1[2]=arr[2];
		
	int len=arr1.length;
		
		System.out.println("arr1 :"+Arrays.toString(arr1));
		
		String s3=Arrays.toString(arr1);
		
		String n1=s3.substring(1, 3);
		String n2=s3.substring(5, 7);
		String n3=s3.substring(9, 11);
		
		int a1=Integer.parseInt(n1);
		int a2=Integer.parseInt(n2);
		int a3=Integer.parseInt(n3);
		
		
		
		int avg=a1+a2+a3 / len;
		
		System.out.println(avg);
	}

}
