package First;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Test_Prog {
	
	public static String str1 = "Naresh";
	
	public static void main(String[] args) { 
		
		int Timeout = 30;
		
		System.out.println("First prog");
		
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("http://www.capitalmarket.com/");
		/*WebDriverWait wait = new WebDriverWait(driver, Timeout);
		String oldTab = driver.getWindowHandle();
		//wait.until(ExpectedConditions.elementToBeClickable(By.linkText("Advertise With Us")));
		driver.findElement(By.xpath("//a[@target='blank']"));
		//driver.findElement(By.linkText("Advertise With Us")).click();
		
		ArrayList<String> newTab = new ArrayList<String>(driver.getWindowHandles());
		newTab.remove(oldTab);
        driver.switchTo().window(newTab.get(0));
		
		driver.close();*/
		Set<String> seta = new HashSet<String>();
		seta.add("Naresh");
		seta.add("Chetan");
		seta.add("Naresh");
		seta.add("Pratiksha");
		System.out.println(seta);
		
		List<String> l = new ArrayList<String>();
		l.add("Naresh");
		l.add("Chetan");
		l.add("Naresh");
		l.add("Pratiksha");
		System.out.println(l);
		
		Set<String> a = driver.getWindowHandles();
		System.out.println(a);
	}
}
