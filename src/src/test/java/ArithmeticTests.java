import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

public class ArithmeticTests {

    //сложение
    @DisplayName("SmokeAddiction")
    @ParameterizedTest
    @CsvSource({"1, 2, 3", "0, 99999999999, 99999999999", "-1, -999, -1000"})
    public void smokeAddiction (String a, String b, long expectedSum){
        Assertions.assertEquals(expectedSum, Arithmetic.addition(a, b));
    }

    @DisplayName("NotNumbersAddiction")
    @ParameterizedTest
    @CsvSource({"a, 2", "0, +"})
    public void notNumbersAddiction (String a, String b){
        try{
            Arithmetic.addition(a, b);
        } catch (NumberFormatException e){
            Assertions.assertEquals("Введите число.", e.getMessage());
        }
    }

    @DisplayName("EmptyField1Addiction")
    @Test
    public void emptyField1Addiction(){
        try{
            Arithmetic.addition(null, "9");
        } catch (IllegalArgumentException e) {
            Assertions.assertEquals("Оба поля должны быть заполнены.", e.getMessage());
        }
    }

    @DisplayName("EmptyField2Addiction")
    @Test
    public void emptyField2Addiction(){
        try{
            Arithmetic.addition("-1", null);
        } catch (IllegalArgumentException e) {
            Assertions.assertEquals("Оба поля должны быть заполнены.", e.getMessage());
        }
    }


    //вычитание
    @DisplayName("SmokeSubstraction")
    @ParameterizedTest
    @CsvSource({"1, 2, -1", "0, 999, -999", "-1, -999, 998"})
    public void smokeSubstraction (String a, String b, long expectedDifference){
        Assertions.assertEquals(expectedDifference, Arithmetic.substraction(a, b));
    }

    @DisplayName("NotNumbersSubstraction")
    @ParameterizedTest
    @CsvSource({"a, 2", "0, +"})
    public void smokeSubstraction (String a, String b){
        try{
            Arithmetic.substraction(a, b);
        } catch (NumberFormatException e){
            Assertions.assertEquals("Введите число.", e.getMessage());
        }
    }

    @DisplayName("EmptyField1Substraction")
    @Test
    public void emptyField1Substraction(){
        try{
            Arithmetic.substraction(null, "9");
        } catch (IllegalArgumentException e) {
            Assertions.assertEquals("Оба поля должны быть заполнены.", e.getMessage());
        }
    }

    @DisplayName("EmptyField2Substraction")
    @Test
    public void emptyField2Substraction(){
        try{
            Arithmetic.substraction("9", null);
        } catch (IllegalArgumentException e) {
            Assertions.assertEquals("Оба поля должны быть заполнены.", e.getMessage());
        }
    }


    //деление
    @DisplayName("SmokeDivision")
    @ParameterizedTest
    @CsvSource({"1, 2, 0.5", "0, 999, 0", "100, 4, 25", "345, 100, 3.45"})
    public void smokeDivision (String a, String b, double expectedDivision){
        Assertions.assertEquals(expectedDivision, Arithmetic.division(a, b));
    }

    @DisplayName("NotNumbersDivision")
    @ParameterizedTest
    @CsvSource({"n, 4", "16, -"})
    public void notNumbersDivision (String a, String b){
        try{
            Arithmetic.division(a, b);
        } catch (NumberFormatException e){
            Assertions.assertEquals("Введите число.", e.getMessage());
        }
    }

    @DisplayName("EmptyField1Division")
    @Test
    public void emptyField1Division(){
        try{
            Arithmetic.division(null, "9");
        } catch (IllegalArgumentException e) {
            Assertions.assertEquals("Оба поля должны быть заполнены.", e.getMessage());
        }
    }

    @DisplayName("EmptyField2Division")
    @Test
    public void emptyField2Division(){
        try{
            Arithmetic.division("-1", null);
        } catch (IllegalArgumentException e) {
            Assertions.assertEquals("Оба поля должны быть заполнены.", e.getMessage());
        }
    }

    @DisplayName("DivisionByZero")
    @ParameterizedTest
    @CsvSource({"100, 0", "0, 0"})
    public void divisionByZero (String a, String b){
        try{
            Arithmetic.division(a, b);
        } catch (IllegalArgumentException e){
            Assertions.assertEquals("На ноль делить нельзя. (вообще можно, но тут нельзя=))", e.getMessage());
        }
    }


    //умножение
    @DisplayName("SmokeMultiplication")
    @ParameterizedTest
    @CsvSource({"1, 0, 0.0", "225.3, 2, 450.6", "0, 908, 0", "10, 33.34, 333.4"})
    public void smokeMultiplication (String a, String b, double expectedMultiplication){
        Assertions.assertEquals(expectedMultiplication, Arithmetic.multiplication(a, b));
    }

    @DisplayName("NotNumbersMultiplication")
    @ParameterizedTest
    @CsvSource({"F, 0.34", "245.3, :"})
    public void notNumbersMultiplication (String a, String b){
        try{
            Arithmetic.multiplication(a, b);
        } catch (NumberFormatException e){
            Assertions.assertEquals("Введите число.", e.getMessage());
        }
    }

    @DisplayName("EmptyField1Multiplication")
    @Test
    public void emptyField1Multiplication(){
        try{
            Arithmetic.multiplication(null, "139");
        } catch (IllegalArgumentException e) {
            Assertions.assertEquals("Оба поля должны быть заполнены.", e.getMessage());
        }
    }

    @DisplayName("EmptyField2Multiplication")
    @Test
    public void emptyField2Multiplication(){
        try{
            Arithmetic.multiplication("-1039.48", null);
        } catch (IllegalArgumentException e) {
            Assertions.assertEquals("Оба поля должны быть заполнены.", e.getMessage());
        }
    }

}