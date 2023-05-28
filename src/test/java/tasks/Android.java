package tasks;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.nativekey.AndroidKey;
import io.appium.java_client.android.nativekey.KeyEvent;

public class Android {

    public static void navigateToHome(AndroidDriver driver){
        KeyEvent homeKeyEvent = new KeyEvent(AndroidKey.HOME);
        driver.pressKey(homeKeyEvent);

    }

}
