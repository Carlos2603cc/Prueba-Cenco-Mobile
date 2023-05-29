package tasks;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.nativekey.AndroidKey;
import io.appium.java_client.android.nativekey.KeyEvent;
import io.appium.java_client.TouchAction;
import io.appium.java_client.touch.WaitOptions;
import io.appium.java_client.touch.offset.PointOption;
import org.openqa.selenium.WebElement;

import java.time.Duration;

public class Android {

    public static void navigateToHome(AndroidDriver driver){
        KeyEvent homeKeyEvent = new KeyEvent(AndroidKey.HOME);
        driver.pressKey(homeKeyEvent);

    }

    public static void app_switch(AndroidDriver driver){
        KeyEvent keyEvent = new KeyEvent(AndroidKey.APP_SWITCH);
        driver.pressKey(keyEvent);

    }

    public static void scroll_up(AndroidDriver driver){
        int screenHeight = driver.manage().window().getSize().getHeight();
        int screenWidth = driver.manage().window().getSize().getWidth();

        int startX = screenWidth / 2;
        int startY = (int) (screenHeight * 0.8);
        int endY = (int) (screenHeight * 0.2);

        TouchAction touchAction = new TouchAction(driver);
        Duration tiempo = Duration.ofMillis(500);
        touchAction.press(PointOption.point(startX, startY))
                .waitAction(WaitOptions.waitOptions(tiempo))
                .moveTo(PointOption.point(startX, endY))
                .release()
                .perform();
    }

}
