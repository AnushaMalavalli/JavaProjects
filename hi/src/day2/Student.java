package day2;

public class Student {
	
	protected int regNo;
    protected String studentName;
    public Student(int regNo,String studentName){
   	 this.regNo=regNo;
   	 this.studentName=studentName;
    }
    public void display() {
   	 System.out.println(regNo+" "+studentName);
	}

	}
