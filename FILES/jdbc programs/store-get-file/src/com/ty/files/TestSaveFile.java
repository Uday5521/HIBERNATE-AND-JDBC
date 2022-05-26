package com.ty.files;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class TestSaveFile {
	public static void main(String[] args) {
		
		FileDao dao = new FileDao();
		
		File file = new File("C:/vikas/batch6/globe.jpg");
		FileInputStream fileInputStream;
		try {
			fileInputStream = new FileInputStream(file);
			dao.saveFile(1, "Dimple", "globe.jpg",fileInputStream);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		
System.out.println("Done");		
		
		
		
	}
}
