public class Arithmetic {

    public static long addition(String a, String b){
        try{
            if (a == null || b == null){
                throw new IllegalArgumentException("Оба поля должны быть заполнены.");
            } else {
                long result = Long.parseLong(a) + Long.parseLong(b);
                System.out.println("Сумма чисел " + a + " и " + b + " равна " + result);
                return result;
            }
        } catch (NumberFormatException e){
            throw new NumberFormatException("Введите число.");
        }
    }

    public static long substraction(String a, String b){
        try{
            if (a == null || b == null){
                throw new IllegalArgumentException("Оба поля должны быть заполнены.");
            } else {
                long result = Long.parseLong(a) - Long.parseLong(b);
                System.out.println("Разность чисел " + a + " и " + b + " равна " + result);
                return result;
            }
        } catch (NumberFormatException e){
            throw new NumberFormatException("Введите число.");
        }
    }

    public static double division(String a, String b){
        double result;
        try{
            if (a == null || b == null){
                throw new IllegalArgumentException("Оба поля должны быть заполнены.");
            } else if (Double.parseDouble(b) == 0) {
                throw new IllegalArgumentException("На ноль делить нельзя. (вообще можно, но тут нельзя=))");
            } else {
                result = Double.parseDouble(a) / Double.parseDouble(b);
                System.out.println("Результат деления числа " + a + " на число " + b + " равен " + result);
                return result;
            }
        } catch (NumberFormatException e){
            throw new NumberFormatException("Введите число.");
        }
    }

    public static double multiplication(String a, String b){
        double result;
        try{
            if (a == null || b == null){
                throw new IllegalArgumentException("Оба поля должны быть заполнены.");
            } else {
                result = (double) Math.round(Double.parseDouble(a) * Double.parseDouble(b) * 100) / 100;
                System.out.println("Произведение чисел " + a + " и " + b + " равно " + result);
                return result;
            }
        } catch (NumberFormatException e){
            throw new NumberFormatException("Введите число.");
        }
    }

}
