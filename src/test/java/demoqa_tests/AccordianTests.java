package demoqa_tests;

import org.testng.annotations.Test;

public class AccordianTests extends BaseTest {

    @Test()
    public void accordianTest() throws InterruptedException {
        helper.browserManager.openURL("https://demoqa.com/accordian");

        helper.webElementActions.click(demoqaPages.getAccordianPage().loremIpsum);
        helper.webElementActions.scrollToElement(demoqaPages.getAccordianPage().comeFrom);
        Thread.sleep(3000);
        helper.webElementActions.click(demoqaPages.getAccordianPage().comeFrom);
        Thread.sleep(3000);
        helper.webElementActions.click(demoqaPages.getAccordianPage().useIt);
        Thread.sleep(3000);
    }

}
