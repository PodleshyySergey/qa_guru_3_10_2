import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.byName;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class GoogleTests {

    @Test
    public void testSearch() {
        Configuration.browser="CHROME";
        Configuration.startMaximized=true;
        open("https://google.ru");
        $(byName("q")).setValue("selenide").pressEnter();
        $("html").shouldHave(text("selenide.org"));
    }
}
