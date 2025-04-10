import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;


public class TriangleAreaTests {

    @DisplayName("Smoke")
    @ParameterizedTest
    @CsvSource({"1, 2.5, 2.5, 1.224744871391589", "10, 11, 20, 31.975576617162044", "5, 5, 5, 10.825317547305483",
            "10, 10, 12, 48"})
    public void smoke(String a, String b, String c, double expectedArea){
        Assertions.assertEquals(expectedArea, TriangleArea.calculate(a, b, c));
    }

    @DisplayName("ZeroLength")
    @ParameterizedTest
    @CsvSource({"1, 0, 1", "0, 11, 11", "5, 5, 0"})
    public void zeroLength(String a, String b, String c){
        try {
            TriangleArea.calculate(a, b, c);
        } catch (IllegalArgumentException e){
            Assertions.assertEquals("Длинна стороны треугольника должна быть больше 0.", e.getMessage());
        }
    }

    @DisplayName("WrongLengths")
    @ParameterizedTest
    @CsvSource({"2, 3, 1", "1.1, 22, 11"})
    public void wrongLengths(String a, String b, String c){
        try {
            TriangleArea.calculate(a, b, c);
        } catch (IllegalArgumentException e){
            Assertions.assertEquals("Сумма любых длинн двух сторон треугольника должна быть больше длинны " +
                    "третей стороны.", e.getMessage());
        }
    }

    @DisplayName("LessZeroLength")
    @ParameterizedTest
    @CsvSource({"-1, 2, 3", "3, -2.6, 4", "1, 4, -2"})
    public void lessZeroLength(String a, String b, String c){
        try {
            TriangleArea.calculate(a, b, c);
        } catch (IllegalArgumentException e){
            Assertions.assertEquals("Длинна стороны треугольника должна быть больше 0.", e.getMessage());
        }
    }

    @DisplayName("EmptyField1")
    @Test
    public void emptyField1(){
        try{
            TriangleArea.calculate(null, "1", "2");
        } catch (IllegalArgumentException e) {
            Assertions.assertEquals("Все поля должны быть заполнены", e.getMessage());
        }
    }

    @DisplayName("EmptyField2")
    @Test
    public void emptyField2(){
        try{
            TriangleArea.calculate("1", null, "2");
        } catch (IllegalArgumentException e) {
            Assertions.assertEquals("Все поля должны быть заполнены", e.getMessage());
        }
    }

    @DisplayName("EmptyField3")
    @Test
    public void emptyField3(){
        try{
            TriangleArea.calculate("1", "2", null);
        } catch (IllegalArgumentException e) {
            Assertions.assertEquals("Все поля должны быть заполнены", e.getMessage());
        }
    }

    @DisplayName("NotNumber")
    @ParameterizedTest
    @CsvSource({"a, 5, 4","3, b, 4", "1, 4, %"})
    public void notNumber(String a, String b, String c){
        try {
            TriangleArea.calculate(a, b, c);
        } catch (NumberFormatException e){
            Assertions.assertEquals("Введите числа во все поля.", e.getMessage());
        }
    }

}
