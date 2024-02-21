package Page;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class HomePage {

    @FindBy(css = "#SidebarContent>a") private List<WebElement> linkElements;

    public void clickElement(String linkName){
        for (WebElement element: linkElements) {
            if (element.getAttribute("href").contains("FISH")){
                element.click();
                break;
            }

        }
    }
}
