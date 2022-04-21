package org.test;


		import java.io.File;
		import java.io.FileInputStream;
		import java.io.FileNotFoundException;
		import java.io.FileOutputStream;
		import java.io.IOException;
		import java.math.BigDecimal;
		import java.text.SimpleDateFormat;
		import java.util.Date;

		import org.apache.poi.ss.usermodel.Cell;
		import org.apache.poi.ss.usermodel.CellType;
		import org.apache.poi.ss.usermodel.DateUtil;
		import org.apache.poi.ss.usermodel.Row;
		import org.apache.poi.ss.usermodel.Sheet;
		import org.apache.poi.ss.usermodel.Workbook;
		import org.apache.poi.xssf.usermodel.XSSFWorkbook;
		import org.openqa.selenium.Alert;
		import org.openqa.selenium.By;
		import org.openqa.selenium.JavascriptExecutor;
		import org.openqa.selenium.WebDriver;
		import org.openqa.selenium.WebElement;
		import org.openqa.selenium.chrome.ChromeDriver;
		import org.openqa.selenium.interactions.Actions;
		import org.openqa.selenium.support.ui.Select;

		import io.github.bonigarcia.wdm.WebDriverManager;
		public class LibraryClass {
			WebDriver driver;
		public void chromeBrowserConfig() {
			WebDriverManager.chromedriver().setup();	
			driver=new ChromeDriver(); 
		}


		public void getUrl(String url) {
			driver.get(url);
		}

		public void maximizeWindow() {
			driver.manage().window().maximize();
		}

		public void minimizeWindow() {
			driver.manage().window().minimize();
		}

		public void navigate(String url) {
		driver.navigate().to(url);
		}

		public void navigateForward() {
			driver.navigate().forward();
		}

		public void navigateBack() {
			driver.navigate().back();
		}

		public void refresh() {
			driver.navigate().refresh();
		}

			
		public WebElement locateById(String id) {
			WebElement findElement = driver.findElement(By.id(id));
			return findElement;
		}

		public void inputText(WebElement element, String value ) {
			element.sendKeys(value);
		}	

		public WebElement LocateByName(String name) {
			WebElement findElement = driver.findElement(By.name(name));
			return findElement;
		}

		public void click(WebElement element) {
			element.click();  

		}

		public void getTitle() {

		driver.getTitle();
		}

		public void getCurrentUrl() {
		driver.getCurrentUrl();
		}

		public void close() {
			driver.close();
		}

		public void quit() {
				driver.quit();
			}
		public WebElement locateByClassName(String className) {
			WebElement findElement = driver.findElement(By.className(className));
			return findElement;
		}

		public WebElement locateByXpath(String xpathExpression) {
			WebElement findElement = driver.findElement(By.xpath(xpathExpression));
			return findElement;
		} 

		public String getText(WebElement element) {
			String text = element.getText();
			return text;
		}

		public String getAttribute(WebElement element) {
			String attribute = element.getAttribute("value");
			return attribute;
		} 

		public void print(String text) {
		System.out.println(text);
		}



		public void moveToElement(WebElement target) {
			Actions action = new Actions(driver);
				action.moveToElement(target).perform();
			}

		public void dragAndDrop(WebElement source, WebElement target) {
			Actions action = new Actions(driver);
			action.dragAndDrop(source, target).perform();
		}

		public void rightClick(WebElement target) {
			Actions action = new Actions(driver);
			action.contextClick(target).perform();
		}

		public void doubleClick(WebElement target) {
			Actions action = new Actions(driver);
			action.doubleClick(target).perform();
		} 


		public void alertAccept() {
			Alert al = driver.switchTo().alert();
			al.accept();
		}

		public void alertDismiss() {
			Alert al = driver.switchTo().alert();
			al.dismiss();
		}

		public void inputTextInAlertBox(String keysToSend) {
			Alert al = driver.switchTo().alert();
			al.sendKeys(keysToSend);
		}

		public String getTextFromAlertBox() {
			Alert al = driver.switchTo().alert();
			String text = al.getText();
			return text;
		}

		public void SelectoOptionsByText(WebElement element,String Data) {
		Select select = new Select(element);
		select.selectByVisibleText(Data);
		}

		public void SelectOptionsByIndex(WebElement element,int index) {
		Select select = new Select(element);
		select.selectByIndex(index);
		}
		public void SelectOptionsByAttribute(WebElement element,String AttributeName) {
		Select select = new Select(element);
		select.selectByValue(AttributeName);
		}

		public void TypeTextJS(WebElement element,String Data) {
		JavascriptExecutor executor = (JavascriptExecutor)driver;
		executor.executeScript("arguments[0].SetAttribute('value','"+Data+"')", element);
		}




		public void SwitchToFrameByIndex(int index) {
		driver.switchTo().frame(index);
		}

		public void SwitchToFrameById(String id) {
		driver.switchTo().frame(id);
		}
		public void SwitchToFrameByName(String name) {
		driver.switchTo().frame(name);
		}

		public void SwitchToFrameByWebElement(WebElement element ) {
		driver.switchTo().frame(element);
		}

		public void GetDefaultWindowinFrames() {
		driver.switchTo().defaultContent();
		}

		public boolean IsDisplayed(WebElement element) {
		boolean displayed = element.isDisplayed();
		return displayed;
		}
		public boolean IsSelected(WebElement element) {
		boolean enabled = element.isEnabled();
		return enabled;
		}
		public boolean IsEnabled(WebElement element) {
		boolean enabled = element.isEnabled();
		return enabled;
		}


		public boolean IsMultiple(WebElement element) {
		Select s = new Select(element);
		boolean multiple = s.isMultiple();
		return multiple;
		}

		public void selectByIndex(WebElement element, int index) {
			Select select = new Select(element);
			select.selectByIndex(index);
		}
		public void selectByValue(WebElement element, String data) {
			Select select = new Select(element);
			select.selectByValue(data);
		}

		public void selectByVisibleText(WebElement element, String data) {
			Select select = new Select(element);
			select.selectByVisibleText(data);
		}



		public void DeSelectByIndex(WebElement element, int index) {
		Select select = new Select(element);
		select.deselectByIndex(index);
		}
		public void DeselectByValue(WebElement element, String data) {
		Select select = new Select(element);
		select.deselectByValue(data);
		}
		public void DeSelectByVisibleText(WebElement element, String data) {
		Select select = new Select(element);
		select.deselectByVisibleText(data);
		}
		public void DeSelectAll(WebElement element) {
		Select select = new Select(element);
		select.deselectAll();
		}


		public int Length(String s) {
		int length = s.length();
		return length;
		}
		public boolean Equals(String s1, String s2) {
		boolean equals = s1.equals(s2);
		return equals;
		}
		public boolean EqualIgnoreCase(String s1, String s2) {
		boolean equalsIgnoreCase = s1.equalsIgnoreCase(s2);
		return equalsIgnoreCase;
		}
		public boolean Contains(String s1,String s2) {
		boolean contains = s1.contains(s2);
		return contains;
		}
		public boolean StartsWith(String s1,String s2) {
		boolean startsWith = s1.startsWith(s2);
		return startsWith;
		}
		public boolean EndsWith(String s1, String s2) {
		boolean endsWith = s1.endsWith(s2);
		return endsWith;
		}
		public boolean IsEmpty(String s) {
		boolean empty = s.isEmpty();
		return empty;
		}
		public boolean CreateFolder(File F) {
		boolean b = F.mkdir();
		return b;
		}
		public boolean CreateFolders(File F) {
		boolean b = F.mkdirs();
		return b;
		}
		public boolean CreateFile(File F)throws IOException{
		boolean newFile = F.createNewFile();
		return newFile;
		}
		public boolean CanRead(File F) {
		boolean read = F.canRead();
		return read;
		}
		public boolean CanWrite(File F){
		boolean write = F.canWrite();
		return write;
		}
		public boolean CanExecute(File F) {
		boolean execute = F.canExecute();
		return execute;
		}
		public boolean Exist(File F) {
		boolean exists = F.exists();
		return exists;
		}

		public String excelRead(String sheet, int row, int cell) throws IOException {
			String value=null;
			File f = new File("C:\\Users\\VC\\eclipse-workspace\\AdactinHotel\\target\\Book4.xlsx");
			FileInputStream fin = new FileInputStream(f);
			Workbook w = new XSSFWorkbook(fin);
			Sheet s = w.getSheet(sheet);
			Row r = s.getRow(row);
			Cell c = r.getCell(cell);
			CellType type = c.getCellType();
			
			switch (type) {
			case STRING:
				value = c.getStringCellValue();
				System.out.println(value);
				break;

			case NUMERIC:
				if (DateUtil.isCellDateFormatted(c) ) {
					Date d = c.getDateCellValue();
					
					SimpleDateFormat df= new SimpleDateFormat("dd-mm-yyyy");
					value = df.format(d);
					System.out.println(value);
				}
				else {
					double dou = c.getNumericCellValue();
					BigDecimal bd = BigDecimal.valueOf(dou);
					value = bd.toString();
					System.out.println(value);
				}
				break;

			default:
				break;
			}
			return value;
		}



		public void excelWrite(String path, String sheet, int row, int cell, String value) throws IOException {
			File f = new File(path); 
			FileInputStream fin = new FileInputStream(f);
			Workbook w = new XSSFWorkbook(fin);
			Sheet s = w.getSheet(sheet);
			Row r = s.getRow(row);
			Cell c = r.getCell(cell);
			c.setCellValue(value);
		FileOutputStream fout= new FileOutputStream(f);
		w.write(fout);
		}

		}






