package Zadatak;

//Napisati program koji na sajtu:
//http://automationpractice.com
//dodaje najmanje 3 proizvoda u cart, nastavlja do cart-a, izbacuje jedan proizvod, a drugom povecava kolicinu za 1.

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Main {
    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "C:\\Users\\tilma\\IdeaProjects\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("http://automationpractice.com");


        WebDriverWait driverWait= new WebDriverWait(driver, Duration.ofSeconds(15));

        WebElement addToChart = driver.findElement(By.xpath("//*[@id=\"homefeatured\"]/li[3]/div/div[2]/div[2]/a[1]/span"));
        addToChart.click();

        driverWait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"layer_cart\"]/div[1]/div[2]/div[4]/span")));

        WebElement x = driver.findElement(By.xpath("//*[@id=\"layer_cart\"]/div[1]/div[1]/span"));
        x.click();



        WebElement addToChart2 = driver.findElement(By.xpath("//*[@id=\"homefeatured\"]/li[7]/div/div[2]/div[2]/a[1]/span"));
        addToChart2.click();

        driverWait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"layer_cart\"]/div[1]/div[2]/div[4]/span")));

        ////*[@id="layer_cart"]/div[1]/div[1]/span

        WebElement x1 = driver.findElement(By.xpath("/html/body/div/div[1]/header/div[3]/div/div/div[4]/div[1]/div[2]/div[4]/span/span"));
        x1.click();


        WebElement addToChart3 = driver.findElement(By.xpath("//*[@id=\"homefeatured\"]/li[3]/div/div[2]/div[2]/a[1]/span"));
        addToChart3.click();


        driverWait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"layer_cart\"]/div[1]/div[2]/div[4]/span")));

        ////*[@id="header"]/div[3]/div/div/div[3]/div/a

        WebElement chart = driver.findElement(By.xpath("//*[@id=\"header\"]/div[3]/div/div/div[3]/div/a"));
        chart.click();

        driverWait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"order_step\"]/li[1]/span")));

        // //*[@id="3_13_0_0"]/i
        Thread.sleep(5000);
        WebElement delete = driver.findElement(By.xpath("//*[@id=\"3_13_0_0\"]/i"));
        delete.click();


        driverWait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"7_34_0_0\"]")));
        // icon-plus

        Thread.sleep(5000);
        WebElement add = driver.findElement(By.xpath("//*[@id=\"cart_quantity_up_7_34_0_0\"]/span/i"));
        add.click();

        Thread.sleep(5000);
        driverWait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"cart_quantity_up_7_34_0_0\"]/span")));

        driver.quit();




    }
}
