package com.app.tests;

import com.app.helpers.GetData;

public class Test1 {

	public static void main(String[] args) {
		String propPath = "data/config.properties";
		String excelPath = GetData.fromProperties(propPath, "excelpath");
		String browserName = GetData.fromProperties(propPath, "browser");
		String url = GetData.fromProperties(propPath, "url");
		
		System.out.println(" excelPath :- "+ excelPath);
		System.out.println(" browserName :- "+ browserName);
		System.out.println(" url :- "+ url);
		System.out.println(" done ");

	}

}
