package com.sbs.selenium.exam;

import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Main {
	public static void main(String[] args) {
		 Path path = Paths.get(System.getProperty("user.dir"), "src/main/resources/chromedriver.exe");
	
		 System.setProperty("webdriver.chrome.driver", path.toString());
		 
		 System.out.println(path.toString());
		 ChromeOptions options = new ChromeOptions();
		 options.addArguments("--start-maximized");
		 options.addArguments("--disable-popup-blocking");
		 options.addArguments("--disable-default-apps");
		 
		 ChromeDriver driver = new ChromeDriver(options);
		 
		 //빈탭 생성
		 driver.executeScript("window.open('about.blanck','_blank');");
		 
		 List<String> tabs = new ArrayList<String>(driver.getWindowHandles());
				 
		 driver.switchTo().window(tabs.get(0));
		 driver.get("https://www.naver.com/");
	}
}
