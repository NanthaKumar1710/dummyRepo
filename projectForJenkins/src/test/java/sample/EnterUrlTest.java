package sample;

import org.testng.annotations.Test;

public class EnterUrlTest {
	@Test
	public void navigateToApp() {
		System.out.println("navigate app sucessfully via url");
		String URL = System.getProperty("url");
		String BROWSER = System.getProperty("browser");
		String USERNAME = System.getProperty("username");
		String PASSWORD = System.getProperty("password");
		System.out.println(BROWSER);
		System.out.println(URL);
		System.out.println(USERNAME);
		System.out.println(PASSWORD);
	}

}
