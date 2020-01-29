package StepDefination ;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

//import com.sun.tools.javac.util.List;

import cucumber.api.DataTable;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class LoginTest{
	

public static WebDriver driver;

@Given("^user on Test Me App$")
public void Opentestmeapp ()
{
System.setProperty("webdriver.chrome.driver", "C:\\Selenium drivers\\chromedriver.exe");
driver = new ChromeDriver();

driver.get("http://10.232.237.143:443/TestMeApp");
driver.manage().window().maximize();
driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

}

@When("^click on SignUp$")
public void clickonsignup()
{
driver.findElement(By.xpath("//a[@href='RegisterUser.htm']")).click();
}


@And("^enter the username as \"([^\"]*)\"$")
public void enterusernmae(String uname) {
driver.findElement(By.id("userName")).sendKeys(uname);

}

@And("^enter the firstname as \"([^\"]*)\"$")
public void enterfirstname(String firstname) {
driver.findElement(By.id("firstName")).sendKeys(firstname);

}

@And("^enter the lastname as \"([^\"]*)\"$")
public void enterlastname(String lastname) {
driver.findElement(By.id("lastName")).sendKeys(lastname);

}

@And("^enter the password as \"([^\"]*)\"$")
public void enterpassword(String password) {
driver.findElement(By.id("password")).sendKeys(password);

}

@And("^enter the confirmpassword as \"([^\"]*)\"$")
public void enterconfirmpassword(String confirmpassword) {
driver.findElement(By.id("pass_confirmation")).sendKeys(confirmpassword);

}



@And("^enter the gender as \"([^\"]*)\"$")
public void gender(String gender) {
if(gender.equals("female"))
{
driver.findElement(By.xpath("//input[@value='Female']")).click();
}
else if(gender.equals("male"))
{
driver.findElement(By.xpath("//input[@value='Male']")).click();
}


}

@And("^enter the email as \"([^\"]*)\"$")
public void enteremail(String email) {

driver.findElement(By.id("emailAddress")).sendKeys(email);

}



@And("^enter the mobile number as \"([^\"]*)\"$")
public void entermobilenumber(String mobilenumber) {
driver.findElement(By.id("mobileNumber")).sendKeys(mobilenumber);

}

@And("^enter the DOB as \"([^\"]*)\"$")
public void enterDOB(String DOB) {
driver.findElement(By.id("dob")).sendKeys(DOB);

}

@And("^enter the address as \"([^\"]*)\"$")
public void enteraddress(String address) {
driver.findElement(By.id("address")).sendKeys(address);

}

@And("^enter the security question as \"([^\"]*)\"$")
public void entersecurityquestio(String securityquestio) {
WebElement dropdown=driver.findElement(By.name("securityQuestion"));
Select s=new Select (dropdown);
s.selectByIndex(1);

}
@And("^enter the answer as \"([^\"]*)\"$")
public void enteranswer(String answer) {
driver.findElement(By.id("answer")).sendKeys(answer);

}

@Then("^user click on register$")
public void clickregister() {
driver.findElement(By.name("Submit")).click();
}



@Given("^user on TestMeApp$")
public void onapp()
{
	System.setProperty("webdriver.chrome.driver", "C:\\Selenium drivers\\chromedriver.exe");
driver = new ChromeDriver();
driver.get("http://10.232.237.143:443/TestMeApp");
driver.manage().window().maximize();
driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
}
@When("^click on SignIn$")
public void signin() {
driver.findElement(By.xpath("//a[@href='login.htm']")).click();
}

@And("^enters credentials as$")
public void credentials(DataTable dt)
{

List<String> cred = dt.asList(String.class);
driver.findElement(By.name("userName")).sendKeys(cred.get(0));
driver.findElement(By.name("password")).sendKeys(cred.get(1));
}
@Then("^user clicks on login$")
public void clicklogin()
{
driver.findElement(By.name("Login")).click();
}



}
