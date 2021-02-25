package day8;

import java.io.File;

public class FileEx {

	public static void main(String[] args) {
		File file= new File("C:\\CAPGFILE");
		file.mkdir();
		System.out.println("created");

	}

}
