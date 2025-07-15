package smallarray;

import java.util.Scanner;

public class small {

	public static int Small(int[] arr) {
		int a=arr[0];
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]<a)
			{
				a=arr[i];
			}
		}
		return a;
		
		
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number of values");
		int n=sc.nextInt();
		int[] arr=new int[n];
		for(int i=0;i<n;i++)
		{
			arr[i]=sc.nextInt();
		}
		int smallest=Small(arr);
		System.out.println(smallest);

	}

}
