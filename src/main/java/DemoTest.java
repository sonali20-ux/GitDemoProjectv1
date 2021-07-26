import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DemoTest

{

public static void main(String[] args)


{

    System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\Drivers\\chromedriver_win32\\chromedriver.exe");
    WebDriver driver = new ChromeDriver();
    driver.get("https://mail.google.com/");
    driver.findElement(By.xpath("//input[@type='email']")).sendKeys("pankajverma.mca@gmail.com");
    driver.findElement(By.xpath("//span[text()='Next']")).click();


}

}
