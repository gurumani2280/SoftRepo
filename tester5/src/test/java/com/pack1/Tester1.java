package com.pack1;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Tester1 {
	
	@Test(dataProvider="datas")
	 public void test(String data)
	 {
		 System.out.println("test");
		 System.out.println(data);
	 }
	
	
	 
	 @DataProvider(name="datas")
	 public Object[][] datas1()
	 {
		 return new String[][] {{"data1"}, 
			 				{"data2"}};
	 }
	 
	 
}
