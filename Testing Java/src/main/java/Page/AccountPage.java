package Page;

import Base.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class AccountPage extends BasePage {
    //locators
    private static final String firstNameInput = "input-firstname"; //id
    private static final String lastNameInput = "input-lastname"; //id
    private static final String eMailInput = "input-email"; //id
    private static final String phoneInput = "input-telephone"; //id
    private static final String passwordInput = "input-password"; //id
    private static final String confirmPasswordInput = "input-confirm"; //id
    private static final String newsLetterNo = "/html/body/div[2]/div/div/form/fieldset[3]/div/div/label[2]/input"; //xpath
    private static final String privacyPolicy = "/html/body/div[2]/div/div/form/div/div/input[1]"; //xpath
    private static final String continueButton = "/html/body/div[2]/div/div/form/div/div/input[2]"; //xpath
    protected static final String accountButton = "/html/body/nav/div/div[2]/ul/li[2]/a/span[1]"; //xpath
    protected static final String registerButton = "/html/body/nav/div/div[2]/ul/li[2]/ul/li[1]/a"; //xpath
    protected static final String sucessfullTitlePage = "Your Account Has Been Created!"; //xpath


    //actions

    public void goToRegister() throws InterruptedException {
        WebElement account = getWebElement(By.xpath(accountButton));
        account.click();
        Thread.sleep(1000);

        WebElement register = getWebElement(By.xpath(registerButton));
        register.click();
    }

    public void completePersonalDetails (String name, String lname, String eMail, String phone){
        WebElement firstName = getWebElement(By.id(firstNameInput));
        firstName.clear();
        firstName.sendKeys(name);

        WebElement lastName = getWebElement(By.id(lastNameInput));
        lastName.clear();
        lastName.sendKeys(lname);

        WebElement eMailI = getWebElement(By.id(eMailInput));
        eMailI.clear();
        eMailI.sendKeys(eMail);

        WebElement phoneNumber = getWebElement(By.id(phoneInput));
        phoneNumber.clear();
        phoneNumber.sendKeys(phone);
    }

    public void completePassword (String password){
        WebElement passwordOne = getWebElement(By.id(passwordInput));
        passwordOne.clear();
        passwordOne.sendKeys(password);

        WebElement passwordConfirm = getWebElement(By.id(confirmPasswordInput));
        passwordConfirm.clear();
        passwordConfirm.sendKeys(password);
    }

    public void checkNewsLetter (){
        WebElement newsLetterN = getWebElement(By.xpath(newsLetterNo));
        newsLetterN.click();
    }

    public void checkPrivacyPolicy(){
        WebElement pPolicy = getWebElement(By.xpath(privacyPolicy));
        pPolicy.click();
    }

    public void finishRegister(){
        WebElement cButton = getWebElement(By.xpath(continueButton));
        cButton.click();
    }

    public String checkAccountCreated(){
        return driver.getTitle();
    }
}
