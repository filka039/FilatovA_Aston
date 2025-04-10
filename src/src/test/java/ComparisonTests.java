import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

public class ComparisonTests {

    @DisplayName("SmokeComparison")
    @ParameterizedTest
    @CsvSource({"1,9999999999999999, -1", "0, -10, 1", "100, 100, 0"})
    public void smokeComparison (String a, String b, int expectedCamparison){
        Assertions.assertEquals(expectedCamparison, Comparison.comparison(a, b));
    }

    @DisplayName("NotNumbersComparison")
    @ParameterizedTest
    @CsvSource({"Z, 2", "100, /"})
    public void notNumbersComparison (String a, String b){
        try{
            Comparison.comparison(a, b);
        } catch (NumberFormatException e){
            Assertions.assertEquals("Одно или два значения не являются целыми числами.", e.getMessage());
            System.out.println(e.getMessage());
        }
    }

    @DisplayName("EmptyField1Comparison")
    @Test
    public void emptyField1Comparison(){
        try{
            Comparison.comparison(null, "345");
        } catch (IllegalArgumentException e) {
            Assertions.assertEquals("Оба поля должны быть заполнены.", e.getMessage());
            System.out.println(e.getMessage());
        }
    }

    @DisplayName("EmptyField2Comparison")
    @Test
    public void emptyField2Comparison(){
        try{
            Comparison.comparison("-167", null);
        } catch (IllegalArgumentException e) {
            Assertions.assertEquals("Оба поля должны быть заполнены.", e.getMessage());
            System.out.println(e.getMessage());
        }
    }
}
