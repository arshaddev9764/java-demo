package doubt_INTERVIEW_Array;

public class SmallEven {

	public static void main(String[] args) {

		int ar[] = {10,40,50,6,3,100,5,1,200};

		System.out.println("Even Number are :"); 
		for(int i=0;i<ar.length;i++)
		{
			if(ar[i]%2 ==0)
			{
				System.out.println(ar[i] +" ");
			}
		}
		int arr[] = {10,40,50,6,100,200};

		int temp = 0;
		for(int i=0;i<arr.length;i++)
		{
			for(int j=i+1;j<arr.length;j++)
			{
				if(arr[i] > arr[j])
				{
					temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
		System.out.println("The Smallest Even Number in the Array: "+ arr[0]);
	}
}

