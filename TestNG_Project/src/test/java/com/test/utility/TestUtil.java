package com.test.utility;

import java.util.ArrayList;

import com.excel.utility.Xls_Reader;



public class TestUtil {
	static Xls_Reader reader;
	
	public static ArrayList<Object[]> getdatafromExcel() {
		ArrayList<Object[]> data = new ArrayList<Object[]>();
	//	System.getProperty();
		try {
			reader = new Xls_Reader("C:\\Users\\sayali.sunil.kankate\\eclipse-workspace\\TestNG_Project\\src\\test\\java\\com\\testdata\\Form.xlsx");
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		
		for( int rowNum= 2; rowNum<=reader.getRowCount("Sheet1"); rowNum++ ) {
			String firstName = reader.getCellData("Sheet1", "firstname", rowNum);
			String lastname = reader.getCellData("Sheet1", "lastname", rowNum);
			String jobtitle = reader.getCellData("Sheet1", "jobtitle", rowNum);
			String date = reader.getCellData("Sheet1", "date", rowNum);
			
			Object ob[] = {firstName,lastname,jobtitle, date};
			data.add(ob);						
		}
		
		return data;
	}

}
