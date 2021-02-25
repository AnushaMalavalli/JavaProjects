package day8;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

public class WriteDataToFile {

	public static void main(String[] args) {
		File file= new File("C:\\CAPGFILE");
		try
		{
			System.out.println(file);
			FileOutputStream fos= new FileOutputStream(file+"\\sample");
			for(char c='A';c<='z';c++)
				fos.write(c);
			fos.close();
		} catch(IOException e) {
			e.printStackTrace();
		}
		System.out.println("success");
		
		

	}

}
