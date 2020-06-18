package ModernTestsV1;

import base.BaseModernTest;
import com.applitools.eyes.RectangleSize;
import com.applitools.eyes.selenium.fluent.Target;
import org.testng.annotations.Test;
import pages.GalleryPage;

/*
* Filter for 'Black' shoes. Ensure that there are 2 black shoes and everything works and looks good.
 * */
public class Task2 extends BaseModernTest {

    @Test(testName = "Filter Results")
    public void testFilterResults() {
        GalleryPage galleryPage = new GalleryPage(driver);
        eyes.open(driver, APPLICATION_NAME, "Task 2", new RectangleSize(800, 600));
        galleryPage.open();
        galleryPage.filter("colors", "Black");
        eyes.check(Target.region(galleryPage.product_grid).withName("Filter Results"));
    }
}
