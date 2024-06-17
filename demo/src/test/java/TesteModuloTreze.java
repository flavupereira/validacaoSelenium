import static org.junit.Assert.assertTrue;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
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

        navegador.findElement(By.id("flash"));
        String pageSource = navegador.getPageSource();

        String textToFind = "You logged into a secure area!";

        pageSource = navegador.getPageSource(); // after loading some url through driver.get()
        boolean result = pageSource.contains(textToFind);

        assertTrue(result);

    }

    // @AfterTest
    public void tearDown() {
        navegador.quit();

    }
}
