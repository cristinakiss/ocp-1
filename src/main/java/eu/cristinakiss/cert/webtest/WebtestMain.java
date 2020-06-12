package eu.cristinakiss.cert.webtest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebtestMain {

    private static final String USERNAME = "L";
    private static final String PASSWORD = "L";

    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        String baseUrl = "https://testbanks.wiley.com/WPDACE/Login";

        // launch the browser
        driver.get(baseUrl);

        // get the actual value of the title
        String actualTitle = driver.getTitle();
        System.out.println(actualTitle);

        WebElement usernameElement = driver.findElement(By.id("username"));
        usernameElement.sendKeys("helllllllo");
//        System.out.println(usernameElement.getAttribute("value"));
        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }


        //close the browser
        driver.close();
    }
}
