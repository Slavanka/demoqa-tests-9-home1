package guru.qa;

import com.codeborne.selenide.impl.WebElementSelector;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;

import java.io.File;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class FirstTest {
    @Test
    void firstTest() {
        open ("https://demoqa.com/automation-practice-form");
        $("[id=firstName]").setValue("Vitoriia");
        $("[id=lastName]").setValue("Sun");
        $("#userEmail").setValue("IronLady@gmail.com");
        $("[for=gender-radio-1]").click();
        $("[id=userNumber]").setValue("9302764785");
        $("[for=dateOfBirthInput]").click(); //списала с чатика + календарь не готов и дальше тест падает
        $("#subjectsContainer").setValue("test");
        $("#hobbies-checkbox-3").click();
        $("[#upload]").uploadFile(new File("cv.doc")); //списала с чатика
        $("[]").setValue("");
        $("[]").setValue("");
        $("[]").setValue("");

        /* $("[for=dateOfBirthInput]").click(); */
    }
}
