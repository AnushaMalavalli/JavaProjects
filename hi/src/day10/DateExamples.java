package day10;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Date;

public class DateExamples {

	public static void main(String[] args) throws ParseException {
		Date dt= new Date();
		System.out.println("current date"+dt);
		
		
		String dob="01-06-1999";
		SimpleDateFormat sdf= new SimpleDateFormat("dd-mm-yyyy");
		Date dt1= sdf.parse(dob);
		System.out.println("dob"+dob);
		
		String str= "2020-11-05";
		LocalDate strdate= LocalDate.parse(str);
		System.out.println(strdate);
		System.out.println("dob"+dob);
				

	}

}
