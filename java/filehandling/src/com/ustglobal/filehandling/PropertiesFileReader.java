package com.ustglobal.filehandling;

import java.io.FileReader;
import java.util.Properties;

public class PropertiesFileReader {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String path = "db.properties";
		FileReader reader = null;
		
		try {
			reader = new FileReader(path);
			Properties properties = new Properties();
			properties.load(reader);
			String url = properties.getProperty("url");
			String user = properties.getProperty("user");
			String password = properties.getProperty("password");
			
			System.out.println("url:"+url);
			System.out.println("user:"+user);
			System.out.println("password:"+password);
			
			
			
		}catch(Exception e) {
			e.printStackTrace();
		}
	}

}
