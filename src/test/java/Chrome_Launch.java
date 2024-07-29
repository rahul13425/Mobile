import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.nativekey.AndroidKey;
import io.appium.java_client.android.nativekey.KeyEvent;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.MalformedURLException;
import java.net.URL;

public class Chrome_Launch {

    public static void main(String[] args) throws MalformedURLException, InterruptedException {

        DesiredCapabilities capabilities = new DesiredCapabilities();

        AndroidDriver driver;

        capabilities.setCapability("deviceName", "vivo Y20G");
        capabilities.setCapability("udid", "9622356779000HO");
        capabilities.setCapability("platformName", "Android");
        capabilities.setCapability("platformVersion", "13");
        capabilities.setCapability("automationName", "UiAutomator2");
        capabilities.setCapability("appPackage", "com.android.chrome");
        capabilities.setCapability("appActivity", "com.google.android.apps.chrome.Main");

        capabilities.setCapability("newCommandTimeout", 300);

        // get the url address from appium
        URL url = new URL("http://127.0.0.1:4723");
        driver = new AndroidDriver(url, capabilities);
        System.out.println("Application started");

        Thread.sleep(7000);

        driver.findElement(By.xpath("//android.widget.Button[@resource-id=\"com.android.chrome:id/signin_fre_continue_button\"]")).click();
        driver.findElement(By.xpath("//android.widget.Button[@resource-id=\"com.android.chrome:id/button_secondary\"]")).click();
        driver.findElement(By.xpath("//android.widget.Button[@resource-id=\"com.android.chrome:id/ack_button\"]")).click();

        WebElement entersearch = driver.findElement(By.xpath("//android.widget.EditText[@resource-id=\"com.android.chrome:id/search_box_text\"]"));

        Thread.sleep(6000);
        entersearch.sendKeys("www.amazon.com");

        // Press ENTER key using AndroidDriver
        driver.pressKey(new KeyEvent(AndroidKey.ENTER));
    }
}
