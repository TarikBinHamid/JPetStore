import Page.FishPage;
import browser.Browser;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class TestJpetStore {
    @Test
    public void testJpetStore() {
        Browser browser = new Browser();
        browser.openBrowser().clickElement("FISH");
        PageFactory.initElements(browser.getDriver(), FishPage.class)
                .clickFish("FI-SW-01");


    }
}