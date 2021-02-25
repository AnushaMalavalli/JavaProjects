package hi;

public class Greatest {

	public static void main(String[] args) {
		int arr[]= new int[5];
		for(int i=0;i<5;i++)
		{
			arr[i]=Integer.parseInt(args[i]);
		}
		int max=arr[0];
		int temp;
		for(int i=1;i<5;i++)
		{
			if(arr[i]>max)
			{
				temp=max;
				max=arr[i];
				arr[i]=temp;
			}
		}
		System.out.println("Greatest number is:"+max);

	}

}


