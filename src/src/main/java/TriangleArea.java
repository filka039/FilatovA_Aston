public class TriangleArea {
    public static double calculate(String a, String b, String c) {
        double result;
        try {
            if (a == null || b == null || c == null) {
                throw new IllegalArgumentException("Все поля должны быть заполнены");
            } else if (Double.parseDouble(a) <= 0 || Double.parseDouble(b) <= 0 || Double.parseDouble(c) <= 0) {
                throw new IllegalArgumentException("Длинна стороны треугольника должна быть больше 0.");
            } else if ((Double.parseDouble(a) + Double.parseDouble(b)) <= Double.parseDouble(c) ||
                    (Double.parseDouble(a) + Double.parseDouble(c)) <= Double.parseDouble(b) ||
                    (Double.parseDouble(b) + Double.parseDouble(c)) <= Double.parseDouble(a)) {
                throw new IllegalArgumentException("Сумма любых длинн двух сторон треугольника должна быть больше длинны " +
                        "третей стороны.");
            } else {
                double p = (Double.parseDouble(a) + Double.parseDouble(b) + Double.parseDouble(c)) / 2;
                result = Math.pow((p * (p - Double.parseDouble(a)) * (p - Double.parseDouble(b)) * (p - Double.parseDouble(c))), 0.5);
            }
            System.out.printf("Площадь треугольника со сторонами %s, %s, %s равен %f \n", a, b, c, result);
            return result;
        } catch (NumberFormatException e) {
            throw new NumberFormatException("Введите числа во все поля.");
        }
    }
}
