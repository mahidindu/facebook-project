package objects;

public class Facebook_Candidate_Name {
	WebDriver driver;
	
	public FacebookPage(WebDriver driver) {
		this.driver = driver;
		// driver = d;
		 PageFactory.initElements(driver,this);
		}
	
	By Username_editbox = By.cssSelector("#email");;
	By Password_editbox = By.xpath("//input[@id='pass']");
	By Login_btn = By.name("login");

	public void EnterUsername() {
		driver.findElement(Username_editbox).clear();
		driver.findElement(Username_editbox).sendKeys("Testuser");
	}

	public void EnterPassword() {
		driver.findElement(Password_editbox).clear();
		driver.findElement(Password_editbox).sendKeys("Tester123");
	}

	public void VerifyLogin() {
		driver.findElement(Login_btn).click();
		String title = driver.getTitle();
		assertEquals(title, "Log in to Facebook");

	}
}
