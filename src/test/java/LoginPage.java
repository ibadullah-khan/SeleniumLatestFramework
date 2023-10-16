import com.ibad.driver.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.testng.annotations.Test;

public final class LoginPage extends BaseTest{

    private LoginPage(){

    }

    @Test
    public void test1(){
        Driver.driver.findElement(By.name("q")).sendKeys("Ibadullah Khan", Keys.ENTER);
    }
}
