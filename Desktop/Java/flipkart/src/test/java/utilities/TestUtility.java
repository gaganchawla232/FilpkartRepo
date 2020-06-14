package utilities;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class TestUtility {

	public static String browserActivity(String keyname) throws IOException
	{

		File file=new File(".\\ConfigFiles\\Configuration.properties");
		FileReader fr = new FileReader(file);
		Properties prop=new Properties();
		prop.load(fr);
        return	prop.getProperty(keyname).trim();
	}

	public static String elementLocator(String keyName) throws IOException {
	
	File file=new File(".\\ConfigFiles\\ObjectRepository.properties");
	FileReader fr=new FileReader(file);
	Properties prop=new Properties();
	prop.load(fr);
	return prop.getProperty(keyName);
}
}