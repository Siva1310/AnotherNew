package org.test;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class AdactinHotel extends LibraryClass {
	public static void main(String[] args) throws Exception {
		AdactinHotel hotel = new AdactinHotel();
		hotel.chromeBrowserConfig();
		hotel.getUrl("SIVABALA");
		hotel.maximizeWindow();
		WebElement id = hotel.locateById("username");
		hotel.inputText(id, "sivabala");
		WebElement id2 = hotel.locateById("password");
		hotel.inputText(id2, "Shiva@123");
		WebElement btnlogin = hotel.locateById("login");
		hotel.click(btnlogin);
		WebElement LOC = hotel.locateById("location");
		LOC.sendKeys(hotel.excelRead("data", 5, 0));
		WebElement hotels = hotel.locateById("hotels");
		hotels.sendKeys(hotel.excelRead("data", 5, 1));
		WebElement rt = hotel.locateById("room_type");
		rt.sendKeys(hotel.excelRead("data", 5, 2));
		WebElement rn = hotel.locateById("room_nos");
		rn.sendKeys(hotel.excelRead("data", 5, 3));
		WebElement datein = hotel.locateById("datepick_in");
		datein.sendKeys(hotel.excelRead("data", 5, 4));
		WebElement dateout = hotel.locateById("datepick_out");
		dateout.sendKeys(hotel.excelRead("data", 5, 5));
		WebElement adRoom = hotel.locateById("adult_room");
		adRoom.sendKeys(hotel.excelRead("data", 5, 6));
		WebElement chRoom = hotel.locateById("child_room");
		chRoom.sendKeys(hotel.excelRead("data", 5, 7));
		WebElement btn = hotel.locateById("Submit");
		btn.click();
		WebElement btnsubmit = hotel.locateById("radiobutton_0");
		btnsubmit.click();
		WebElement cont = hotel.locateById("continue");
		hotel.click(cont);












	}
}