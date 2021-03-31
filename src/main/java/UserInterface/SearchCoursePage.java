package UserInterface;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class SearchCoursePage extends PageObject {
    public static final Target BUTTON_UC = Target.the("seleccionar la universidad Choucair")
            .located(By.xpath("//div[@cid='universidad']//strong"));
    public static final Target Input_Course = Target.the("buscar curso")
            .located(By.id("coursesearchbox"));
    public static final Target Button_Go = Target.the("buscar el curso")
            .located(By.id("//button[@class='btn btn-secondary]"));
    public static final Target Selec_Course = Target.the("dar clik buscar el curso")
            .located(By.xpath("//h4[contains(text(),'Recursos automatizacion Bancolombia)]"));
    public static final Target Name_Course = Target.the("extraer el nombre del curso")
            .located(By.xpath("//h1[contains(text(),'Cursos de bancolombia')]"));
}
