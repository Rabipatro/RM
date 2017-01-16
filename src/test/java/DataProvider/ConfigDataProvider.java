package DataProvider;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

public class ConfigDataProvider {

	public Properties pro;
	
	public ConfigDataProvider()
	{
		
		File file =new File ("./Configuration/config.properties");
		
		try {
			FileInputStream fis=new  FileInputStream(file);
			
			pro=new Properties();
		
				pro.load(fis);
			
			
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());
		}
	}
	public String getApplicationUrl()
	{
		String url=pro.getProperty("url");
		return url;
		
	}
	public String getchromepath()
	{
		String url=pro.getProperty("chromepath");
		return url;
		
	}
	public String getiepath()
	{
		String url=pro.getProperty("iepath");
		return url;
		
	}
	public String getfirefoxpath()
	{
		String url=pro.getProperty("firefoxpath");
		return url;
		
	}
	
}
