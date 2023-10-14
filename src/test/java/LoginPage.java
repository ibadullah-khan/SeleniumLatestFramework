import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.testng.annotations.Test;

public class LoginPage extends BaseTest{

    @Test
    public void test1(){
        driver.get("https://www.google.com");
        driver.findElement(By.name("q")).sendKeys("Ibadullah Khan", Keys.ENTER);
    }
}
