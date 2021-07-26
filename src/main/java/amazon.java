import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;


public class amazon
{

    public static void login()

    {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.amazon.co.uk/ap/signin?openid.pape.max_auth_age=0&openid.return_to=https%3A%2F%2Fwww.amazon.co.uk%2Fref%3Dnav_signin&openid.identity=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.assoc_handle=gbflex&openid.mode=checkid_setup&openid.claimed_id=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.ns=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0&");
        WebElement UserId = driver.findElement(By.xpath("//input[@type='email']"));
        UserId.sendKeys("sonaliujjir@gmail.com");
        driver.findElement(By.xpath("//input[@id='continue']")).click();
        driver.findElement(By.xpath("//input[@type='password']")).sendKeys("sonali07");
        driver.findElement(By.xpath("//input[@id='signInSubmit']")).click();
        driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys("Alexa");
        driver.findElement(By.xpath("//input[@type='submit']")).click();
        driver.findElement(By.linkText("Echo Dot (3rd Gen) - Smart speaker with Alexa - Charcoal Fabric")).click();
        driver.findElement(By.xpath("//input[@id='add-to-cart-button']")).click();
        driver.findElement(By.id("hlb-view-cart-announce")).click();
        int dropdown = driver.findElements(By.className("a-native-dropdown a-declarative sc-update-quantity-select")).size();
        System.out.println("dropdown");
        //Select Option = new Select(dropdown);
        //Option.selectByValue("5");
        //driver.findElement(By.id("hlb-ptc-btn-native")).click();
        //WebElement postcode =driver.findElement(By.xpath("//li[@class='displayAddressLI displayAddressCityStateOrRegionPostalCode']"));
        //System.out.println(postcode);
        //if (postcode contains "CM14 4BU")
    }


 }


