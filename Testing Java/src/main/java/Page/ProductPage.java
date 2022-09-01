package Page;

import Base.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class ProductPage extends BasePage {
    //locators
    protected static final String chartButton = "//*[@id=\"content\"]/div[3]/div/div/div[2]/div[2]/button[1]"; //xpath
    protected static final String sucessBuyAlert = "/html/body/div[2]/div[1]"; //xpath
    protected static final String searchBar = "/html/body/header/div/div/div[2]/div/input"; //xpath
    protected static final String searchButton = "/html/body/header/div/div/div[2]/div/span/button"; //xpath

    //action
    public void searchProduct(String product) throws InterruptedException {
        WebElement bar = getWebElement(By.xpath(searchBar));
        bar.clear();
        bar.sendKeys(product);
        Thread.sleep(1000);

        WebElement search = getWebElement(By.xpath(searchButton));
        search.click();
    }
    public void addIphone (){
        WebElement chart = getWebElement(By.xpath(chartButton));
        chart.click();
    }

    public String buySucsesfull (){
        WebElement alert = getWebElement(By.xpath(sucessBuyAlert));
        return alert.getText();
    }
}
