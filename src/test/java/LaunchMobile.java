import io.appium.java_client.AppiumBy;
import io.appium.java_client.AppiumDriver;

import io.appium.java_client.android.AndroidDriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
//import io.appium.java_client.MobileBy;

import java.net.MalformedURLException;
import java.net.URL;

public class LaunchMobile {

    public static void main(String[] args) throws MalformedURLException, InterruptedException {


        DesiredCapabilities capabilities = new DesiredCapabilities();

        AppiumDriver driver;
          capabilities.setCapability("deviceName","Galaxy M21 2021 Edition");
          capabilities.setCapability("udid","RZ8R811T53P");
          capabilities.setCapability("platformName","Android");
          capabilities.setCapability("platformVersion","13");
          capabilities.setCapability("automationName","uiAutomator2");
          capabilities.setCapability("appPackage","com.ubercab");
          capabilities.setCapability("appActivity", "com.ubercab.presidio.app.core.root.RootActivity");

        capabilities.setCapability("newCommandTimeout", 300);

          // get the url address from appium
          URL url=new URL("http://127.0.0.1:4723");
        driver=new AppiumDriver(url,capabilities);
        System.out.println("Application started");


        Thread.sleep(5000);
        try {
            driver.findElement(By.id("com.android.permissioncontroller:id/permission_allow_button")).click();
        } catch (Exception e) {
            System.out.println("Permission not requested.");
        }
        Thread.sleep(3000);
        try {
            driver.findElement(By.id("com.ubercab:id/welcome_screen_continue")).click();
        }
        catch (Exception e){
        System.out.println("Permission not requested.");
    }


        Thread.sleep(9000);

        driver.findElement(By.xpath("//android.view.View[@text='Please choose a country code']")).click();


        driver.findElement(By.xpath("//android.widget.TextView[@text='In']")).click();

//       WebElement element = driver.findElement(new AppiumBy.ByAndroidUIAutomator(
//                "new UiScrollable(new UiSelector().scrollable(true).instance(0))" +
//                        ".scrollIntoView(new UiSelector().textMatches(\"India\").instance(0))"
//
//        ));




    }
    }

