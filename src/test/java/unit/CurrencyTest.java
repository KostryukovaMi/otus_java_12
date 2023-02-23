package unit;
import org.junit.Assert;
import org.junit.Test;
import price.Currency;

import static org.mockito.ArgumentMatchers.any;
public class CurrencyTest {
    private final Currency currencyRub = Currency.rub;
    private final Currency currencyUsd = Currency.usd;
    private final Currency currencyEuro = Currency.euro;

    @Test
    public void priceRubTest(){
        String scenario = "Тест проверки корректности вывода рублей";
        try {
            String actual = currencyRub.price(678);
            Assert.assertEquals(actual,"678 рублей");

            System.out.printf("\"%s\" passed %n", scenario);
        } catch (Throwable e) {
            System.err.printf("\"%s\" fails with message \"%s\" %n", scenario, e.getMessage());
        }
    }

    @Test
    public void priceUsdTest(){
        String scenario = "Тест проверки корректности вывода долларов";
        try {
            String actual = currencyUsd.price(671);
            Assert.assertEquals(actual,"671 доллар");

            System.out.printf("\"%s\" passed %n", scenario);
        } catch (Throwable e) {
            System.err.printf("\"%s\" fails with message \"%s\" %n", scenario, e.getMessage());
        }
    }

    @Test
    public void priceEuroTest(){
        String scenario = "Тест проверки корректности вывода долларов";
        try {
            String actual = currencyEuro.price(896745);
            Assert.assertEquals(actual,"896745 евро");

            System.out.printf("\"%s\" passed %n", scenario);
        } catch (Throwable e) {
            System.err.printf("\"%s\" fails with message \"%s\" %n", scenario, e.getMessage());
        }
    }

}
