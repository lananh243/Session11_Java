package Bai5;

public class Rectangle implements Colorable{
    private double width;
    private double height;

    @Override
    public void setColor(String color) {
        System.out.println("Màu của hình chữ nhật là: "+color);
    }
}
