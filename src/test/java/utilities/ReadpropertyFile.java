package utilities;

import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class ReadpropertyFile {

	public static void main(String[] args) throws IOException {
		
		FileReader fr = new FileReader("F:\\Software installed\\PracticeProjects\\seleniumstructure\\structureframework\\src\\test\\resources\\configfiles\\Config.properties");
		Properties p = new Properties();
		p.load(fr);
		
		System.out.println(p.getProperty("browser"));
		System.out.println(p.getProperty("testURL"));
	}

}
