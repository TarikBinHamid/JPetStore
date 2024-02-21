package Page;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class FishPage {
    @FindBy(xpath = "//*[@id='Catalog']/table/tbody/tr/td[1]/a")
    private List<WebElement> fishNamesLinks;

    public void clickFish(String fishName){
        for (WebElement element: fishNamesLinks) {
            if (element.getText().equalsIgnoreCase(fishName)){
                element.click();
                break;
            }

        }
    }
}
