package cloud.autotests.tests;

import cloud.autotests.helpers.DriverUtils;
import io.qameta.allure.Description;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Selenide.open;
import static com.codeborne.selenide.Selenide.title;
import static io.qameta.allure.Allure.step;
import static org.assertj.core.api.Assertions.assertThat;


public class GeneratedTests extends TestBase {
    @Test
    @Description("Soon to be implemented by you (or QA.GURU engineers)")
    @DisplayName("O'Stin")
    void generatedTest() {
        step("Open https://ostin.com/", () -> {
            step("// todo: just add selenium action");
        });

        step("Click button \"registration\"", () -> {
            step("// todo: just add selenium action");
        });

        step("Windows \"registration\" should be visible", () -> {
            step("// todo: just add selenium action");
        });

        step("Click button \"Мужчины\"", () -> {
            step("// todo: just add selenium action");
        });

        step("Click button \"Верхняя одежда\"", () -> {
            step("// todo: just add selenium action");
        });

        step("Find element \"Куртка с карманами\"", () -> {
            step("// todo: just add selenium action");
        });

        step("Click element \"Куртка с карманами\"", () -> {
            step("// todo: just add selenium action");
        });

        step("Windows have text \"3999\"", () -> {
            step("// todo: just add selenium action");
        });
    }

    @Test
    @Description("Autogenerated test")
    @DisplayName("Page title should have header text")
    void titleTest() {
        step("Open url 'https://ostin.com/'", () ->
            open("https://ostin.com/"));

        step("Page title should have text 'Одежда Остин: женская, мужская и детская коллекции. Интернет-магазин одежды O'STIN: заказать и купить одежду онлайн с доставкой. Цены. Официальный сайт.11'", () -> {
            String expectedTitle = "Одежда Остин: женская, мужская и детская коллекции. Интернет-магазин одежды O'STIN: заказать и купить одежду онлайн с доставкой. Цены. Официальный сайт.11";
            String actualTitle = title();

            assertThat(actualTitle).isEqualTo(expectedTitle);
        });
    }

    @Test
    @Description("Autogenerated test")
    @DisplayName("Page console log should not have errors")
    void consoleShouldNotHaveErrorsTest() {
        step("Open url 'https://ostin.com/'", () ->
            open("https://ostin.com/"));

        step("Console logs should not contain text 'SEVERE'", () -> {
            String consoleLogs = DriverUtils.getConsoleLogs();
            String errorText = "SEVERE";

            assertThat(consoleLogs).doesNotContain(errorText);
        });
    }
}