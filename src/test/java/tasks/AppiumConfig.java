package tasks;

import net.serenitybdd.core.Serenity;
import org.openqa.selenium.remote.DesiredCapabilities;
import io.appium.java_client.remote.MobileCapabilityType;
import io.appium.java_client.android.AndroidDriver;
import java.net.MalformedURLException;
import java.net.URL;


public class AppiumConfig {

    public static AndroidDriver configurarSesionAppium() throws MalformedURLException {
        URL url = new URL("http://localhost:4723/wd/hub");
        String  platformName = "Android";
        String  platfomVersion = "12";
        String  deviceName = "AutomationTesting";
        String  automationName = "uiautomator2";
        int  newComandTimeOut = 1000;

        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability(MobileCapabilityType.PLATFORM_NAME, platformName);
        capabilities.setCapability(MobileCapabilityType.PLATFORM_VERSION, platfomVersion);
        capabilities.setCapability(MobileCapabilityType.DEVICE_NAME, deviceName);
        capabilities.setCapability(MobileCapabilityType.AUTOMATION_NAME, automationName);
        capabilities.setCapability(MobileCapabilityType.NEW_COMMAND_TIMEOUT, newComandTimeOut);

        AndroidDriver driver = new AndroidDriver(url, capabilities);

        return driver;

    }
}
