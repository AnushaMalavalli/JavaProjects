package day2;

public class Placements extends StudentExam{

		
	protected int attended;
	protected String selected;
	public Placements(int attended,String selected)
	{   super(70,70,70);
		this.attended=attended;
		this.selected=selected;
	}
	public void dispPlacement() {
		char grade;
		double aggregate=total/3;
		if(aggregate>80)
		{
			grade='A';
		}
		else if(aggregate>60&&aggregate<=80)
		{
			grade='B';
		}
		else
		{
			grade='C';
		}
		System.out.println(regNo+" "+studentName+" "+attended+" "+selected+" "+aggregate+" "+grade);
	}


	public static void main(String[] args) {
		Placements S2=new Placements(10,"yes");
        S2.dispPlacement();

	}

}
