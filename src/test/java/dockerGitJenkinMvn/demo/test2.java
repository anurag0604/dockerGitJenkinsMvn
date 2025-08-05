package dockerGitJenkinMvn.demo;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

public class test2 {


	@Test
	public void test12() throws MalformedURLException {
		
		
		DesiredCapabilities dc =  DesiredCapabilities.firefox();
		
		URL url =new URL("http://localhost:4444/wd/hub");
		
		RemoteWebDriver driver = new RemoteWebDriver(url,dc);
		
		driver.get("https://www.youtube.com/");
		
		String title = driver.getTitle();
		System.out.println("firefox : "+title);
	}

}
