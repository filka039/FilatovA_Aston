public class Factorial {
    public static long calculate (String a) {
        long result = 1;
        try {
            if (a == null) {
                throw new IllegalArgumentException("Поле должно быть заполенено.");
            } else if (Integer.parseInt(a) > 0) {
                for (int i = 1; i <= Integer.parseInt(a); i++) {
                    result = result * i;
                }
                System.out.printf("Факториал числа %s равен %d\n", a, result);
                return result;
            } else if (Integer.parseInt(a) == 0) {
                System.out.printf("Факториал числа %s равен %d\n", a, 1);
                return 1;
            } else {
                throw new IllegalArgumentException("Введено отрицательное число, факториал не определен.");
            }
        } catch (NumberFormatException e) {
            throw new NumberFormatException("Нужно ввести целое число.");
        }
    }
}
