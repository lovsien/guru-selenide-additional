import com.codeborne.selenide.Condition;
import org.junit.jupiter.api.Test;
import static com.codeborne.selenide.Selenide.*;

public class DragAndDropTest {

    // Через actions невозможно сделать - драг оказывается на указателе
    @Test
    void actionsDragAndDropTest() {
        open("https://the-internet.herokuapp.com/drag_and_drop");

        actions().moveToElement($("#column-a")).clickAndHold().moveByOffset(10,5)
                .release().perform();
        $("div#column-a header").shouldHave(Condition.text("B"));
    }

    @Test
    void elementTest() {
        open("https://the-internet.herokuapp.com/drag_and_drop");

        $("#column-a").dragAndDropTo("#column-b");
        $("div#column-a header").shouldHave(Condition.text("B"));
    }
}
