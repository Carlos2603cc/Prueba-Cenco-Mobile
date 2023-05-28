package tasks;

import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class wait {
    public static WebDriverWait waitElemet(AndroidDriver driver){
         Duration tiempoEspera = Duration.ofSeconds(30);
        WebDriverWait wait = new WebDriverWait(driver, tiempoEspera);
        return wait;
    }
}
