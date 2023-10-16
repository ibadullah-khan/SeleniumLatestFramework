import com.ibad.driver.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.testng.annotations.Test;

public final class HomePage extends BaseTest{
    private HomePage(){

    }
    @Test
    public void test1(){
        Driver.driver.findElement(By.name("q")).sendKeys("Saba Rashid", Keys.ENTER);
    }
}
