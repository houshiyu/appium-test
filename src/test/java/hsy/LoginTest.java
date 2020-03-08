package hsy;

import io.appium.java_client.MobileElement;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.touch.offset.PointOption;
import junit.framework.TestCase;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import java.net.MalformedURLException;
import java.net.URL;
import org.openqa.selenium.remote.DesiredCapabilities;

/**
 * Created by Cailianshe on 2020/3/8.
 */
public class LoginTest {
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


        (new TouchAction(driver)).tap(PointOption.point(705, 1266)).perform();
        Thread.sleep(2000);

        //点击LOGO
        MobileElement el1 = (MobileElement) driver.findElementById("com.lanjinger.choiassociatedpress:id/iv_not_login");
        el1.click();

        //选中登录/注册按钮，并点击
        MobileElement el2 = (MobileElement) driver.findElementById("com.lanjinger.choiassociatedpress:id/moremain_textview_username");
        el2.click();

        //切换至账号密码登录
        MobileElement el3 = (MobileElement) driver.findElementById("com.lanjinger.choiassociatedpress:id/tv_change_login_type");
        el3.click();

        //选中输入手机号的输入框
        MobileElement el4 = (MobileElement) driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.LinearLayout[1]/android.widget.LinearLayout[1]/android.widget.LinearLayout/android.widget.EditText");

        //输入手机号
        el4.sendKeys("17621000293");

        //选中输入密码的输入框
        MobileElement el5 = (MobileElement) driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.LinearLayout[1]/android.widget.RelativeLayout/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.EditText");

        //输入密码
        el5.sendKeys("syhou1991");

       //点击登录按钮
        MobileElement el6 = (MobileElement) driver.findElementById("com.lanjinger.choiassociatedpress:id/tv_login");
        el6.click();
        Thread.sleep(2000);

        //点击返回按钮
        MobileElement el7 = (MobileElement) driver.findElementById("com.lanjinger.choiassociatedpress:id/layout_close_image");
        el7.click();

        //选中搜索框，并点击，调起键盘
        MobileElement el31 = (MobileElement) driver.findElementById("com.lanjinger.choiassociatedpress:id/tv_search_hint");
        el31.click();
        Thread.sleep(2000);

        //再次选中输入框，并输入"武汉"
        MobileElement el32 = (MobileElement) driver.findElementById("com.lanjinger.choiassociatedpress:id/et_search");
        el32.sendKeys("武汉");

        //点击"搜索"按钮
        (new TouchAction(driver)).tap(PointOption.point(989, 1668)).perform();
        Thread.sleep(4000);

        //选中电报的"查看更多"，并点击
        MobileElement el33 = (MobileElement) driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.FrameLayout/android.widget.ScrollView/android.widget.LinearLayout/android.widget.LinearLayout[1]/android.widget.TextView[2]");
        el33.click();
        Thread.sleep(2000);

        //滑动页面
        (new TouchAction(driver))
                .press(PointOption.point(395,1598))
                .moveTo(PointOption.point(15,-381))
                .release()
                .perform();
        Thread.sleep(200);

//        //选中一个电报并点击
//        MobileElement el34 = (MobileElement) driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.ListView/android.widget.LinearLayout[3]/android.widget.LinearLayout/android.widget.TextView[1]");
//        el4.click();
//        Thread.sleep(1000);
//
//        //点击返回按钮
//        MobileElement el35 = (MobileElement) driver.findElementById("com.lanjinger.choiassociatedpress:id/navbar_left_img");
//        el5.click();
//        Thread.sleep(1000);

        //点击"取消"按钮
        (new TouchAction(driver)).tap(PointOption.point(983, 132)).perform();
        Thread.sleep(1000);

        //点击"关注"tab
        MobileElement el18 = (MobileElement) driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.LinearLayout[1]/android.widget.FrameLayout/android.widget.LinearLayout/android.view.ViewGroup/android.widget.RelativeLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.HorizontalScrollView/android.widget.FrameLayout/android.widget.LinearLayout[2]/android.widget.RelativeLayout[1]/android.widget.RelativeLayout/android.widget.TextView");
        el18.click();
        Thread.sleep(2000);

        //选中一个话题，并点击
        MobileElement el19 = (MobileElement) driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.LinearLayout[1]/android.widget.FrameLayout/android.widget.LinearLayout/android.view.ViewGroup/android.widget.RelativeLayout/android.support.v4.view.ViewPager/android.widget.RelativeLayout/android.widget.RelativeLayout/android.view.ViewGroup/android.support.v7.widget.RecyclerView/android.support.v7.widget.RecyclerView/android.widget.RelativeLayout[3]/android.widget.FrameLayout/android.widget.ImageView");
        el19.click();
        Thread.sleep(2000);

        //选中"关注"按钮，并点击
        MobileElement el20 = (MobileElement) driver.findElementById("com.lanjinger.choiassociatedpress:id/iv_attention");
        el20.click();

        //推送弹窗，点击"接收推送"
        MobileElement el21 = (MobileElement) driver.findElementById("com.lanjinger.choiassociatedpress:id/tv_confirm");
        el21.click();
        Thread.sleep(2000);

        //点击左上角返回按钮
        (new TouchAction(driver)).tap(PointOption.point(52, 132)).perform();
        Thread.sleep(2000);
        MobileElement el22 = (MobileElement) driver.findElementById("com.lanjinger.choiassociatedpress:id/iv_user_head");
        el22.click();
        Thread.sleep(2000);

        //进设置页面，并滑动
        MobileElement el23 = (MobileElement) driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.RelativeLayout/android.widget.LinearLayout/android.widget.RelativeLayout/android.widget.RelativeLayout[2]/android.widget.TextView");
        el23.click();
        Thread.sleep(2000);
        (new TouchAction(driver))
                .press(PointOption.point(451,1232))
                .moveTo(PointOption.point(7,-291))
                .release()
                .perform();

        //点击"退出"按钮
        MobileElement el24 = (MobileElement) driver.findElementById("com.lanjinger.choiassociatedpress:id/btn_exit");
        el24.click();

        Thread.sleep(10000);

    }

    @After
    public void tearDown() {
        driver.quit();
    }
}
