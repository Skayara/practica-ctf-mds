package es.urjc.etsii.metodologias.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class SeleniumExample {
    public static void main(String[] args) throws Exception {
        var driver = createWebDriver();

        // visitamos una URL en el navegador
        driver.get("https://google.es");

        // Referencia documentacion interactuar con elementos: https://www.selenium.dev/documentation/webdriver/elements/
        // Ejemplo Encuentra todos los elementos de typo <a>
        var links = driver.findElements(By.cssSelector("a"));
        System.out.println(links);

        // Esperamos 10 segundos y cerramos
        Thread.sleep(10_000);
        driver.quit();
    }


    public static WebDriver createWebDriver(){
        // Podemos utilizar tambien Chrome o otros navegadores sin problema
        // Recordad descargar el Driver apropiado para vuestro navegador
        // Para firefox: https://github.com/mozilla/geckodriver/releases
        // Para Chrome: https://chromedriver.chromium.org/downloads

        // Poned el path al driver que quereis utilizar (navegador + sistema operativo) aqui
        // Ejemplo: firefox en macOs
        System.setProperty("webdriver.gecko.driver","src/main/resources/geckodriver-macos64");
        // Ejemplo: Chrome en Windows
        //System.setProperty("webdriver.chrome.driver","C:\\ChromeDriver\\chromedriver.exe");

        // Inicializamos el driver
        var driver = new FirefoxDriver();
        // var driver =  new ChromeDriver();

        // Configuramos el driver en caso de ser necesario, por ahora lo dejamos tal cual
        return driver;
    }

    public static void waitReady(WebDriver driver){
        if(!(driver instanceof JavascriptExecutor)){
            throw new IllegalArgumentException("WebDriver cannot execute Javascript");
        }

        var wait = new WebDriverWait(driver, Duration.ofSeconds(10)); // Timeout after 10 seconds waiting
        wait.until((d) -> ((JavascriptExecutor) d).executeScript("return document.readyState").equals("complete"));
    }

    public static void waitClickable(WebDriver driver, By selector){
        var wait = new WebDriverWait(driver, Duration.ofSeconds(10)); // Timeout after 10 seconds waiting
        wait.until(ExpectedConditions.elementToBeClickable(selector));
    }
}
