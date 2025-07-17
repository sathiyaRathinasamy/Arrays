package Frequency;

import java.util.*;

public class Frequencyofelement {

	public static void frequencyOfElement(int[] arr) {
		int n=arr.length;
		Set<Integer> s1=new TreeSet<>();
        for(int i:arr)
        {
        	s1.add(i);
        }
        for(int i:s1)
        {
        	int count=0;
        	for(int j:arr)
        	{
        		if(i==j)
        		{
        			count++;
        		}
        	}
        	System.out.println(i+"---->"+count);
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
		frequencyOfElement(arr);
	}
		
}
