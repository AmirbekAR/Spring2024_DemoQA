package basic_locators;

import demoqa_tests.BaseTest;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.time.Duration;

public class ByNameDemo extends BaseTest {

    @Test(groups = {"UI", "TC-3"})
    public void demo1() throws InterruptedException {

       helper.browserManager.openURL("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
        demoqaPages.byNameDemoPage.userName.sendKeys("Admin");
        demoqaPages.byNameDemoPage.password.sendKeys("admin123" + Keys.ENTER);
        Thread.sleep(4000);
        String actual = demoqaPages.byNameDemoPage.dashboard.getText();
        String expectedTitle = "Dashboard";
        Assert.assertEquals(actual, expectedTitle);

    }
}
