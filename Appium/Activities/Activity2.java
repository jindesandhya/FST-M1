package Activities;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;
import org.testng.Assert;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;
//import org.springframework.util.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;

public class Activity2 {
    WebDriverWait wait;
    AppiumDriver<MobileElement> driver = null;

    @BeforeTest
    public void setup() throws MalformedURLException {

        // Set the Desired Capabilities
        DesiredCapabilities caps = new DesiredCapabilities();
        caps.setCapability("deviceName", "Pixel4Emulator");
        caps.setCapability("platformName", "android");
        caps.setCapability("automationName", "UiAutomator2");
        caps.setCapability("appPackage", "com.android.chrome");
        caps.setCapability("appActivity", "com.google.android.apps.chrome.Main");
        caps.setCapability("noReset", true);

        // Instantiate Appium Driver
        driver = new AppiumDriver<MobileElement>(new URL("https://www.training-support.net/"), caps);
        wait = new WebDriverWait(driver, 10);
    }

    @Test
    public void testSearchAppium() {
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        driver.get("https://www.training-support.net/");

        String pageTitle = driver.findElementByXPath("//android.view.View[@text='Training Support']").getText();
        System.out.println("Title on Homepage: " + pageTitle);

        MobileElement aboutButton = driver.findElementByXPath("//android.view.View[@content-desc='About Us']");
        aboutButton.click();

        String newPageTitle = driver
                .findElementByXPath("//android.webkit.WebView/android.view.View/android.view.View/android.view.View[2]")
                .getText();

        System.out.println("Title on new page: " + newPageTitle);

        // Assertions
        Assert.assertEquals(pageTitle, "Training Support");
        Assert.assertEquals(newPageTitle, "About Us");
    }

    @AfterTest
    public void tearDown() {
        driver.quit();
    }
}