package org.test;

public class Facebook extends LibraryClass {
	public static void main(String[] args) {
		Facebook fb = new Facebook();
		fb.chromeBrowserConfig();
		fb.getUrl("https://www.facebook.com/");
		Login l = new Login();
	fb.inputText(l.getTxtemail(), "sivabalsai007@gmail.com");
	fb.inputText(l.getTxtpass(), "sivabala");
	fb.click(l.getTxtlogin());
}}
