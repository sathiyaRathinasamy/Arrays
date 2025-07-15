package Largearray;

import java.util.Scanner;

public class Largest {

	public static int largest(int[] arr) {
		int i,large=arr[0];
		for(i=0;i<arr.length;i++)
		{
			if(arr[i]>large)
			{
				large=arr[i];
			}
		}
		return large;
		
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int arr[]=new int[n];
		int i;
		for(i=0;i<n;i++)
		{
			arr[i]=sc.nextInt();
		}
		int l=largest(arr);
		System.out.print(l);

	}

}
