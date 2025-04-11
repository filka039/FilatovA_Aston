import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class FactorialTests {
    //вычисление факториала
    @DataProvider(name = "dataSmokeFactorial")
    public static Object[][] dataNotNumbersAddiction() {
        return new Object[][]{
                {"1", 1},
                {"3", 6},
                {"10", 3628800},
                {"13", 6227020800l}
        };
    }

    @Test(dataProvider =  "dataSmokeFactorial")
    public void factorialSmoke(String number, long expectedFactorial){
        Assert.assertEquals(expectedFactorial, Factorial.calculate(number));
    }

    @DataProvider(name = "dataNumberLessZero")
    public static Object[][] dataNumberLessZero() {
        return new Object[][]{
                {"-1"},
                {"-1000"},
                {"-99999999"},
        };
    }

    @Test(dataProvider = "dataNumberLessZero")
    public void numberLessZero(String number){
        try{
            Factorial.calculate(number);
        } catch (IllegalArgumentException e) {
            Assert.assertEquals(e.getMessage(), "Введено отрицательное число, факториал не определен.");
        }
    }

    @Test
    public void numberEqualsZero(){
        Assert.assertEquals(Factorial.calculate("0"),1);
    }

    @DataProvider(name = "dataNotIntegerNumber")
    public static Object[][] dataNotIntegerNumber() {
        return new Object[][]{
                {"a"}, {"0.6"}, {"&"}
        };
    }

    @Test(dataProvider = "dataNotIntegerNumber")
    public void notIntegerNumber(String number){
        try{
            Factorial.calculate(number);
        } catch (NumberFormatException e) {
            Assert.assertEquals(e.getMessage(), "Нужно ввести целое число.");
        }
    }

    @Test
    public void emptyField(){
        try{
            Factorial.calculate(null);
        } catch (IllegalArgumentException e) {
            Assert.assertEquals(e.getMessage(),"Поле должно быть заполенено.");
        }
    }


}
