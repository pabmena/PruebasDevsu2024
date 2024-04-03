import org.openqa.selenium.WebElement;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.util.concurrent.TimeUnit;
import java.time.Duration;

public class TestE2E {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        
        try {
            // Maximizar la ventana del navegador
            driver.manage().window().maximize();
            // Espera implícita para cargar los elementos
            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
            
            // Navega a la página de DemoBlaze
            driver.get("https://www.demoblaze.com/");
            
            // Agrega el primer producto al carrito
            driver.findElement(By.linkText("Phones")).click();
            driver.findElement(By.linkText("Samsung galaxy s6")).click();
            driver.findElement(By.linkText("Add to cart")).click();

            // Espera explícita para la alerta y aceptarla
            WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
            wait.until(ExpectedConditions.alertIsPresent());
            driver.switchTo().alert().accept(); // Aceptar la alerta       
            
            // Navegar nuevamente a la página de DemoBlaze
            driver.get("https://www.demoblaze.com/");
            
            // Agregar el segundo producto al carrito
            driver.findElement(By.linkText("Laptops")).click();
            driver.findElement(By.linkText("Sony vaio i5")).click();
            driver.findElement(By.linkText("Add to cart")).click();

            // Espera explícita para la alerta y aceptarla
            wait.until(ExpectedConditions.alertIsPresent());
            driver.switchTo().alert().accept(); // Aceptar la alerta 
            
            // Visualiza el carrito
            driver.findElement(By.linkText("Cart")).click();
            
            // Completa el formulario de compra
            driver.findElement(By.cssSelector("button[class='btn btn-success']")).click();
            driver.findElement(By.id("name")).sendKeys("John Doe");
            driver.findElement(By.id("country")).sendKeys("USA");
            driver.findElement(By.id("city")).sendKeys("New York");
            driver.findElement(By.id("card")).sendKeys("1234567890123456");
            driver.findElement(By.id("month")).sendKeys("June");
            driver.findElement(By.id("year")).sendKeys("2023");
            driver.findElement(By.xpath("//button[normalize-space()='Purchase']")).click();
            
            // Leer y mostrar el mensaje de confirmación
            WebElement confirmationMessage = driver.findElement(By.cssSelector(".sweet-alert  h2"));
            System.out.println("Confirmación: " + confirmationMessage.getText());
            
            // Cierra el mensaje de confirmación
            driver.findElement(By.cssSelector(".confirm")).click();
            
        } finally {
            // Cierra el navegador al final
            driver.quit();
        }
    }
}


