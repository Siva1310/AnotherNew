package org.test;

public class adcatin extends LibraryClass{
	
	public static void main(String[] args) {
		adcatin a = new adcatin();
	 
	 a.chromeBrowserConfig();
	 a.getUrl("https://adactinhotelapp.com/");
	 PojoClass p = new PojoClass();
	 a.inputText(p.getLogin(), "sivabala");
	 a.inputText(p.getPassWord(), "Shiva@123");
	 a.click(p.getLogin());
	 
	   
		
	}

}
