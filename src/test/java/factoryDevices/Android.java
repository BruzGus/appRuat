package factoryDevices;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

public class Android implements IDevice {
    @Override
    public AppiumDriver create() throws MalformedURLException {
        String serverAppium = "http://127.0.0.1:4723/wd/hub";
        //attributes for server appium
        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability("deviceName","HUAWEI MediaPad T5");
        capabilities.setCapability("platformVersion","8.0.0");
        capabilities.setCapability("appPackage","bo.gob.ruat.ruatmovil");
        capabilities.setCapability("appActivity","bo.gob.ruat.ruatmovil.MainActivity");
        capabilities.setCapability("platformName","Android");

        //
        AppiumDriver driver = new AndroidDriver(new URL(serverAppium),capabilities);
        driver.manage().timeouts().implicitlyWait(25, TimeUnit.SECONDS);
        return driver;




    }
}
