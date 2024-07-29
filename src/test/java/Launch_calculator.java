import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.MalformedURLException;
import java.net.URL;

public class Launch_calculator {
    public static void main(String[] args) throws MalformedURLException, InterruptedException {
launchcalculator();
    }

    public static void launchcalculator() throws MalformedURLException, InterruptedException {
        DesiredCapabilities capabilities = new DesiredCapabilities();

        AppiumDriver driver;
        capabilities.setCapability("deviceName","Galaxy M21 2021 Edition");
        capabilities.setCapability("udid","RZ8R811T53P");
        capabilities.setCapability("platformName","Android");
        capabilities.setCapability("platformVersion","13");
        capabilities.setCapability("automationName","uiAutomator2");
        capabilities.setCapability("appPackage","com.sec.android.app.popupcalculator");
        //capabilities.setCapability("appActivity", "com.android.calculator2.Calculator");


        capabilities.setCapability("newCommandTimeout", 300);
        capabilities.setCapability("noReset", true); // Add this line

        // get the url address from appium
        URL url=new URL("http://127.0.0.1:4723");
        driver=new AppiumDriver(url,capabilities);
        System.out.println("Application started");


        Thread.sleep(5000);

    }
}
