package day2;

public class StudentExam extends Student
{
	
	
	private int sub1;
	private int sub2;
	private int sub3;
	protected int total;
	public StudentExam(int sub1,int sub2,int sub3) {
		super(11,"Capgemini");
		this.sub1=sub1;
		this.sub2=sub2;
		this.sub3=sub3;
		this.total=sub1+sub2+sub3;
		
	}
	public void displayResult() {
		System.out.println(regNo+" "+studentName+" "+total);
	}
	public void displaydisp()
	{
		System.out.println("from sub class");
	}

	public static void main(String[] args) {
		StudentExam S1=new StudentExam(10,20,30);
		S1.displaydisp();
        S1.displayResult();
        S1.display();
        
        Student stud=new Student(123,"capg");
        stud.display();
        stud=S1;
        stud.display();
        

	}

}
