public class Main {
    public static void main(String[] args) throws MyArraySizeException, MyArrayDataException {
        String[][] testArray = new String[4][3];

        try {
            arraySizeValidator(testArray);
        } catch (MyArraySizeException e){
            System.out.println(e.getMessage());
        }

        String[][] array = {{"1", "4", "3", "4"},
                            {"-1", "7", "0", "0"},
                            {"4", "4", "999", "123"},
                            {"12", "3", "0", "-8"}};
        int sum = 0;

        try {
            for (int i = 0; i < array.length; i++){
                for (int j = 0; j < array[i].length; j++){
                    char[] chars = array[i][j].toCharArray();
                    for (int a = 0; a < chars.length; a++){
                        if (!Character.isDigit(chars[a]) && chars[a] != '-'){
                            throw new MyArrayDataException("В массиве в ячейке[" + i +"][" + j + "] содержится не" +
                                    " целочисленное число.");
                        }
                    }
                    sum = sum + Integer.parseInt(array[i][j]);
                }
            }
            System.out.println(sum);
        } catch (MyArrayDataException e){
            System.out.println(e.getMessage());
        }


        try{
            int[] ints = new int[3];
            ints[3] = 4;
        } catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Мы вышли за границы массива");
        }
    }


    public static void arraySizeValidator(String[][] array) throws MyArraySizeException {
        if (array.length != 4 || array[0].length != 4){
            throw new MyArraySizeException("Внесен массив неверного размера, необходимо внести массив размерном 4х4");
        }
    }

}