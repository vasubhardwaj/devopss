package SamplePackage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FirstSampleTest{

 public static void main(String[] args) {
      System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
      WebDriver driver = new ChromeDriver();
      driver.get("C:\Users\VASU BHARDWAJ\Desktop\devops");
      driver.manage().window().maximize();

      //text fields
      driver.findElement(By.id("firstname")).sendKeys("anushka");
      driver.findElement(By.name("lastname")).sendKeys("kritika");
      driver.findElement(By.name("email")).sendKeys("8266086475");
      driver.findElement(By.name("reemail")).sendKeys("8650325097");
      driver.findElement(By.name("pass")).sendKeys("COVID51");

      //static drop down
      Select s = new Select(driver.findElement(By.id("day")));
      Thread.sleep(1000);
      s.selectByVisibleText("12");

      Select s1 = new Select(driver.findElement(By.id("month")));
      Thread.sleep(1000);
      s1.selectByValue("5");

      Select s2 = new Select(driver.findElement(By.id("year")));
      Thread.sleep(1000);
      s2.selectByValue("1993");
      //radio button
          driver.findElement(By.xpath("//input[@value='2']")).click();//for selecting male

      driver.findElement(By.name("websubmit")).click();

      driver.close();
  }


}
