package tasks;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;

public class deviseConfig {

    public static void searchApp(AndroidDriver driver){
        WebDriverWait wait = tasks.wait.waitElemet(driver);
        WebElement search = wait.until(ExpectedConditions.visibilityOfElementLocated(AppiumBy.accessibilityId("Search")));
        search.click();
        WebElement text_box = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("com.google.android.googlequicksearchbox:id/googleapp_search_box")));
        text_box.sendKeys("Conduit");
        WebElement app = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("com.google.android.googlequicksearchbox:id/googleapp_app_icon")));
        app.click();
    }

}
