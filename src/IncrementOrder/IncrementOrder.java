package IncrementOrder;
import java.util.*;

public class IncrementOrder {

	public static int[] incrementOrder(int[] arr) {
		int n=arr.length;
		int i,j;
		for(i=0;i<n;i++) {
			for(j=0;j<n;j++)
			{
				if(arr[i]<arr[j])
				{
					int temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
		}
		return arr;
		
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int[] arr=new int[n];
		for(int i=0;i<n;i++)
		{
			arr[i]=sc.nextInt();
		}
		int result[]=incrementOrder(arr);
		System.out.print(Arrays.toString(result));

	}

}
