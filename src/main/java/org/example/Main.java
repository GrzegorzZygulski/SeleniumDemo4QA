package org.example;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;
import static org.openqa.selenium.Keys.*;

public class Main {
    public static void main(String[] args) {
        WebDriver driver = new FirefoxDriver(); // WebDriver musi by� bo tylko ta klasa ma metode get()
        driver.get("https://duckduckgo.com/");
        WebElement searchBox = driver.findElement(By.id("search_form_input_homepage"));
        System.out.println("znalazłem element o id: "+searchBox.getAttribute("id"));

        searchBox.click();
        searchBox.sendKeys("linkedin Grzegorz Zygulski");
        searchBox.sendKeys(ENTER);

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10)); // czeka maksymalnie 10 sekund WebElement
        WebElement result =  wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("r1-0"))); // czeka na widoczność elementu o id r1-0
        System.out.println("znalazłem element o id: "+result.getAttribute("class"));
        result.click();

    }
}