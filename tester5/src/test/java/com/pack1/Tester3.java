package com.pack1;

import org.testng.annotations.Test;
import org.testng.xml.XmlTest;

public class Tester3 {
	
	@Test
	 public void test(XmlTest x)
	 {
		 System.out.println("test");
		 String param = x.getParameter("param1");
		 System.out.println(param);
	 }
	 

}
