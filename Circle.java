public class Circle implements FigureInterface {
    private double radius;
    private String fillColor;
    private String borderColor;

    Circle(int radius, String fillColor, String borderColor){
        this.radius = radius;
        this.fillColor = fillColor;
        this.borderColor = borderColor;
    }

    public void result(){
        System.out.println("Длина окружности круга: " + calcCirclePerimeter(this.radius) + ", площадь круга: "
                + calcCircleArea(this.radius) + ", цвет фона: " + this.fillColor + ", цвет границ круга: "
                + this.borderColor);
    }
}
