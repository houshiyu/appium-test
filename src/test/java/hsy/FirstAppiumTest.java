package hsy;


import io.appium.java_client.MobileElement;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.touch.offset.PointOption;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;

/**
 * Created by Cailianshe on 2020/3/7.
 */
public class FirstAppiumTest {

    private AndroidDriver driver;

    @Before
    public void setUp() throws MalformedURLException {
        DesiredCapabilities desiredCapabilities = new DesiredCapabilities();
        desiredCapabilities.setCapability("platformName", "android");
        desiredCapabilities.setCapability("deviceName", "GWY0217207001250");
        desiredCapabilities.setCapability("platformVersion", "9");
        desiredCapabilities.setCapability("appPackage", "com.lanjinger.choiassociatedpress");
        desiredCapabilities.setCapability("appActivity", "com.lanjinger.choiassociatedpress.main.MainTabActivity");


        URL remoteUrl = new URL("http://localhost:4723/wd/hub");

        driver = new AndroidDriver(remoteUrl, desiredCapabilities);
    }

    @Test
    public void sampleTest() throws InterruptedException {
        System.out.println("auto process begin");



        (new TouchAction(driver)).tap(PointOption.point(705, 1266)).perform();
        Thread.sleep(2000);

        WebElement elementOne = driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.LinearLayout[2]/android.widget.RelativeLayout[3]/android.widget.RelativeLayout");
        (new TouchAction(driver)).tap(PointOption.point(elementOne.getLocation())).perform();
        Thread.sleep(4000);


        (new TouchAction(driver)).tap(PointOption.point(320, 1723)).perform();
        Thread.sleep(2000);
        (new TouchAction(driver)).tap(PointOption.point(966, 1702)).perform();
        Thread.sleep(2000);
        (new TouchAction(driver)).tap(PointOption.point(108, 1729)).perform();
        Thread.sleep(2000);
        (new TouchAction(driver)).press(PointOption.point(425, 1484))
                .moveTo(PointOption.point(9, -467))
                .release()
                .perform();
        Thread.sleep(4000);
        System.out.println("auto process end");
    }

    @After
    public void tearDown() {
        driver.quit();
    }
}
