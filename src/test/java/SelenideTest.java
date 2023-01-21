import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.Selectors.*;
import static com.codeborne.selenide.Selenide.*;
import static com.codeborne.selenide.Selenide.$;
public class SelenideTest {

    @Test
    void enterpriseLinkRedirectToEnterprisePage() {
        open("https://github.com/");

        $(byText("Solutions")).hover();
        $(byText("Enterprise")).click();
        $("h1").shouldHave(text("Build like the best"));
    }
}
