package factory;

import DataProvider.ConfigDataProvider;
import DataProvider.ExcelDataProvider;

public class DataProviderFactory {
	
	public static ConfigDataProvider getDataConfig()
	{
		ConfigDataProvider config =new ConfigDataProvider();
		return config;
	}
	
	public static ExcelDataProvider getExcelConfig()
	{
		ExcelDataProvider excel =new ExcelDataProvider();
		return excel;
	}


}
