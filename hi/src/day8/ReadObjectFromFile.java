package day8;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class ReadObjectFromFile {

	public static void main(String[] args) {
		try {
		FileInputStream fis= new FileInputStream("C:\\CAPGFILE\\cardinfo.dat");
		ObjectInputStream ois= new ObjectInputStream(fis);
		Object obj;
		while((obj=ois.readObject())!=null)   //use null for object
		{
			CardDetails card=(CardDetails) obj;
			System.out.println(card.getCardno()+" "+card.getName()+" "+card.getExpmon()+" "+
			card.getCvv()+" "+card.getExpyear());
		}
		ois.close();
		fis.close();

	} 
		catch(IOException | ClassNotFoundException e) {
		
	}

}
}