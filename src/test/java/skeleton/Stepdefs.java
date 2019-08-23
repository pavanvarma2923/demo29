package skeleton;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Stepdefs {
 static WebDriver driver=null;
@Given("Application is launched")
public void application_is_launched() {
    // Write code here that turns the phrase above into concrete actions
    //throw new cucumber.api.PendingException();
 System.setProperty("webdriver.chrome.driver","C:\\Users\\training_h2a.06.15\\Downloads\\OneDrive_2019-08-12\\SeleniumBroDrivers\\chromedriver.exe");
   driver=new ChromeDriver();
   driver.get("http://10.232.237.143:443/TestMeApp/fetchcat.htm");
   driver.manage().window().maximize();
}

@Then("user clicks on SignUp button")
public void user_clicks_on_SignUp_button() {
    // Write code here that turns the phrase above into concrete actions
   // throw new cucumber.api.PendingException();
         driver.findElement(By.linkText("SignUp")).click();
}

@Then("user provides all fields {string} {string} {string} {string} {string} {string} {string} {string} {string} {string}")
public void user_provides_all_fields(String string, String string2, String string3, String string4, String string5, String string6, String string7, String string8, String string9, String string10) {
    // Write code here that turns the phrase above into concrete actions
   // throw new cucumber.api.PendingException();
 driver.findElement(By.name("userName")).sendKeys(string);
 driver.findElement(By.name("firstName")).sendKeys(string2);
 driver.findElement(By.name("lastName")).sendKeys(string3);
 driver.findElement(By.name("password")).sendKeys(string4);
 driver.findElement(By.name("confirmPassword")).sendKeys(string5);
 driver.findElement(By.xpath("//*[@id=\"gender\"]")).click();
 driver.findElement(By.name("emailAddress")).sendKeys(string6);
 driver.findElement(By.name("mobileNumber")).sendKeys(string7);
 driver.findElement(By.name("dob")).sendKeys(string8);
 driver.findElement(By.name("address")).sendKeys(string9);
 Select s=new Select(driver.findElement(By.name("securityQuestion")));
 s.selectByValue("411011");
 driver.findElement(By.name("answer")).sendKeys(string10);

}

@Then("user clicks on Register button")
public void user_clicks_on_Register_button() {
    // Write code here that turns the phrase above into concrete actions
   // throw new cucumber.api.PendingException();
 driver.findElement(By.name("Submit")).click();
 //driver.close();
}

@Given("User has launched the application")
public void user_has_launched_the_application() {
    // Write code here that turns the phrase above into concrete actions
   // throw new cucumber.api.PendingException();
 System.setProperty("webdriver.chrome.driver","C:\\Users\\training_h2a.06.15\\Downloads\\OneDrive_2019-08-12\\SeleniumBroDrivers\\chromedriver.exe");
   driver=new ChromeDriver();
   driver.get("http://10.232.237.143:443/TestMeApp/fetchcat.htm");
   driver.manage().window().maximize();
  
}

@Then("User enters the valid credentials {string} {string}")
public void user_enters_the_valid_credentials(String string, String string2) {
    // Write code here that turns the phrase above into concrete actions
    //throw new cucumber.api.PendingException();
 driver.findElement(By .linkText("SignIn")).click();
 driver.findElement(By.name("userName")).sendKeys(string);
 driver.findElement(By.name("password")).sendKeys(string2);
}

@Then("User clicks on submit button")
public void user_clicks_on_submit_button() {
    // Write code here that turns the phrase above into concrete actions
   // throw new cucumber.api.PendingException();
 driver.findElement(By.name("Login")).click();
}

@Then("User verifies the login status")
public void user_verifies_the_login_status() {
    // Write code here that turns the phrase above into concrete actions
   // throw new cucumber.api.PendingException();
 boolean b=driver.findElement(By .xpath("//*[@id=\"header\"]/div[1]/div/div/div[2]/div/ul/a")).isDisplayed();
 Assert.assertTrue(b);
}

@When("user search on a serach tab")
public void user_search_on_a_serach_tab() {
    // Write code here that turns the phrase above into concrete actions
   // throw new cucumber.api.PendingException();
 

   
 driver.findElement(By .xpath("//input[@id='myInput']")).click();
     
}

@Then("user enter a product name")
public void user_enter_a_product_name() {
    // Write code here that turns the phrase above into concrete actions
   // throw new cucumber.api.PendingException();
 
 driver.findElement(By .xpath("//input[@id='myInput']")).sendKeys("HeadPhone");

 driver.findElement(By.xpath("//input[@value='FIND DETAILS']")).click();
}

@Then("user selects product from dropdown")
public void user_selects_product_from_dropdown() {
    // Write code here that turns the phrase above into concrete actions
    //throw new cucumber.api.PendingException();
 //driver.findElement(By.xpath("/html/body/div[1]/form/input")).click();

 driver.findElement(By.xpath("/html/body/section/div/div/div[2]/div/div/div/div[2]/center/a")).click();
    }

@Then("user adds the product to cart")
public void user_adds_the_product_to_cart() {
    // Write code here that turns the phrase above into concrete actions
   // throw new cucumber.api.PendingException();
 
	driver.findElement(By.xpath("//*[@id=\"header\"]/div[1]/div/div/div[2]/div/a[2]")).click();
   

}

@Then("user does the payment")
public void user_does_the_payment() {
    // Write code here that turns the phrase above into concrete actions
   // throw new cucumber.api.PendingException();
 driver.findElement(By.xpath("//*[@id=\"cart\"]/tfoot/tr[2]/td[5]/a")).click();
 driver.findElement(By.xpath("/html/body/b/div/div/div[1]/div/div[2]/div[3]/div/form[2]/input")).click();
  //click on andhrabank
 WebDriverWait wait=new WebDriverWait(driver,20);
    wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"swit\"]/div[1]/div/label/i")));
    
 driver.findElement(By.xpath("//*[@id=\"swit\"]/div[1]/div/label/i")).click();
 
    //click on continue
    driver.findElement(By .xpath("//*[@id=\"btn\"]")).click();
    //username
    driver.findElement(By .xpath("//*[@id=\"horizontalTab\"]/div[2]/div/div/div/div/form/input[1]")).click();
 driver.findElement(By .xpath("//*[@id=\"horizontalTab\"]/div[2]/div/div/div/div/form/input[1]")).sendKeys("123456");
    //password
   driver.findElement(By .xpath("//*[@id=\"horizontalTab\"]/div[2]/div/div/div/div/form/input[2]")).click();
   driver.findElement(By .xpath("//*[@id=\"horizontalTab\"]/div[2]/div/div/div/div/form/input[2]")).sendKeys("Pass@456");
    //login
    driver.findElement(By .xpath("//*[@id=\"horizontalTab\"]/div[2]/div/div/div/div/form/div/div[3]/input")).click();
    //transactionpassword
 driver.findElement(By .xpath("//*[@id=\"horizontalTab\"]/div[2]/div/div/div/div/form/input")).click();
    driver.findElement(By .xpath("//*[@id=\"horizontalTab\"]/div[2]/div/div/div/div/form/input")).sendKeys("Trans@456");
    //paynow
   driver.findElement(By .xpath("//*[@id=\"horizontalTab\"]/div[2]/div/div/div/div/form/div/div[2]/input")).click();
    String actual=driver.findElement(By .xpath("/html/body/b/section/div/div/div/div[2]/p")).getText();
    String expected="Your order has been confirmed";
    Assert.assertEquals(expected,actual);
    driver.close();
}

