import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class SignUpTest {

    /*
    1. Ввести валидное значение zip code
    2. Проверить, что мы оказались на странице с форомой регистрации
    3. Заполнить форму регистрации
    4. Нажать кнопку Register
    5. Проверить, что регистрация выполнена успешно
     */

    @Test
    public void checkSignUpValidData() {
        WebDriver driver = new ChromeDriver();
    }

}
