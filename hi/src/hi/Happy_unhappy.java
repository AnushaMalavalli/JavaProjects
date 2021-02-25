package hi;

public class Happy_unhappy {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sum=0;
		int j;
		int num=Integer.parseInt(args[0]);
		while(sum!=1&&sum!=4)
		  { sum=0;
		    while(num>0)
		    {
			j=num%10;
			sum+=(j*j);
		   num=num/10;
		    }
		   
		   num=sum;
		  }
        if(sum==1)
        {
        	System.out.println("Happy Number");
        }
        else
        {
        	System.out.println("Unhappy Number");
        }
	}

}