@Given("Launch the application")
public void launch_the_application() {
    // Write code here that turns the phrase above into concrete actions
   // throw new cucumber.api.PendingException();
 System.setProperty("webdriver.chrome.driver","C:\\Users\\training_h2a.06.15\\Downloads\\OneDrive_2019-08-12\\SeleniumBroDrivers\\chromedriver.exe");
   driver=new ChromeDriver();
   driver.get("http://10.232.237.143:443/TestMeApp/fetchcat.htm");
   driver.manage().window().maximize();
 
}

@When("user clicks the login")
public void user_clicks_the_login() {
    // Write code here that turns the phrase above into concrete actions
   // throw new cucumber.api.PendingException();
 driver.findElement(By .linkText("SignIn")).click();
}

@Then("user enters credentials")
public void user_enters_credentials() {
    // Write code here that turns the phrase above into concrete actions
    //throw new cucumber.api.PendingException();
 
    driver.findElement(By .name("userName")).sendKeys(Keys.SHIFT,"Lalitha");
    driver.findElement(By .name("password")).sendKeys("password123");
   
}

@Then("clicks on login")
public void clicks_on_login() {
    // Write code here that turns the phrase above into concrete actions
    //throw new cucumber.api.PendingException();
  driver.findElement(By .name("Login")).click();
}

@Then("search a particular product")
public void search_a_particular_product() {
    // Write code here that turns the phrase above into concrete actions
   // throw new cucumber.api.PendingException();
 driver.findElement(By .xpath("//input[@id='myInput']")).click();
 driver.findElement(By .xpath("//input[@id='myInput']")).sendKeys("HeadPhone");
 driver.findElement(By .xpath("//input[@value='FIND DETAILS']")).click();
 
}

@Then("proceed to pay without adding any item to cart")
public void proceed_to_pay_without_adding_any_item_to_cart() {
    // Write code here that turns the phrase above into concrete actions
  //  throw new cucumber.api.PendingException();
 boolean ex=driver.findElement(By .xpath("//*[@id=\"header\"]/div[1]/div/div/div[2]/div/a[2]")).isDisplayed();
    System.out.println(ex);
 Assert.assertTrue(ex);
}

@Then("application does not display the cart icon")
public void application_does_not_display_the_cart_icon() {
    // Write code here that turns the phrase above into concrete actions
  //  throw new cucumber.api.PendingException();
 System.out.println("there is no cart icon");
  
}



}



	
