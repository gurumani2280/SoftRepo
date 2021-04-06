package com.pack1;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Tester1a {
	
	
	@Test(dataProvider="datas2")
	 public void test1(String cloumn1, String cloumn2)
	 {
		 System.out.println("test");
		 System.out.println(cloumn1);
		 System.out.println(cloumn2);
	 }
	 
	@DataProvider(name="datas2")
	 public Object[][] datas2()
	 {
		 return new String[][] {{"data1", "column2"}, 
			 				{"data2", "cloumn2"},
			 				{"data3", "cloumn2"}};
	 }

}
