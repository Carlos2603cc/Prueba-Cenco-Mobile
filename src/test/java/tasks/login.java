package tasks;

import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import ui.loginScreen;
public class login {

    public static void tryLogin(AndroidDriver driver, String user, String password){
        WebDriverWait wait = tasks.wait.waitElemet(driver);
        WebElement user_name_box = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(loginScreen.user_name_box_xpath)));
        user_name_box.sendKeys(user);
        WebElement password_box = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(loginScreen.password_box_xpath)));
        password_box.sendKeys(password);
        WebElement login_button = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(loginScreen.login_button_xpath)));
        login_button.click();
    }
}
