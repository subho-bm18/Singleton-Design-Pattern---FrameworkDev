package singletonPattern;

import org.openqa.selenium.WebDriver;
//import SingletonBrowserClass.*;

public class LoadURL {

	public static void main(String[] args) {
		
		SingletonBrowserClass sbc1= SingletonBrowserClass.getInstanceOfSingletonBrowserClass();
		WebDriver driver1 = sbc1.getDriver();
		
		
		SingletonBrowserClass sbc2= SingletonBrowserClass.getInstanceOfSingletonBrowserClass();
		SingletonBrowserClass sbc3= SingletonBrowserClass.getInstanceOfSingletonBrowserClass();

		System.out.println(sbc1);
		System.out.println(sbc2);
		System.out.println(sbc3);
		System.out.println(sbc1);

		WebDriver driver2 = sbc2.getDriver();
		driver2.get("https://www.sports365.in/");
	}
}