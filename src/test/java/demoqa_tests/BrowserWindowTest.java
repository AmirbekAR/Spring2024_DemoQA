package demoqa_tests;

import org.testng.annotations.Test;

public class BrowserWindowTest extends BaseTest {

    @Test(groups = {"UI", "TC-4"})
    void windowTest() throws InterruptedException {
        helper.getBrowserManager().openURL("https://demoqa.com/browser-windows");
        for (int i = 0; i < 3; i++) {
            webElementActions.click(demoqaPages.getBrowserWindowsPage().newTab);
        }
        helper.getWindowHelper().switchToDefaultWindow();
    }
}
