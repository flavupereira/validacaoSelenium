import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TesteModuloTreze {
    private WebDriver navegador;

    @BeforeTest
    public void setUp() {
        navegador = new ChromeDriver();
        navegador.get("https://the-internet.herokuapp.com/login");

    }

    @Test
    public void ChromeTeste() {
        navegador.findElement(By.id("username")).sendKeys("tomsmith");
        navegador.findElement(By.id("password")).sendKeys("SuperSecretPassword!");
        navegador.findElement(By.xpath("/html/body/div[2]/div/div/form/button")).click();

        String palavra = navegador.getPageSource();

        palavra.equalsIgnoreCase("You logged into a secure area!");

    }

    @AfterTest
    public void tearDown() {
        navegador.quit();

    }
}
