import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class ComparisonTests {
    //сравнение
    @DataProvider(name = "dataSmokeComparison")
    public static Object[][]dataSmokeComparison(){
        return new Object[][]{
                {"1","9999999999999999", -1},
                {"0", "-10", 1},
                {"100", "100", 0},
                {"999999999999", "999999999999", 0}
        };
    }

    @Test(dataProvider = "dataSmokeComparison")
    public void smokeComparison (String a, String b, int expectedCamparison){
        Assert.assertEquals(Comparison.comparison(a, b), expectedCamparison);
    }

    @DataProvider(name = "dataNotNumberComparison")
    public static Object[][]dataNotNumberComparison(){
        return new Object[][]{
                {"{","9999999999999999"},
                {"0", "|"},
        };
    }

    @Test(dataProvider = "dataNotNumberComparison")
    public void notNumbersComparison (String a, String b){
        try{
            Comparison.comparison(a, b);
        } catch (NumberFormatException e){
            Assert.assertEquals(e.getMessage(), "Одно или два значения не являются целыми числами.");
            System.out.println(e.getMessage());
        }
    }

    @Test
    public void emptyField1Comparison() {
        try {
            Comparison.comparison(null, "9");
        } catch (IllegalArgumentException e) {
            assertEquals(e.getMessage(), "Оба поля должны быть заполнены.");
        }
    }

    @Test
    public void emptyField2Comparison() {
        try {
            Comparison.comparison("9282", null);
        } catch (IllegalArgumentException e) {
            assertEquals(e.getMessage(), "Оба поля должны быть заполнены.");
        }
    }

}
