package org.junittask;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.Alert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class BaseClass {
public static WebDriver driver;
public static Actions a;
public static Robot r;
public static ChromeOptions options;
public static JavascriptExecutor js;
public static TakesScreenshot ts;
public static Alert alert;
public static Select s;

	public static void launchBrowser(String url) {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Saru\\eclipse-workspace\\Data\\driver\\chromedriver.exe");
	driver = new ChromeDriver();
	driver.get(url);
	}
	
	public static void txtUser(WebElement e, String Value) {
	e.sendKeys(Value);
}
	public static void closing() {
	driver.close();
}
	public static void quiting() {
	driver.quit();
}
	public static String Title() {
	String title = driver.getTitle();
	System.out.println(title);
	return Title();
}

	public void PageUrl() {
	String url = driver.getCurrentUrl();
	System.out.println(url);
		
}

	public static void clicking(WebElement e) {
	e.click();
}

	public static void maxWindow() {
	driver.manage().window().maximize();
}

	public static void toGetText(WebElement e) {
	System.out.println(e.getText());
}
	
	public static void toSendKeys(WebElement e, String text) {
	e.sendKeys(text);
	}
	
	public static String toGetAttribute(WebElement e) {
	String text = e.getAttribute("value");
	return text;
	}
	
	private void togetAttributeId() {
		// TODO Auto-generated method stub

	}
	
	public static void navigatingReferesh() {
	driver.navigate().refresh();
	}
	
	public static  void navigatingBack() {
	driver.navigate().back();
	}
	
	public static void navigatingForward() {
	driver.navigate().forward();
	}
	public static void sleep() throws InterruptedException {
	Thread.sleep(3000);
	}
	public static void dropDown(WebElement src, WebElement dest) {
	a = new Actions(driver);
	a.dragAndDrop(src, dest).perform();
	}
	
	public static void moveElement(WebElement e) {
	a.moveToElement(e).perform();
	}
	
	private void twoClick() {
	a.doubleClick();
	}
	
	private void rightClick() {
	a.contextClick();
	}
	
	private void keyDownUp(WebElement text, String value) {
	a.keyDown(text, Keys.SHIFT).sendKeys(text, value).keyUp(text, Keys.SHIFT).build().perform();
	}
	
	public static  void paste() throws AWTException {
	r = new Robot();
	r.keyPress(KeyEvent.VK_CONTROL);
	r.keyPress(KeyEvent.VK_V);
	r.keyRelease(KeyEvent.VK_CONTROL);
	r.keyRelease(KeyEvent.VK_V);
	}
	
	public static void copy() {
	r.keyPress(KeyEvent.VK_CONTROL);
	r.keyPress(KeyEvent.VK_C);
	r.keyRelease(KeyEvent.VK_CONTROL);
	r.keyRelease(KeyEvent.VK_C);
	}
	
	public static void tab() {
	r.keyPress(KeyEvent.VK_TAB);
	r.keyRelease(KeyEvent.VK_TAB);
	}
	
	public static String Cascading(WebElement e, String value) {
	String txt = e.getCssValue(value);
	System.out.println(txt);
	return txt;
	}
	
	public void disableNotifications() {
	options = new ChromeOptions();
	options.addArguments("--disable-notifications");
	}
	
	public static void javaScriptSendkeys(WebElement e, String txt) {
	js = (JavascriptExecutor) driver;
	js.executeScript("arugments[0].setAttribute('value',  '"+txt+"')"	 , e);
	}
	
	public static void javaScriptClick(WebElement e) {
	js.executeScript("arguments[0].click()", e);
	}
	
	public static void javaScrollUp(WebElement e) {
		js = (JavascriptExecutor) driver;
	js.executeAsyncScript("arguments[0].scrollIntoView()", e);
	}
	
	public static void javaScrollDown(WebElement e) {
		js = (JavascriptExecutor) driver;
	js.executeAsyncScript("arguments[0].scrollIntoView()", e);
	}
	
	
	public static void screenshot() throws IOException {
	ts = (TakesScreenshot) driver;
	File src = ts.getScreenshotAs(OutputType.FILE);
	File file = new File("E:\\Java selenium\\Screenshots\\"+"screens.jpg");
	FileUtils.copyFile(src, file);
	}

	public static void frameSetName(WebElement e) {
	driver.switchTo().frame(e);
	}
	 
	public static void alertMethodAccept() {
	alert = driver.switchTo().alert();
	alert.accept();
	}
	
	public static void alertMethodDismiss() {
		alert = driver.switchTo().alert();
		alert.dismiss();
	}
	
	public static String alertMethodGetText() {
		String text = alert.getText();
		System.out.println(text);
		return text;
	}
	
	public static void alertMethodSendKeys(String value) {
		alert = driver.switchTo().alert();
		alert.sendKeys(value);
	}

	public static void selectSngleIndex(WebElement element, String text) {
	s = new Select(element);
	s.selectByVisibleText(text);
	
	}
	
	public static void selectAll(WebElement element) {
		s = new Select(element);
		s.getAllSelectedOptions();
	}
	
	public static void deSelectAll(WebElement element) {
		s = new Select(element);
		s.deselectAll();
	}
	
	public static void selectIndex(WebElement element, int index) {
		s = new Select(element);
		s.selectByIndex(index);
	}
	
	public static void deSelectValue(WebElement element, String Value) {
		s = new Select(element);
		s.deselectByValue(Value);
	}
	
	
	public static void getOption() {
	List<WebElement> list = s.getOptions();
	for (WebElement e : list) {
		String text = e.getText();
		System.out.println(text);
					}
		}
	
	public static String excelRead(int row, int cell) throws IOException {
	File f = new File("C:\\Users\\Saru\\eclipse-workspace\\PomProjectTask\\src\\test\\java\\org\\sample2\\AddictionPage.xlsx");
	FileInputStream fin = new FileInputStream(f);
	Workbook w = new XSSFWorkbook(fin);
	Sheet sheet = w.getSheet("Sheet1");
	Row r = sheet.getRow(row);
	Cell c=r.getCell(cell);
	int CellType = c.getCellType();
	String value="";
	if (CellType==1) {
		value = c.getStringCellValue();
	}
		else if(DateUtil.isCellDateFormatted(c)) {
			Date d = c.getDateCellValue();
			SimpleDateFormat s = new SimpleDateFormat("DD/mm/yyyy");
			value = s.format(d);
		}
		else {
			double dd = c.getNumericCellValue();
			long l = (long) dd;
			value = String.valueOf(l);
		}
	return value;
	}
	
	public static Workbook excelWrite(int row, int cell, String value) throws IOException {
	File f = new File("C:\\Users\\Saru\\eclipse-workspace\\PomProjectTask\\src\\test\\java\\org\\sample2\\AddictionPage.xlsx");
	FileInputStream fil = new FileInputStream(f);
	Workbook w = new XSSFWorkbook(fil);
	Sheet sheet = w.getSheet("Sheet1");
	sheet.getRow(row).createCell(cell).setCellValue(value);
	FileOutputStream fout = new FileOutputStream(f);
	w.write(fout);
	return w;
		}
	
	
	
}
