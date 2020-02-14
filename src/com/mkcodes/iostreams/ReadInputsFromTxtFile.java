package com.mkcodes.iostreams;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class ReadInputsFromTxtFile {

	public static void main(String[] args) {

		File file = new File("src/test.txt");

		try (FileInputStream fileInputStream = new FileInputStream(file)) {
			System.out.println("Total size to read (b): " + fileInputStream.available());

			int content;

			while ((content = fileInputStream.read()) != -1) {
				System.out.print((char) content);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
