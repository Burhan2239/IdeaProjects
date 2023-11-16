package day04_xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;


public class C01_Xpath {

    public static void main(String[] args) {


        //1- https://testotomasyonu.com/addremove/ adresine gidin
        //2- Add Element butonuna basin
        //3- Delete butonu’nun gorunur oldugunu test edin
        //4- Delete tusuna basin
        //5- “Add/Remove Elements” yazisinin gorunur oldugunu test edin
      

        System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://testotomasyonu.com/addremove/");


        WebElement addElementButton = driver.findElement(By.xpath("//button[text()='Add Element']"));
        addElementButton.click();

        WebElement deleteButton = driver.findElement(By.xpath("//button[text()='Delete']"));
        if (deleteButton.isDisplayed()) {
            System.out.println("Die Schaltfläche Löschen erscheint.");
        } else {
            System.out.println("Die Schaltfläche Löschen ist NICHT sichtbar");
        }

        deleteButton.click();

        WebElement headerText = driver.findElement(By.tagName("h3"));
        if (headerText.isDisplayed() && headerText.getText().equals("Add/Remove Elements")) {
            System.out.println("Der Text Elemente hinzufügen/entfernen ist sichtbar");
        } else {
            System.out.println("Der Text Elemente hinzufügen/entfernen ist NICHT sichtbar.");
        }

        
        driver.quit();
    }
}