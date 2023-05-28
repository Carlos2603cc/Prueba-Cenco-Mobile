package tasks;

import io.appium.java_client.android.AndroidDriver;

import java.net.MalformedURLException;

public class setSession {

    public static AndroidDriver driver;

    public static AndroidDriver startSession() throws MalformedURLException {
        driver = AppiumConfig.configurarSesionAppium();
        deviseConfig.searchApp(driver);
        return driver;
    }
}
