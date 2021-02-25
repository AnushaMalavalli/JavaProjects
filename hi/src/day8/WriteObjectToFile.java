package day8;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class WriteObjectToFile {

	public static void main(String[] args) throws IOException {
	
	try {
		FileOutputStream fos = new FileOutputStream ("C:\\CAPGFILE\\cardinfo.dat");
		ObjectOutputStream oos= new ObjectOutputStream(fos);
		CardDetails card1= new CardDetails(123456789L,"capg",10,20,234);
		CardDetails card2= new CardDetails(987654321L,"anu",20,10,432);
		oos.writeObject(card1);
		oos.writeObject(card2);
		oos.close();
		fos.close();
		System.out.println("created");
	} 
	catch (FileNotFoundException e) {
		e.printStackTrace();
	}


	}

}
