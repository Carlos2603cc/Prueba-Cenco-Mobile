package tasks;

import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import ui.homeSession;
import ui.profilePage;

public class logOut {

    public static void try_logOut(AndroidDriver driver){
        WebDriverWait wait = tasks.wait.waitElemet(driver);
        WebElement profile_button = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(homeSession.profile_button_xpath)));
        profile_button.click();
        WebElement logOut_button = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(profilePage.logOut_button_xpath)));
        logOut_button.click();

    }
}
