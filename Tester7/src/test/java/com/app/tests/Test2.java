package com.app.tests;

import com.app.helpers.GetData;


public class Test2 {
	
	public static void main(String[] args) {
		String excelPath = "data/data.xlsx";
		String user =GetData.fromExcel("data/data.xlsx", "Login", 1, 0);
		
		String pwd =GetData.fromExcel(excelPath, "Login", 1, 1);
		System.out.println("user :- "+ user);
		System.out.println("pwd :- "+ pwd);
	}

}
