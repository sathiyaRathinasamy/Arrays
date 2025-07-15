package Frequency;

import java.util.Scanner;

public class Frequencyofelement {

	public static int[] Frequencyofelement(int[] arr) {
		int n=arr.length;
		int i,j,count;
		for(i=0;i<n;i++)
		{
			count=0;
			for(j=0;j<n;j++)
			{
				if(arr[i]==arr[j])
				{
					count++;
				
					
				}
			}
			return(arr[i]+"-->"+count);
		}
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
		Frequencyofelement(arr);
		

	}

}
