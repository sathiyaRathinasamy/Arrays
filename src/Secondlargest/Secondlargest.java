package Secondlargest;

import java.util.Scanner;

public class Secondlargest {

	public static int secondlargest(int[] arr) {
	    int n=arr.length;
	    int first=Integer.MIN_VALUE,second=Integer.MIN_VALUE,i;
	    if(n<2)
	    {
	    	System.out.println("There is just one element in array");
	    }
	    for(i=0;i<n;i++)
	    {
	    	if(arr[i]>first)
	    	{
	    		second=first;
	    		first=arr[i];
	    	}
	    	else if(arr[i]>second||arr[i]!=first)
	    	{
	    		second=arr[i];
	    	}
	    	else
	    	{
	    		continue;
	    	}
	    }
	    if(second==Integer.MIN_VALUE)
	    {
	    	System.out.println("All elements in the array are equal , There is no second largest");
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
		int l=secondlargest(arr);
		System.out.print(l);

	}

}
