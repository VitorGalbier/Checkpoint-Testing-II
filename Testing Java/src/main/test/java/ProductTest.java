import Page.AccountPage;
import Page.ProductPage;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class ProductTest {
    private static ProductPage page;

    @BeforeEach
    public void setUp(){
        page = new ProductPage();
        page.openApp();
    }

    @Test
    public void buyProduct() throws InterruptedException {
        page.searchProduct("Iphone");
        page.addIphone();
        Thread.sleep(1000);

        String message = page.buySucsesfull();
        assertTrue(message.contains("Success: You have added iPhone to your shopping cart!"));
        System.out.println("Buy succesfull: " + message);
    }

    @AfterEach
    public void tearDown(){
        page.quitDriver();
    }
}
