package stepdefinitions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test {
	
	WebDriver driver;

    public static void main(String args[])

    {

        System.setProperty(

            "webdriver.chrome.driver",

            "C:\\Users\\inindc00604\\git\\BharaniCSM\\CSM_Bharani\\Drivers\\chromedriver.exe");

        // Instantiate a ChromeDriver class.

        WebDriver driver = new ChromeDriver();

 

        // Maximize the browser

        driver.manage().window().maximize();

 

        // Launch Website

        driver.get("https://imal.path-solutions.com:8543/omni_web_portal_omnichannel_qc_o19/#/omni-login");

        WebElement userName=driver.findElement(By.xpath("//ion-input[@id='ion-input_username_omni-login']"));

        userName.click();

        userName.sendKeys("rnakad");

        WebElement password=driver.findElement(By.xpath("//ion-input[@id='ion-input_password_omni-login']"));

        password.click();

        password.sendKeys("123");

        WebElement Login=driver.findElement(By.xpath("//ion-label[text()=' LOGIN ']"));

        Login.click();

        

    }

 

}


