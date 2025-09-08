package arrays;

public class Array7 {
	
	public static void pair(int[] arr, int target)
	{
		int count = 0;
		int sum;
		for (int i =0; i<arr.length-1; i++)
		{
			for(int j=i+1; j<arr.length; j++)
			{
				sum = arr[i] + arr[j];
				if(sum==target)
				{
					++count;
				}
			}
		}
		
		System.out.println("Result is :" + count);
	}

	public static void main(String[] args) {
		
		System.out.println("Program for Finding No. of Pair in Array thier sum equal to the target element: \n");
		
		int[] arr = {1,2,3,4,5};
		
		pair(arr, 6);
	}

}
