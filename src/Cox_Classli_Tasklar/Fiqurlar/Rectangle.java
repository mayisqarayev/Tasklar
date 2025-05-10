package Cox_Classli_Tasklar.Fiqurlar;

public class Rectangle extends Shape{

    private Integer width;
    private Integer height;

    public Rectangle() {
    }

    public Rectangle(Integer width, Integer height) {
        this.width = width;
        this.height = height;
    }

    public Integer calculateArea() {
        return this.width * this.height;
    }
}
