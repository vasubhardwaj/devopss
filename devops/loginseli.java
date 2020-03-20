
.public class FbLogin {

    public static void main(String[] args) throws InterruptedException

    {
        System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");

        WebDriver driver = new ChromeDriver();

        driver.get("C:\Users\VASU BHARDWAJ\Desktop\devops");
        System.out.println("Successfully opened the website");
        driver.manage().window().maximize();
        driver.findElement(By.id("emails")).sendKeys("Enter USERNAME");
        driver.findElement(By.id("passwo")).sendKeys("Enter PASSWORD");
        driver.findElement(By.id("button")).click();
        System.out.println("you have succesfully logged in");
        Thread.sleep(3000);
        driver.findElement(By.id("userNavigationLabel")).click();
        Thread.sleep(2000);
        driver.findElement(By.partialLinkText("Log out")).click();
        System.out.println("Successfully logged out");

    }
