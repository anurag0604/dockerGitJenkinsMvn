package dockerGitJenkinMvn.demo;

import java.io.IOException;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

public class startGrid {
	
	@BeforeTest 
	public void start() throws IOException, InterruptedException 
	{
		Runtime.getRuntime().exec("cmd /c start docker_start.bat");
		
		Thread.sleep(25000);
		
		
	}
	
	@AfterTest
	public void stop() throws IOException 
	{
		Runtime.getRuntime().exec("cmd /c start docker_stop.bat");
		
		
	}

}
