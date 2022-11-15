import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class EdgeUtimateDemo {
    public static void main(String[] args) {
        String baseurl="https://courses.ultimateqa.com/users/sign_in";
        System.setProperty("Webdriver.edge.driver","drivers/msedgedriver.exe");
        WebDriver driver=new EdgeDriver();

        //2)open the URL
        driver.get(baseurl);

        //3)print the tilte of the page
        System.out.println("Print the title of the page"+driver.getTitle());

        //4.Print the current url
        System.out.println("Print the current Url"+driver.getCurrentUrl());
        //5.Print the page source
        System.out.println("Page source is"+driver.getPageSource());

        //6.Enter the email to email field
        WebElement emailidField=driver.findElement(By.id("user[email]"));
        //writing the email id to the field
        emailidField.sendKeys("Poojapatel30163@gmail.com");

        //7.Enter the password to password field
        WebElement passwordField=driver.findElement(By.name("user[password]"));
        //writng the  password to passwrod field
        passwordField.sendKeys("poo12354");

        //  8.Close the browser
        // driver.quit();

    }
}

