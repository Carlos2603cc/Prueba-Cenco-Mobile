package tasks;

import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import ui.home;

public class navigateTo{

    public static void LoginPage(AndroidDriver driver){
        WebDriverWait wait = tasks.wait.waitElemet(driver);
        WebElement search = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(home.go_to_Login_xpath)));
        search.click();

    }
}
