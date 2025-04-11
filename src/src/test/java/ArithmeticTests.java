import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class ArithmeticTests {

    public static class AddictionTests{
        @DataProvider(name = "dataSmokeAddiction")
        public static Object[][] dataSmokeAddiction() {
            return new Object[][]{
                    {"1", "2", 3},
                    {"0", "9999999999", 9999999999l},
                    {"-1", "-999", -1000}
            };
        }

        @Test(dataProvider = "dataSmokeAddiction")
        public void smokeAddiction(String a, String b, long expectedSum) {
            assertEquals(Arithmetic.addition(a, b), expectedSum);
        }

        @DataProvider(name = "dataNotNumbersAddiction")
        public static Object[][] dataNotNumbersAddiction() {
            return new Object[][]{
                    {"a", "3"},
                    {"0255", "%"},
            };
        }

        @Test(dataProvider = "dataNotNumbersAddiction")
        public void notNumbersAddiction(String a, String b) {
            try {
                Arithmetic.addition(a, b);
            } catch (NumberFormatException e) {
                assertEquals(e.getMessage(), "Введите число.");
            }
        }

        @Test
        public void emptyField1Addiction() {
            try {
                Arithmetic.addition(null, "9");
            } catch (IllegalArgumentException e) {
                assertEquals(e.getMessage(), "Оба поля должны быть заполнены.");
            }
        }

        @Test
        public void emptyField2Addiction() {
            try {
                Arithmetic.addition("9282", null);
            } catch (IllegalArgumentException e) {
                assertEquals(e.getMessage(), "Оба поля должны быть заполнены.");
            }
        }
    }




    public static class SubstractionTests {

        //вычитание
        @DataProvider(name = "dataSmokeSubstraction")
        public static Object[][] dataSmokeSubstraction() {
            return new Object[][]{
                    {"1", "2", -1},
                    {"0", "999", -999},
                    {"-1", "-999", 998}
            };
        }

        @Test(dataProvider = "dataSmokeSubstraction")
        public void smokeSubstraction(String a, String b, long expectedDifference) {
            assertEquals(Arithmetic.substraction(a, b), expectedDifference);
        }

        @DataProvider(name = "dataNotNumbersSubstraction")
        public static Object[][] dataNotNumbersSubstraction() {
            return new Object[][]{
                    {"a", "3"},
                    {"0255", "%"},
            };
        }

        @Test(dataProvider = "dataNotNumbersSubstraction")
        public void notNumbersSubstraction (String a, String b){
            try{
                Arithmetic.substraction(a, b);
            } catch (NumberFormatException e){
                assertEquals(e.getMessage(), "Введите число.");
            }
        }

        @Test
        public void emptyField1Substraction() {
            try {
                Arithmetic.substraction(null, "9");
            } catch (IllegalArgumentException e) {
                assertEquals(e.getMessage(), "Оба поля должны быть заполнены.");
            }
        }

        @Test
        public void emptyField2Substraction() {
            try {
                Arithmetic.substraction("9282", null);
            } catch (IllegalArgumentException e) {
                assertEquals(e.getMessage(), "Оба поля должны быть заполнены.");
            }
        }
    }


    public static class DivisionTests {
        //деление
        @DataProvider(name = "dataSmokeDivision")
        public static Object[][] dataSmokeDivision() {
            return new Object[][]{
                    {"1", "2", 0.5},
                    {"0", "999", 0},
                    {"100", "4", 25},
                    {"345", "100", 3.45}
            };
        }

        @Test(dataProvider = "dataSmokeDivision")
        public void smokeDivision (String a, String b, double expectedDivision){
            assertEquals(Arithmetic.division(a, b), expectedDivision);
        }

        @DataProvider(name = "dataNotNumbersDivision")
        public static Object[][] dataNotNumbersDivision() {
            return new Object[][]{
                    {"n", "3"},
                    {"025", "+-"},
            };
        }

        @Test(dataProvider = "dataNotNumbersDivision")
        public void notNumbersDivision (String a, String b){
            try{
                Arithmetic.division(a, b);
            } catch (NumberFormatException e){
                assertEquals(e.getMessage(), "Введите число.");
            }
        }

        @Test
        public void emptyField1Division() {
            try {
                Arithmetic.division(null, "9");
            } catch (IllegalArgumentException e) {
                assertEquals(e.getMessage(), "Оба поля должны быть заполнены.");
            }
        }

        @Test
        public void emptyField2Division() {
            try {
                Arithmetic.division("9282", null);
            } catch (IllegalArgumentException e) {
                assertEquals(e.getMessage(), "Оба поля должны быть заполнены.");
            }
        }

        @DataProvider(name = "dataDivisionByZero")
        public static Object[][] dataDivisionByZero() {
            return new Object[][]{
                {"100", "0"},
                {"0", "29"}
            };
        }

        @Test(dataProvider = "dataDivisionByZero")
        public void divisionByZero (String a, String b){
            try{
                Arithmetic.division(a, b);
            } catch (IllegalArgumentException e){
                assertEquals(e.getMessage(), "На ноль делить нельзя. (вообще можно, но тут нельзя=))");
            }
        }
    }



    public static class MultiplicationTests{
        //умножение
        @DataProvider(name = "dataSmokeMultiplication")
        public static Object[][]dataSmokeMultiplication(){
            return new Object[][]{
                    {"1", "0", 0.0},
                    {"225.3", "2", 450.6},
                    {"0", "908", 0},
                    {"10", "33.34", 333.4}
            };
        }

        @Test(dataProvider = "dataSmokeMultiplication")
        public void smokeMultiplication (String a, String b, double expectedMultiplication){
            assertEquals(expectedMultiplication, Arithmetic.multiplication(a, b));
        }

        @DataProvider(name = "dataNotNumbersMultiplication")
        public static Object[][] dataNotNumbersMultiplication() {
            return new Object[][]{
                    {"A", "3"},
                    {"025", "^"},
            };
        }

        @Test(dataProvider = "dataNotNumbersMultiplication")
        public void notNumbersDivision (String a, String b){
            try{
                Arithmetic.multiplication(a, b);
            } catch (NumberFormatException e){
                assertEquals(e.getMessage(), "Введите число.");
            }
        }

        @Test
        public void emptyField1Multiplication() {
            try {
                Arithmetic.multiplication(null, "9");
            } catch (IllegalArgumentException e) {
                assertEquals(e.getMessage(), "Оба поля должны быть заполнены.");
            }
        }

        @Test
        public void emptyField2Multiplication() {
            try {
                Arithmetic.multiplication("45", null);
            } catch (IllegalArgumentException e) {
                assertEquals(e.getMessage(), "Оба поля должны быть заполнены.");
            }
        }
    }


}