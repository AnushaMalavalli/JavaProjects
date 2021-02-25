package day8;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class VowelsCons {

	public static void main(String[] args) {
		File file = new File("C:\\CAPGFILE");
		
		try
		{
			FileInputStream fis= new FileInputStream("C:\\CAPGFILE\\sample");
			int c;
			int v=0;
			int consonants=0;
			while((c=fis.read())!=-1)
			{
				
				if((char)c=='a'||(char)c=='e'||(char)c=='i'||(char)c=='o'||(char)c=='u'||(char)c=='A'||(char)c=='E'||(char)c=='I'||(char)c=='O'||(char)c=='U')
				{
					v++;
				}
				else 
				{
					consonants++;
				}
			}
			System.out.println("numer of vowels="+v+"number of consonants+"+consonants);
			fis.close();
			
		} 
		catch(IOException e) {
			e.printStackTrace();
		}

	}

}
