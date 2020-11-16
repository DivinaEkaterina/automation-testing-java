import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class FindVideo {
    private WebDriver driver;
    public FindVideo(WebDriver driver){
        this.driver = driver;
    }
    private By video;

    {
        video = By.xpath("//yt-formatted-string[@class= 'style-scope ytd-video-renderer']");
    }

    public void clickVideo() {
        driver.findElement(video).click();
    }

}
