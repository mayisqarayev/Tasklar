package Cox_Classli_Tasklar.Fiqurlar;

public class Circle extends Shape{

    private Integer radius;
    private final static Double PI = 3.14;

    public Circle(Integer radius) {
        this.radius = radius;
    }

    public Integer calculateArea() {
        return (int)(PI * Math.pow(radius, 2));
    }
}