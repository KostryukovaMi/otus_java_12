package unit;
import org.junit.Assert;
import org.junit.Test;
import price.PriceApplication;

import java.util.List;
import java.util.ArrayList;
import java.lang.String;



public class PriceApplicationTest {
    @Test
    public void testResult() {
        String scenario = "Тест проверки чтения и вывода строки";
        try {
            List<String> expectedFlow = List.of("Введите число и валюту через пробел или команду \"exit\"",
                    "inputStringMassive вызван впервые",
                    "Ваш ответ: ",
                    "6 рублей",
                    "Введите число и валюту через пробел или команду \"exit\"",
                    "inputStringMassive вызван второй раз",
                    "До пробела введено не число или оно отрицательно",
                    "Введите число и валюту через пробел или команду \"exit\"",
                    "inputStringMassive вызван третий раз",
                    "До пробела введено не число или оно отрицательно",
                    "Введите число и валюту через пробел или команду \"exit\"",
                    "inputStringMassive вызван четвертый раз",
                    "Введено слишком большое число",
                    "Введите число и валюту через пробел или команду \"exit\"",
                    "inputStringMassive вызван пятый раз",
                    "Введена некорректная валюта",
                    "Введите число и валюту через пробел или команду \"exit\"",
                    "inputStringMassive вызван шестой раз");
            List<String> actualFlow = new ArrayList<>();
            IOServiceSpy ioServiceSpy = new IOServiceSpy(actualFlow);
            PriceApplication priceApplication = new PriceApplication(ioServiceSpy);
            priceApplication.run();
            Assert.assertEquals(expectedFlow.size(), actualFlow.size());
            for (int i = 0; i < expectedFlow.size(); i++) {
                Assert.assertEquals(expectedFlow.get(i), actualFlow.get(i));
            }
            System.out.printf("\"%s\" passed %n", scenario);
        } catch (Throwable e) {
            System.err.printf("\"%s\" fails with message \"%s\" %n", scenario, e.getMessage());
        }
    }

}
