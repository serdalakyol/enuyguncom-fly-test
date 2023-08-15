import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class FlyTest {
    WebDriver driver;

    @BeforeEach
    void setup() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();

    }
    @Test
   void FlyTest(){

        WebDriver driver = new ChromeDriver();
        WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(20));

        driver.get("https://www.enuygun.com/");


        driver.findElement(By.id("OriginInput")).click();
        WebElement inputElement = driver.findElement(By.id("OriginInput"));
        inputElement.clear(); // Metin kutusundaki yazıyı temizler
        driver.findElement(By.id("OriginInput")).sendKeys("Sabiha Gökçen Havalimanı");
        driver.findElement(By.cssSelector(".suggestion_item")).click();


        driver.findElement(By.id("DestinationInput")).click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("DestinationInput")));
        WebElement inputElement1 = driver.findElement(By.id("DestinationInput"));
        inputElement.clear(); // Metin kutusundaki yazıyı temizler
        driver.findElement(By.id("DestinationInput")).sendKeys("Esenboğa Havalimanı");
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("DestinationInput")));
        driver.findElement(By.cssSelector(".city_code")).click();

        driver.findElement(By.id("oneWayCheckbox")).click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("oneWayCheckbox")));
        driver.findElement(By.cssSelector("[aria-label='Pazar, 27 Ağustos 2023'] > .CalendarDay__content")).click();

        driver.findElement(By.xpath("//span[.='Ucuz bilet bul']")).click();


        driver.findElement(By.cssSelector("[data-flight-id='TK7240:P:2023-08-13 08:25:00:15X1'] .action-select-btn")).click();
        driver.findElement(By.cssSelector("[data-no='2'] .radio-input")).click();
        driver.findElement(By.cssSelector(".provider-select-btn")).click();
        driver.findElement(By.cssSelector("[data-flight-id='PC2673:S:2023-08-27 22:05:00:15X1'] .action-select-btn > span")).click();
        driver.findElement(By.xpath("//div[@class='flight-item tr ctx-airline-PC domestic firstClass detail-close']//div[@class='provider-package']/div[contains(.,'Comfort Flex1 Parça Kabin Bagajı20 kg bagajCezasız İade/Değişiklik HakkıSandviç')]")).click();

        //Form Sayfası

        driver.findElement(By.id("contact_email")).click();
        driver.findElement(By.id("contact_email")).sendKeys("seleniumotomasyon@gmail.com");

        driver.findElement(By.id("contact_cellphone")).click();
        driver.findElement(By.id("contact_cellphone")).sendKeys("555555555");

        driver.findElement(By.id("firstName_0")).click();
        driver.findElement(By.id("firstName_0")).sendKeys("Serdal");

        driver.findElement(By.cssSelector(".passengerLastName")).click();
        driver.findElement(By.cssSelector(".passengerLastName")).sendKeys("Akyol");

       // driver.findElement(By.cssSelector(".birthDateDay")).click();


        // Doğum tarihi alanını tıkla
        WebElement birthDateInput = wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector(".birthDate")));
        birthDateInput.click();

        WebElement birthDaySelect = driver.findElement(By.cssSelector(".birthDate")); // Doğum günü select elementini bul
        driver.findElement(By.xpath("//option[.='03']")).click();

        WebElement birthMonthInput = wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector(".birthDateMonth")));
        birthDateInput.click();

        WebElement birthMonthSelect = driver.findElement(By.cssSelector(".birthDateMonth")); // Doğum günü select elementini bul
        driver.findElement(By.cssSelector(".birthDateMonth > [value='03']")).click();


        WebElement birthYearInput = wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector(".birthDateYear")));
        birthDateInput.click();

        WebElement birthYearSelect = driver.findElement(By.cssSelector(".birthDateYear")); // Doğum günü select elementini bul
        driver.findElement(By.xpath("//option[.='2003']")).click();


        driver.findElement(By.cssSelector(".checkbox-xs")).click();

        driver.findElement(By.cssSelector(".select-luggage")).click();
        driver.findElement(By.xpath("//div[@class='select-luggage__collapse']/div[2]")).click();

        driver.findElement(By.cssSelector("[for='additionalLabel-2']")).click();

        driver.findElement(By.cssSelector("[for='additionalLabel-3']")).click();

        driver.findElement(By.id("continue-button")).click();

        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("continue-button")));

        driver.findElement(By.id("continue-button")).click();

    }
    @AfterEach
    void thearDown(){
        driver.close();
    }







}
