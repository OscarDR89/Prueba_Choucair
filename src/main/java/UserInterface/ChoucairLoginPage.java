package UserInterface;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;


public class ChoucairLoginPage extends PageObject {
    public static final Target LOGIN_BUTTON = Target.the("button that shows us the form to login")
            .located(By.xpath("//div[@class='d-none d-lg-block']//strong[contains(text(),'Log in')]"));
    public static final Target Input_user = Target.the("where do we write the user")
            .located(By.id("Username"));
    public static final Target Input_pasw = Target.the("where do we write the password")
            .located(By.id("Password"));
    public static final Target Enter_button = Target.the("button to confirm login")
            .located(By.xpath("//button[contains(@class,'btn btn-primary)]"));
}
