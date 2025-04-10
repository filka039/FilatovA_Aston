import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;


public class FactorialTests {

    @DisplayName("Smoke")
    @ParameterizedTest
    @CsvSource({"1,1","3,6","10, 3628800","13, 6227020800"})
    public void factorialSmoke(String number, long expectedFactorial){
        Assertions.assertEquals(expectedFactorial, Factorial.calculate(number));
    }

    @DisplayName("NumberLessZero")
    @ParameterizedTest
    @CsvSource({"-1,0", "-999, 0", "-50000000, 0", "-5, 0"})
    public void numberLessZero(String number){
        try{
            Factorial.calculate(number);
        } catch (IllegalArgumentException e) {
            Assertions.assertEquals("Введено отрицательное число, факториал не определен.", e.getMessage());
        }
    }

    @DisplayName("NumberEqualsZero")
    @ParameterizedTest
    @CsvSource({"0,1"})
    public void numberEqualsZero(String number, long expectedFactorial){
        Assertions.assertEquals(expectedFactorial, Factorial.calculate(number));
    }

    @DisplayName("NotIntegerNumber")
    @ParameterizedTest
    @CsvSource({"sft", "0.5", "%_", "+"})
    public void notIntegerNumber(String number){
        try{
            Factorial.calculate(number);
        } catch (NumberFormatException e) {
            Assertions.assertEquals("Нужно ввести целое число.", e.getMessage());
        }
    }

    @DisplayName("EmptyField")
    @Test
    public void emptyField(){
        try{
            Factorial.calculate(null);
        } catch (IllegalArgumentException e) {
            Assertions.assertEquals("Поле должно быть заполенено.", e.getMessage());
        }
    }



}
