package day2;

public class Library extends Student {

	protected int booksdue;
	public Library(int booksdue) {
		super(1010,"Suresh");
		this.booksdue=booksdue;
	}
	void dispLib() {
		System.out.println(regNo+" "+studentName+" "+booksdue);
	}
	

	public static void main(String[] args) {
		Library S3=new Library(3);
		S3.dispLib();
		
	}

}
