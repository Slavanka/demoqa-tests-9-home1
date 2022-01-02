package guru.qa;

import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.*;

public class FirstTest {
    @Test
    void firstTest() {
        open ("https://demoqa.com/automation-practice-form");
        //заполняеи поле имя
        $("[id=firstName]").setValue("Vitoriia");

        //заполняеи поле фамилия
        $("[id=lastName]").setValue("Sun");

        // заполняем эл.почту
        $("#userEmail").setValue("IronLady@gmail.com");

        //выбираем пол
        $("[for=gender-radio-1]").click();

        //заполняем тел
        $("[id=userNumber]").setValue("9302764785");

        //открываем календарь
        $("#dateOfBirthInput").click();
        //выбираем месяц
        $(".react-datepicker__month-select").selectOptionByValue("4");
        //выбираем год
        $(".react-datepicker__year-select").selectOptionByValue("1993");
        //выбираем рандомную дату
        $(".react-datepicker__day").click();

        //скролл страницы вниз
        $(byText("Sports")).scrollTo();

        //кликаем на поле с выпадающим списком
        $("#subjectsInput").click();
        //вбиваем букву ,чтобы появился выпадающий список
        $("#subjectsInput").setValue("d");
        //выбираем значение из списка
        $(byText("Hindi")).click();

        //заполняем увлечения
        $("[for=hobbies-checkbox-1]").click();

        //загрузка файла
        $("#uploadPicture").uploadFromClasspath("A33.PNG");

        $("[id=currentAddress]").setValue("Moscow Kremlin"); //пишем адрес
        $("#state").click();
        $(byText("NCR")).click();   //выбираем значение из списка Штат
        $("#city").click();
        $(byText("Noida")).click();   //выбираем значение из списка город
        $("[id=submit]").click();    //кликаем на кнопку Submit



        //Добавляем PageObjects







        // Для истории. Проверка заполнения, вариант в дз №2
//        validation("Student Name","Vitoriia");
//        validation("Student Email","IronLady@gmail.com");
//        validation("Gender","Male");
//        validation("Mobile","9302764785");
//        validation("Date of Birth","April,1993");
//        validation("Subjects","Hindi");
//        validation("Hobbies","Sports");
//        validation("Picture","A33.PNG");
//        validation("Address","Moscow Kremlin");
//        validation("State and City","NCR Noida");
//
//        sleep(20000); //залипание, для проверки теста
   }


    public void validation(String key, String meaning) {
        $(".table-responsive").$(byText(key)).parent().shouldHave(text(meaning));
    }
}

