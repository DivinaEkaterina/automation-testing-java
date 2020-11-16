import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {
    private WebDriver driver;
    public HomePage(WebDriver driver) {
        this.driver = driver;
    }

    private By trending = By.xpath("//yt-formatted-string[contains(text(),'Trending')]");

    public void clickTrending() {
        driver.findElement(trending).click();
        return;
    }

}
