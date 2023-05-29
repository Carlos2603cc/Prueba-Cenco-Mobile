package questions;

import io.appium.java_client.android.AndroidDriver;
import org.junit.Assert;
import java.util.Arrays;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import ui.*;


public class userAssert {

    public static void StatusCodeValidation(int statusCode){
        List<Integer> allowedStatusCodes = Arrays.asList(200, 201, 204);
        Assert.assertTrue("El código de estado no está permitido", allowedStatusCodes.contains(statusCode));

    }

    public static void loginSuccessful(AndroidDriver driver){
        WebDriverWait wait = tasks.wait.waitElemet(driver);
        WebElement home_view = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(homeSession.home_view_xpath)));
        WebElement your_feed_tab = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(homeSession.your_feed_tab_xpath)));
        WebElement global_feed_tab = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(homeSession.global_feed_tab_xpath)));
        WebElement articles = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(homeSession.articles_xpath)));
        WebElement profile_button = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(homeSession.profile_button_xpath)));
        WebElement favorite_articles_button = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(homeSession.favorite_articles_button_xpath)));
        WebElement create_article_button = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(homeSession.create_article_button_xpath)));
        WebElement my_article_button = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(homeSession.my_article_button_xpath)));
        Assert.assertNotNull(home_view);
        Assert.assertNotNull(your_feed_tab);
        Assert.assertNotNull(global_feed_tab);
        Assert.assertNotNull(articles);
        Assert.assertNotNull(profile_button);
        Assert.assertNotNull(favorite_articles_button);
        Assert.assertNotNull(create_article_button);
        Assert.assertNotNull(my_article_button);
    }

    public static void loginFailed(AndroidDriver driver){
        WebDriverWait wait = tasks.wait.waitElemet(driver);
        WebElement pop_up_error_login = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(loginScreen.pop_up_error_login_xpath)));
        WebElement close_button_pop_up = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(loginScreen.close_button_pop_up_xpat)));
        close_button_pop_up.click();
        WebElement Error_login = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(loginScreen.Error_login_xpath)));
        Assert.assertNotNull(pop_up_error_login);
        Assert.assertNotNull(close_button_pop_up);
        Assert.assertNotNull(Error_login);
    }


}
