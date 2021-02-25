package day8;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class ReadDataFromFile {

	public static void main(String[] args) {
		File file= new File("C:\\CAPGFILE");
		try {
			FileInputStream fis= new FileInputStream(file+"\\sample");
			int c;
			while((c=fis.read())!=-1)
				System.out.println((char)c);
			fis.close();
		}catch (IOException e) {
			e.printStackTrace();
		}

	}

}
