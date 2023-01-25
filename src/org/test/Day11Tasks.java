package org.test;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day11Tasks {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\manoj\\eclipse-workspace\\Day2Task\\Driver\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.get("https://www.demo.guru99.com/test/table.html");
        String title = driver.getTitle();
        String url = driver.getCurrentUrl();
		// QUESTION 1
		List<WebElement> allData = driver.findElements(By.tagName("td"));
		
		int size = allData.size();		
		
		for(int i=0;i<size;i++)
		{
			WebElement eachRow = allData.get(i);
			String str = eachRow.getText();
			System.out.println(str);
		}
		
		System.out.println("------------------------------------------");
		
		for (WebElement eachData : allData) {

			String text = eachData.getText();
			System.out.println(text);
		}

		// QUESTION 2
	    List<WebElement> allRows = driver.findElements(By.tagName("tr"));
				
		WebElement firstRowTable = allRows.get(0);
		String textTable = firstRowTable.getText();
		System.out.println(textTable);

		// QUESTION 3
		
		int noOfRows = allRows.size();
		System.out.println("No Of Rows in Wepage = "+noOfRows);
		
		driver.quit();

	}

}
