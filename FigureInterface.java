public interface FigureInterface {
    default double calcCircleArea(double radius) {
        return Math.PI * Math.pow(radius, 2);
    }

    default double calcCirclePerimeter(double radius) {
        return 2 * Math.PI * radius;
    }

    default double calcRectangleArea(double length, double width) {
        return length * width;
    }

    default double calcRectanglePerimeter(double length, double width) {
        return 2 * (length + width);
    }

    default double calcTriangleArea(double a, double b, double c){
        double p = (a + b + c) / 2;
        return Math.pow((p * (p - a) * (p - b) * (p - c)), 0.5);
    }

    default double calcTrianglePerimeter(double a, double b, double c){
        return  a + b + c;
    }
}
