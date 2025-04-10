public class Comparison {
    public static long comparison(String a, String b){
        int difference;
        try{
            if ((a == null) || (b == null)) {
                throw new IllegalArgumentException("Оба поля должны быть заполнены.");
            } else {
                difference = Long.compare(Long.parseLong(a), Long.parseLong(b));
                switch (difference) {
                    case 0:
                        System.out.printf("Числа %s и %s равны\n", a, b);
                        return difference;
                    case 1:
                        System.out.printf("Число %s больше числа %s\n", a, b);
                        return difference;
                    case -1:
                        System.out.printf("Число %s меньше числа %s\n", a, b);
                        return difference;
                }
            }
        } catch (NumberFormatException e){
            throw new NumberFormatException("Одно или два значения не являются целыми числами.");
        }
        return difference;
    }
}
