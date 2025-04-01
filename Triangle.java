public class Triangle implements FigureInterface{
    private double a;
    private double b;
    private double c;
    private String fillColor;
    private String borderColor;

    Triangle(double a, double b, double c, String fillColor, String borderColor){
        this.a = a;
        this.b = b;
        this.c = c;
        this.fillColor = fillColor;
        this.borderColor = borderColor;
    }

    public void result(){
        System.out.println("Периметр треугольника: " + calcTrianglePerimeter(this.a, this.b, this.c) + ", площадь треугольника: "
                + calcTriangleArea(this.a, this.b, this.c) + ", цвет фона: " + this.fillColor + ", цвет границ круга: "
                + this.borderColor);
    }

}
