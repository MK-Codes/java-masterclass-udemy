package com.mkcodes.iostreams;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class WriteToFile {

	public static void main(String[] args) {
		File file = new File("src/MyFile.txt");

		try (FileWriter fileWriter = new FileWriter(file)) {
			fileWriter.write("This is amüsing");
			fileWriter.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}