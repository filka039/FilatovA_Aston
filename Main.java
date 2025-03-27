import java.util.Arrays;


public class Main {
    public static void main(String[] args) {
        printThreeWords();
        checkSumSign();
        printColor();
        compareNumbers();
        System.out.println(sumBetweenTenAndTwenty(6, 4));
        positiveOrNegative(-1);
        System.out.println(negativeNumber(0));
        printString("String",5);
        System.out.println(leapYear(2024));
        swapZerosAndOnes(new int[]{1, 0, 1, 0, 1, 1, 1});
        fillArray(100);
        method12(new int[]{1,5,3,2,11,4,5,2,4,8,9,1});
        fillArrayDiagonals(5);
        System.out.println(Arrays.toString(fillArray(5, 3)));

    }

    public static void printThreeWords() {
        System.out.print("Orange\n" + "Banana\n" + "Apple\n");
    }

    public static void checkSumSign(){
        int a, b;
        a = 12;
        b = -18;
        if ((a+b) >= 0) {
            System.out.println("Сумма положительная");
        } else {
            System.out.println("Сумма отрицательная");
        }
    }

    public static void printColor(){
        int value = 76;
        if (value <= 0){
            System.out.println("Красный");
        } else if (value > 0 && value <= 100) {
            System.out.println("Желтый");
        } else {
            System.out.println("Зеленый");
        }
    }

    public static void compareNumbers(){
        int a, b;
        a = 99;
        b = 16;
        if (a >= b){
            System.out.println("a >= b");
        } else {
            System.out.println("a < b");
        }
    }

    public static boolean sumBetweenTenAndTwenty(int a, int b){
        return ((a+b) >= 10 && (a+b) <= 20);
    }

    public static void positiveOrNegative(int a){
        if (a >= 0){
            System.out.println("Число:" + a + " положительное");
        } else {
            System.out.println("Число:" + a + " отрицательное");
        }
    }

    public static boolean negativeNumber(int a){
        return a < 0;
    }

    public static void printString(String str, int stringsValue){
        for (int i = 0; i < stringsValue; i++){
            System.out.println(str);
        }
    }

    public static boolean leapYear(int year){
        if (year%400 == 0){
            return true;
        } else if (year%100 == 0) {
            return false;
        } else return year % 4 == 0;
    }

    public static void swapZerosAndOnes(int[] arr){
        for (int i = 0; i < arr.length; i++){
            switch (arr[i]) {
                case 0:
                    arr[i] = 1;
                    break;
                case 1:
                    arr[i] = 0;
                    break;
            }
        }
        System.out.println(Arrays.toString(arr));
    }

    public static void fillArray(int n){
        int [] arr = new int[n];
        int a = 1;
        for (int i = 1; i <101; i++){
            arr[i-1] = a;
            a++;
        }
        System.out.println(Arrays.toString(arr));
    }

    public static void method12(int[] arr){
        for (int i = 0; i < arr.length; i++){
            if (arr[i] < 6){
                arr[i] = arr[i]*2;
            }
        }
        System.out.println(Arrays.toString(arr));
    }

    public static void fillArrayDiagonals(int n){
        int [][] arr = new int [n][n];
        for (int i = 0; i < arr.length; i++){
            for (int j = 0; j < arr[i].length; j++){
                if (i == j || (arr[i].length -1 - j) == i){
                    arr[i][j] = 1;
                } if (j == arr[i].length -1)
                    System.out.println(Arrays.toString(arr[i]));
            }
        }
    }

    public static int[] fillArray(int len, int initialValue){
        int [] arr = new int[len];
        Arrays.fill(arr,initialValue);
        return arr;
    }

}