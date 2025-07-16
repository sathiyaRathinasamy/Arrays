package Secondsmallest;

import java.util.Scanner;

public class Secondsmallest {

	public static int secondsmallest(int[] arr) {
		
		int n=arr.length;
		int first=Integer.MAX_VALUE,second=Integer.MAX_VALUE,i;
		for(i=0;i<n;i++)
		{
			if(arr[i]<first)
			{
				second=first;
				first=arr[i];
			}
			else if(arr[i]<second&&arr[i]!=first)
			{
				second=arr[i];
			}
			else
			{
			
				continue;
			}
		}
		if(second==Integer.MAX_VALUE)
		{
			System.out.println("All elements in the array are equal, There is no second smallest");
			return 0;
		}
		return second;
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
		if(n<2)
		{
			System.out.println("Array contains only one element");
			return;
		}
		int smallest=secondsmallest(arr);
		System.out.print(smallest);

	}

}
