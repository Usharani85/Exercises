package Seleniumdemo.Excercises;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class login {
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Usharani_Prasad\\Documents\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		//System.setProperty("webdriver.chrome.driver","C://Users//Usharani_Prasad//Downloads//chromedriver_win32//chromedriver.exe");
		driver.get("https://www.dezlearn.com/webtable-example/");
		driver.manage().window().maximize();
		List<WebElement> names=driver.findElements(By.xpath("//table[@class='tg']//td[1]"));
		String[] beforesort=new String[names.size()];
		for(int i=0;i<names.size();i++) {
			beforesort[i]=names.get(i).getText().trim();
			
		}
		for(int j=0;j<beforesort.length;j++) {
			System.out.print("***********"+beforesort[j]);	
		}
		
		
		
	}

}
