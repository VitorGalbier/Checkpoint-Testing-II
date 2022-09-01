import Page.AccountPage;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class CreateAccountTest {
    private static AccountPage page;

    @BeforeEach
    public void setUp(){
        page = new AccountPage();
        page.openApp();
    }

    @Test
    public void Register() throws InterruptedException {
        page.goToRegister();
        Thread.sleep(1000);
        page.completePersonalDetails("vitor", "galbier", "v.galbier@bla.com", "1234567");
        page.completePassword("123456780");
        page.checkNewsLetter();
        page.checkPrivacyPolicy();
        page.finishRegister();
        Thread.sleep(1000);
        assertTrue(page.checkAccountCreated().contains("Your Account Has Been Created!"));
    }

    @AfterEach
    public void tearDown(){
        page.quitDriver();
    }
}
