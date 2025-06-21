package Utilities;

import java.io.IOException;

import org.testng.annotations.DataProvider;

public class DataProviders {

	
	@DataProvider(name="LoginData") 
	public String [][] getData() throws IOException
	{
		
	String path=".\\testData\\ParaBank_LogIn.xlsx";//taking xl file fro
	ExcelUtility xlutil=new ExcelUtility(path);//creating an object for XLU
	
	int totalrows=xlutil.getRowCount("Sheet1"); 
	int totalcols=xlutil.getCellcount("Sheet1",1);
	
	String logindata[][]=new String[totalrows][totalcols];//created for two
	for(int i=1;i<=totalrows;i++)
	{
		for(int j=0;j<totalcols;j++) 
		{
	        logindata[i-1][j]= xlutil.getCellData("Sheet1",i, j);
		}
	}
	return logindata;
	}
	
	
	
}
