package Base;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class BasePage {
    public static WebDriver driver;
    protected static final String url = "https://opencart.abstracta.us/index.php?route=common/home";

    public BasePage(){
        this.driver = new ChromeDriver();
    }

    public void openApp(){
        getDriver().get(url);
        getDriver().manage().window().maximize();
    }

    public WebDriver getDriver(){
        return driver;
    }

    public WebElement getWebElement(By Locator){
        WebElement element = null;
        try {
            element = driver.findElement(Locator);
        }catch (Exception e){
            System.out.println("Element not found: " + e);
        }
        return element;
    }

    public void quitDriver(){
        driver.quit();
    }

}
