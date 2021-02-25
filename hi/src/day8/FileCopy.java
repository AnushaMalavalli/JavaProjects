package day8;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileCopy {

	public static void main(String[] args) {
		File file = new File("C:\\CAPGFILE");
		try
		{
			FileInputStream fis= new FileInputStream("C:\\CAPGFILE\\sample");
			FileOutputStream fos= new FileOutputStream("C:\\CAPGFILE\\output.txt");
 
    	    int length;
    	    
    	    while ((length = fis.read())!=-1){
    	    	fos.write(length);
    	    }

    	    
    	   fis.close();
    	    fos.close();

    	    System.out.println("copied");
 
    	}catch(IOException e){
    		e.printStackTrace();
    	 }
    }
		
		

	}


