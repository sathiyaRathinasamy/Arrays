package Reversearray;

import java.util.Arrays;
import java.util.Scanner;

public class Reversearray {

	public static int[] reversearray(int[] arr) {
		int n=arr.length;
		int reverse[]=new int[n];
		int i,j=0;
		for(i=n-1;i>=0;i--)
		{
			reverse[j]=arr[i];
			j++;
		}
		return reverse;
		
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
		int reverse[]=reversearray(arr);
		System.out.print(Arrays.toString(reverse));
	
	}

}
