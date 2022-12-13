package demoqa.projects.utilities;



import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;

public class ReadConfig {

	
	
	Properties properties;
	String Path = "/Users/mohanned/eclipse-workspace/demoqa.project/Configuration/config.properties";
	
	//Constructor
	public ReadConfig() {
		
		try {
		properties = new Properties();
		FileInputStream fis = new FileInputStream(Path);
		properties.load(fis);
		
		} 
		catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	
	
	public String getBaseUrl()
	{
		String value = properties.getProperty("baseUrl");
		if(value!=null)
			return value;
		else 
			throw new RuntimeException("URL not specified in config file.");
		
		
	}
	
	
	public String getbrowser()
	{
		
		String value = properties.getProperty("browser");
		if(value!=null)
		return value;
		else
			throw new RuntimeException("Browser value not specified in config file.");
	}
	
	public String getUserName()
	{
		String value = properties.getProperty("UserName");
		if(value!=null)
			return value;
		else 
			throw new RuntimeException("UserName not specified in config file.");
		
		
	}
	public String getPassWord()
	{
		String value = properties.getProperty("PassWord");
		if(value!=null)
			return value;
		else 
			throw new RuntimeException("PassWord not specified in config file.");
		
		
	}
	

	public String getBookName()
	{
		String value = properties.getProperty("bookName");
		if(value!=null)
			return value;
		else 
			throw new RuntimeException("Book Name not specified in config file.");
		
		
	}
	
	
	
}
