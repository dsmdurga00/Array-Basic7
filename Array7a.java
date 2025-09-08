package arrays;

public class Array7a {

	public static void bestPair(int[] arr, int target)
	{
		int sum;
		int count = 0;
		int start = 0;
		int end = arr.length-1;
		
		while(start<end)
		{
			sum = arr[start] + arr[end];
			if(sum==target)
			{
				++count;
				start++;
			    end--;
			}
			else if (sum>target) 
			{
			     end--;	
			}
			else
			{
			    start++;	
			}
		}
		System.out.println("The Number of Pair is: " + count);
		
	}
	
	public static void main(String[] args) {
		
		System.out.println("Program for Finding No. of Pair in Array thier sum equal to the target element:\n");
		
		int [] arr = {1,2,4,5,7,8,9,10};
		
		bestPair(arr, 9);
	}

}
