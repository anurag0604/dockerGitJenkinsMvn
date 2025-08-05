package dockerGitJenkinMvn.demo;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

public class test3 {

	@Test
	public void test13() throws MalformedURLException {
		 
		
		
		DesiredCapabilities dc =  DesiredCapabilities.chrome();
		
		URL url =new URL("http://localhost:4444/wd/hub");
		
		RemoteWebDriver driver = new RemoteWebDriver(url,dc);
		
		driver.get("https://google.com/");
		
		String title = driver.getTitle();
		System.out.println("chrome 2 : "+title);
	}

}
