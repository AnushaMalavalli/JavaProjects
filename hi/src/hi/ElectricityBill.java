package hi;

public class ElectricityBill {

	public static void main(String[] args) {
		int previous_reading=150;
		int present_reading=55;
		int unit=previous_reading+present_reading;
		double elec_duty=7.75;
		double cust_charges=50.50;
		double total_unit=0;
		int scno=102547;
		String category;
		if(unit<=100)
		{
			category="Category_1A";
		}
		else if(unit>100&&unit<=200)
		{
			category="Category_1Bi";
		}
		else
		{
            category="Category_1Bii";		
		}
		switch(category) {
		case "Category_1A":
			if(unit<50)
			{
				total_unit=unit*1.45;
			}
			else
			{
			total_unit=50*1.45+(unit-50)*2.60;
			}
			break;
		case "Category_1Bi":
			total_unit=100*3.30+(unit-100)*4.30;
			break;
		case "Category_1Bii":
			total_unit=200*5;
			if(unit<=300)
			{
				total_unit+=(unit-200)*7.20;
			}
			else if(unit<=400)
			{
				total_unit+=(100)*7.20;
				total_unit+=(unit-300)*8.50;
			}
			else if(unit<=800)
			{
				total_unit+=(100)*7.20;
				total_unit+=(100)*8.50;
				total_unit+=(unit-400)*8.50;
			}
			else
			{
				total_unit+=(100)*7.20;
				total_unit+=(100)*8.50;
				total_unit+=(400)*8.50;
				total_unit+=(unit-800)*9.50;
				
			}
			break;
		}
		double net_bill=total_unit+elec_duty+cust_charges;
		System.out.println("total units:"+unit+"\n"+"Electricity_bill:"+total_unit+"\n"+"Category:"+category+"\n"+"seril_number:"+"\n"+scno);
	}

}