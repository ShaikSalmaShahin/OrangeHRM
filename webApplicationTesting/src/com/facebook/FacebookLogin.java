package com.facebook;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;


class FacebookLogin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EdgeDriver driver;
		String applicationUrlAddress="https://www.facebook.com/?stype=lo&deoia=1&jlou=Afe0JX2pBItxI9m2qtdwNpl8wL-RJgi86eqvpOh1E9yYUETDSoumJslNuWIb9xvdVL0FFl8018g_W0hwIZ30u2Cxj-uFoiB6tXSWHCJiiA39yA&smuh=17394&lh=Ac9kpgPhWc4GN0uG5Cs";

		// Automating CHrome Browser
		System.setProperty("webdriver.edge.driver", "C:\\Users\\shaik\\OneDrive\\Desktop\\9AmOctBatch\\webApplicationTesting\\browserdriverfiles\\msedgedriver.exe");
		driver = new EdgeDriver();
		System.out.println(" ***** Successfully launched Edge Browser ******* ");

		//Navigating to Facebook Application Url Address
		driver.get(applicationUrlAddress);
		System.out.println(" Sucessfully navigated to Facebook Application ");

		// Validating Facebook Application LogIn Page

		// Identifying the  Email address or phone number Element on the WebPage
		// identifying the Properties of Email address or phone number Element - by inspecting
		// <input type="text" class="inputtext _55r1 _6luy" name="email" id="email" data-testid="royal_email" 
		//placeholder="Email address or phone number" autofocus="1" aria-label="Email address or phone number">

		// id - locator
		// Email address or phone number - selector

		// driver.findElement(By.id("Email address or phone number")).sendKeys("salma");

		//  Email address Property=By.id("Email address or phone number"); // it's a property of an element - Email address or phone number

		String EmailAdressTestData="8374579395";
		By EmailAddressProperty=By.id("email"); // Identifying the property of an element
		// finding an element with the property in the current webpage
		WebElement EmailAddress=driver.findElement(EmailAddressProperty);

		// Operation should be performed on the element - userName
		EmailAddress.sendKeys(EmailAdressTestData);

		// Identifying properties of Password Element
		// <input type="password" class="inputtext _55r1 _6luy _9npi" name="pass" id="pass"
		//data-testid="royal_pass" placeholder="Password" aria-label="Password">

		String passwordTestData="bablumaba3";

		// identify the property of Password Element
		By passwordProperty=By.id("pass");
		// identifying the element password with its property
		WebElement password=driver.findElement(passwordProperty);
		// Performing an operation on the WebElement Password
		password.sendKeys(passwordTestData);


		// <button value="1" class="_42ft _4jy0 _6lth _4jy6 _4jy1 selected _51sy" name="login" 
		//data-testid="royal_login_button" type="submit" id="u_0_c_h7">Log in</button>
		By logInButtonProperty=By.name("login");
		WebElement logInButton=driver.findElement(logInButtonProperty);
		logInButton.click();
		//<image style="height:40px;width:40px" x="0" y="0" height="100%" preserveAspectRatio="xMidYMid slice"
		//width="100%" xlink:href="https://scontent.fhyd1-3.fna.fbcdn.net/v/t1.18169-1/10991287_1388503788129878_2718383922139099025_n.jpg?stp=cp0_dst-jpg_p60x60&amp;_nc_cat=105&amp;ccb=1-7&amp;_nc_sid=2b6aad&amp;_nc_ohc=o3IuXB6-ItgAX8m6e4c&amp;_nc_ht=scontent.fhyd1-3.fna&amp;
		//oh=00_AfBHrpSBgssjtLq0hwtY_fXuXE68KoGCyFKjcniUPgzt-g&amp;oe=65682F0D"></image>

	}

}
