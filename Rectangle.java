public class Rectangle implements FigureInterface{
    private double length;
    private  double width;
    private String fillColor;
    private String borderColor;

    Rectangle(double length, double width, String fillColor, String borderColor){
        this.length = length;
        this.width = width;
        this.fillColor = fillColor;
        this.borderColor = borderColor;
    }

    public void result(){
        System.out.println("Периметр прямоугольника: " + calcRectanglePerimeter(this.length, this.width) +
                ", площадь прямоугольника: " + calcRectangleArea(this.length, this.width) + ", цвет фона: " +
                this.fillColor + ", цвет границ прямоугольника: " + this.borderColor);
    }

}
