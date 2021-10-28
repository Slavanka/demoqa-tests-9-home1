package guru.qa;

import com.codeborne.selenide.impl.WebElementSelector;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;

import java.io.File;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.*;
import static com.codeborne.selenide.files.DownloadActions.click;

public class FirstTest {
    @Test
    void firstTest() {
        open ("https://demoqa.com/automation-practice-form");
        $("[id=firstName]").setValue("Vitoriia");     //заполняеи поле имя
        $("[id=lastName]").setValue("Sun");     //заполняеи поле фамилия
        $("#userEmail").setValue("IronLady@gmail.com"); // заполняем эл.почту
        $("[for=gender-radio-1]").click();    //выбираем пол
        $("[id=userNumber]").setValue("9302764785");   //заполняет тел
        $("#dateOfBirthInput").click();   //открываем календарь
        $(".react-datepicker__month-select").selectOptionByValue("4");  //выбираем месяц
        $(".react-datepicker__year-select").selectOptionByValue("1993");  //выбираем год
        $(".react-datepicker__day").click();   //выбираем рандомную дату
        $("#subjectsInput").click();  //кликаем на поле с выпадающим списком
        $("#subjectsInput").setValue("d");  //вбиваем букву ,чтобы появился выпадающий список
        $(byText("Hindi")).click();   //выбираем значение из списка
        $("[for=hobbies-checkbox-1]").click();    //заполняет увлечения


        $("[for=gender-radio-1]").setValue("test");
        $("#hobbies-checkbox-3").click();
        $("[#upload]").uploadFile(new File("cv.doc")); //списала с чатика
        $("[]").setValue("");
        $("[]").setValue("");
        $("[]").setValue("");

        /* $("[for=dateOfBirthInput]").click(); */
    }
}
