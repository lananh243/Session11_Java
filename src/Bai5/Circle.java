package Bai5;

public class Circle implements Colorable{
    private double radius;

    @Override
    public void setColor(String color) {
        System.out.println("Màu của hình tròn là: "+color);
    }
}
