import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.events.EventFiringWebDriver;
import org.testng.annotations.Test;

public class ScrrenShotTest {

	@Test
	public void CreateCustomerTest() throws Throwable {
		WebDriver driver=new FirefoxDriver();
		driver.get("https://amazon.com");
		EventFiringWebDriver edriver=new EventFiringWebDriver(driver);
		File srcImg=edriver.getScreenshotAs(OutputType.FILE);
		File dstFile=new File("./screen.png");
		FileUtils.copyFile(srcImg,dstFile);

	}

}
