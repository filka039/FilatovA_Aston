import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class TriangleAreaTests {
    //площадь треугольника
    @DataProvider(name = "dataSmoke")
    public static Object[][] dataSmoke() {
        return new Object[][]{
                {"1", "2.5", "2.5", 1.224744871391589},
                {"10", "11", "20", 31.975576617162044},
                {"5", "5", "5", 10.825317547305483},
                {"10", "10", "12", 48}
        };
    }

    @Test(dataProvider = "dataSmoke")
    public void smoke(String a, String b, String c, double expectedArea){
        Assert.assertEquals(TriangleArea.calculate(a, b, c), expectedArea);
    }

    @DataProvider(name = "dataZeroLength")
    public static Object[][] dataZeroLength() {
        return new Object[][]{
                {"1", "0", "1"},
                {"0", "11", "11"},
                {"5", "6", "0"}
        };
    }

    @Test(dataProvider = "dataZeroLength")
    public void zeroLength(String a, String b, String c){
        try {
            TriangleArea.calculate(a, b, c);
        } catch (IllegalArgumentException e){
            Assert.assertEquals(e.getMessage(), "Длинна стороны треугольника должна быть больше 0.");
        }
    }

    @DataProvider(name = "dataWrongLength")
    public static Object[][] dataWrongLength() {
        return new Object[][]{
                {"2", "3", "1"},
                {"1.1", "11", "22"}
        };
    }

    @Test(dataProvider = "dataWrongLength")
    public void wrongLengths(String a, String b, String c){
        try {
            TriangleArea.calculate(a, b, c);
        } catch (IllegalArgumentException e){
            Assert.assertEquals(e.getMessage(), "Сумма любых длинн двух сторон треугольника должна быть больше длинны " +
                    "третей стороны.");
        }
    }

    @DataProvider(name = "dataLessZeroLength")
    public static Object[][] dataLessZeroLength() {
        return new Object[][]{
                {"-1", "2", "3"},
                {"3", "-2.6", "4"},
                {"1", "4", "-2"}
        };
    }

    @Test(dataProvider = "dataLessZeroLength")
    public void lessZeroLength(String a, String b, String c){
        try {
            TriangleArea.calculate(a, b, c);
        } catch (IllegalArgumentException e){
            Assert.assertEquals(e.getMessage(), "Длинна стороны треугольника должна быть больше 0.");
        }
    }

    @Test
    public void emptyField1() {
        try {
            TriangleArea.calculate(null, "1", "2");
        } catch (IllegalArgumentException e) {
            assertEquals(e.getMessage(), "Все поля должны быть заполнены");
        }
    }

    @Test
    public void emptyField2() {
        try {
            TriangleArea.calculate("1", null, "2");
        } catch (IllegalArgumentException e) {
            assertEquals(e.getMessage(), "Все поля должны быть заполнены");
        }
    }

    @Test
    public void emptyField3() {
        try {
            TriangleArea.calculate("1", "2", null);
        } catch (IllegalArgumentException e) {
            assertEquals(e.getMessage(), "Все поля должны быть заполнены");
        }
    }

    @DataProvider(name = "dataNotNumber")
    public static Object[][] dataNotNumber() {
        return new Object[][]{
                {"a", "3", "1"},
                {"4", "B", "11"},
                {"5", "6", "$"}
        };
    }

    @Test(dataProvider = "dataNotNumber")
    public void notNumber(String a, String b, String c){
        try {
            TriangleArea.calculate(a, b, c);
        } catch (NumberFormatException e){
            Assert.assertEquals(e.getMessage(), "Введите числа во все поля.");
        }
    }


}
